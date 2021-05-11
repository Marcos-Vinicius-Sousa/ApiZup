package com.br.zup.apizup.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.zup.apizup.model.entities.Endereco;
import com.br.zup.apizup.service.EnderecoService;


@RestController
@RequestMapping("/cadastro/endereco")
public class EnderecoController 
	implements ControllerInterface<Endereco>{
	
	@Autowired
	private EnderecoService service;
	
	@Override
	@PostMapping
	public ResponseEntity<Endereco> post(@RequestBody Endereco obj) {
		service.create(obj);
		return ResponseEntity.ok(obj);
	}

	@Override
	@GetMapping(value="/enderecos/{codigo}")
	public ResponseEntity<List<Endereco>> getByUsuario(
											@PathVariable("codigo")  Long codigo){
		return ResponseEntity.ok(service.listarEnderecoPorUsuario(codigo));
	}
	
	@Override
	@GetMapping
	public ResponseEntity<List<Endereco>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	

	@Override
	@DeleteMapping(value="/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		if(service.delete(id)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Override
	public ResponseEntity<?> put(@RequestBody Endereco obj) {
		if(service.update(obj)) {
			return ResponseEntity.ok(obj);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Override
	public ResponseEntity<?> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
