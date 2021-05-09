package com.br.zup.apizup.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.br.zup.apizup.model.entities.Endereco;
import com.br.zup.apizup.model.repositories.EnderecoRepository;


@RestController
@RequestMapping("/cadastro/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
	public @ResponseBody Endereco novoEndereco(@Valid Endereco endereco) {
		enderecoRepository.save(endereco);
		return endereco;
	}

}
