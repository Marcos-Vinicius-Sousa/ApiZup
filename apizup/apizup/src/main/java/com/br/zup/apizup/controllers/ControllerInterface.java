package com.br.zup.apizup.controllers;


import java.util.List;
import org.springframework.http.ResponseEntity;
import com.br.zup.apizup.model.entities.Endereco;

public interface ControllerInterface<T> {

	ResponseEntity<List<T>> getAll();
	ResponseEntity<?> get(Long id);
	ResponseEntity<T> post(T obj);
	ResponseEntity<?> put(T obj);
	ResponseEntity<?> delete(Long id);
	ResponseEntity<List<Endereco>> getByUsuario(Long id);
	
}
