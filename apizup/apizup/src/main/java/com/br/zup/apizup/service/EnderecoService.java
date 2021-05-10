package com.br.zup.apizup.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.zup.apizup.model.entities.Endereco;
import com.br.zup.apizup.model.repositories.EnderecoRepository;

@Service
public class EnderecoService 
	implements ServiceInterface<Endereco>{
	
	@Autowired
	private EnderecoRepository repository;

	@Override
	public Endereco create(Endereco obj) {
		repository.save(obj);
		return obj;
	}

	public List<Endereco> listarEnderecoPorUsuario(Long id) {
		return repository.listarEnderecoPorUsuario(id);
	}

	@Override
	public List<Endereco> findAll() {
		return  repository.findAll();
	}

	@Override
	public boolean update(Endereco obj) {
		if(repository.existsById(obj.getId())) {
			repository.save(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
			return false;
		}

	@Override
	public Endereco findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
