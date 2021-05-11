package com.br.zup.apizup.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.zup.apizup.model.entities.Endereco;
import com.br.zup.apizup.model.entities.Usuario;
import com.br.zup.apizup.service.UsuarioService;


@RestController
@RequestMapping("/cadastro/usuario")
public class UsuarioController 
	implements ControllerInterface<Usuario>{

	
	@Autowired
	private UsuarioService service;
	
	@Override
	@PostMapping
	public ResponseEntity<Usuario> post( @RequestBody Usuario obj) {
		service.create(obj);
		return ResponseEntity.ok(obj);
	}
	
	@Override
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	
	@Override
	@GetMapping(value="/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id){
		Usuario _usuario = service.findById(id);
		if(_usuario!= null)
			return ResponseEntity.ok(_usuario);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@Override
	@PutMapping
	public ResponseEntity<?> put(@RequestBody  Usuario usuario){
		if(service.update(usuario)) {
			return ResponseEntity.ok(usuario);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}



	@Override
	@DeleteMapping(value="/{id}")
	public ResponseEntity<?> delete( @PathVariable("id") Long id) {
		if(service.delete(id)) {
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Override
	public ResponseEntity<List<Endereco>> getByUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
	
	
	
}
