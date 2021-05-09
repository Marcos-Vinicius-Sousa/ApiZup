package com.br.zup.apizup.model.repositories;

import org.springframework.data.repository.CrudRepository;
import com.br.zup.apizup.model.entities.Usuario;

public interface UsuarioRepository extends
CrudRepository<Usuario, Integer>{

}
