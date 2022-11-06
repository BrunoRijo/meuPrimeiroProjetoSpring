package br.com.meuPrimeiroProjeto.meuProjetoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/users/{username}")
	public User getOneUser(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	
	@DeleteMapping("/users/delete/{id}")
	public void deleteUser (@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PostMapping("/users")
	public void postUser(@RequestBody User user) {
		repository.save(user);
	}
}
