package com.br.zup.apizup.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.zup.apizup.model.entities.Endereco;
import com.br.zup.apizup.model.entities.Usuario;
import com.br.zup.apizup.model.repositories.UsuarioRepository;

@Service
public class UsuarioService 
implements ServiceInterface<Usuario>{

	@Autowired
	private UsuarioRepository repository;

	@Override
	public Usuario create(Usuario obj) {
		repository.save(obj);
		return obj;
	}

	@Override
	public Usuario findById(Long id) {
		Optional<Usuario> _usuario = repository.findById(id);
		return _usuario.orElse(null);
	}

	@Override
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@Override
	public boolean update(Usuario obj) {
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
	public List<Endereco> listarEnderecoPorUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
