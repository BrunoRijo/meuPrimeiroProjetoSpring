package br.com.meuPrimeiroProjeto.meuProjetoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meuPrimeiroProjeto.meuProjetoSpring.model.User;
import br.com.meuPrimeiroProjeto.meuProjetoSpring.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return repository.findAll();
	}

}
