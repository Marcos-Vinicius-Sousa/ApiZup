package com.br.zup.apizup.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.apizup.model.entities.Usuario;

@Repository
public interface UsuarioRepository extends
JpaRepository<Usuario, Long>{

}
