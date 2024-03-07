package eam.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import eam.apps.models.Juan;
import eam.apps.repository.IJuanRepository;

@Controller
@RequestMapping("/juan")
public class JuanController {
	@Autowired
	private IJuanRepository personaRepository;

	@GetMapping ("/registro")
	private String formularioRegistro (Juan juan) {
		return "formulario";
	}
	
	@PostMapping ("/registro")
	private String registroPersona (Juan juan) {
		System.out.print("Inicio de registro");
		personaRepository.save(juan);
		return "formulario";
	}
	
	

}
