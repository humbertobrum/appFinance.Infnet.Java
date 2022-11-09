package br.edu.infnet.appfinance.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import br.edu.infnet.appfinance.model.domain.Usuario;
import br.edu.infnet.appfinance.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;

	
	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
		
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	

	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {		
		Usuario usuario = usuarioService.login(email, senha);		
		if(usuario != null) {	
			model.addAttribute("user", usuario);
			return "home";
		} else {
			return "login";
		}
	}
	
	
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {	
		status.setComplete();	
		session.removeAttribute("user");	
		return "redirect:/";
	}
	
	
}