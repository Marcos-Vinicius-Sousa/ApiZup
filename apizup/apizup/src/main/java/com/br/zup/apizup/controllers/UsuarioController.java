package com.br.zup.apizup.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.br.zup.apizup.model.entities.Usuario;
import com.br.zup.apizup.model.repositories.UsuarioRepository;


@RestController
@RequestMapping("/cadastro/usuario")
public class UsuarioController {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
	public @ResponseBody Usuario novoUsuario(@Valid Usuario usuario) {
		usuarioRepository.save(usuario);
		return usuario;
	}
	
	
	
	
}
