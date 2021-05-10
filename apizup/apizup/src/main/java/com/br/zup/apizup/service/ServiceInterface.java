package com.br.zup.apizup.service;

import java.util.List;

import com.br.zup.apizup.model.entities.Endereco;

public interface ServiceInterface<T> {

	T create(T obj);
	T findById(Long id);
	List<T> findAll();
	boolean update(T obj);
	boolean delete(Long id);
	List<Endereco> listarEnderecoPorUsuario(Long id);
}
