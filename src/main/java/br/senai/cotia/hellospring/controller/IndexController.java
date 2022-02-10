package br.senai.cotia.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.cotia.hellospring.dao.ConnectionFactory;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public String index() {
		System.out.println("passou aqui"+ ConnectionFactory.conectar());
		return "index";
	}
	
}
