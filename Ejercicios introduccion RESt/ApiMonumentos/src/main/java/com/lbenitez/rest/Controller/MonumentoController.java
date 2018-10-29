package com.lbenitez.rest.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lbenitez.rest.clases.Monumento;
import com.lbenitez.rest.exception.MonumentoNotFoundException;
import com.lbenitez.rest.repository.MonumentoRepository;

public class MonumentoController {

	@Autowired
	private MonumentoRepository repository;
	
	@GetMapping("/monumento")
	public List<Monumento> all() {
		return repository.findAll();
	}

	
	@PostMapping("/monumento")
	public ResponseEntity<?> newMonumento(@RequestBody Monumento newMonumento) {
		Monumento m = repository.save(newMonumento);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(m.getId()).toUri();
		
		return ResponseEntity
				.created(location)
				.body(m);
	}
	
	@GetMapping("/monumento/{id}")
	public Monumento one(@PathVariable Long id) {

		return repository.findById(id)
			.orElseThrow(() -> new MonumentoNotFoundException(id));
	}

	@PutMapping("/monumento/{id}")
	public ResponseEntity<?> replaceEmployee(@RequestBody Monumento newMonumento, @PathVariable Long id) {

		Monumento updated = repository.findById(id)
			.map(monumento -> {
				monumento.setCodeCountry(newMonumento.getCodeCountry());
				monumento.setNameCountry(newMonumento.getNameCountry());
				monumento.setNameCity(newMonumento.getNameCity());
				monumento.setLatiLongi(newMonumento.getLatiLongi());
				monumento.setNameMonument(newMonumento.getNameMonument());
				monumento.setDescriptionMonument(newMonumento.getDescriptionMonument());
				monumento.setPhoto(newMonumento.getPhoto());
				return repository.save(monumento);
			})
			.orElseGet(() -> {
				newMonumento.setId(id);
				return repository.save(newMonumento);
			});
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(updated.getId()).toUri();
		
		return ResponseEntity
				.created(location)
				.body(updated);
		
	}

	
	@DeleteMapping("/monumento/{id}")
	public ResponseEntity<?> deleteMonumento(@PathVariable Long id) {
		repository.deleteById(id);

		return ResponseEntity.noContent().build();
	}

	
}
