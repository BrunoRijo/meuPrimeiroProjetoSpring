package br.com.meuPrimeiroProjeto.meuProjetoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

		@GetMapping
		public void welcome() {
			System.out.println("Bem vindo!");
		}
}