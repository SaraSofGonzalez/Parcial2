package com.parcial.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parcial.DTO.UsuarioRegistroDTO;
import com.parcial.servicio.UsuarioServicio;

@Controller 
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
	
	private UsuarioServicio usuarioServicio;
	
	public RegistroUsuarioControlador(UsuarioServicio usuarioServivio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}
	
	@GetMapping 
	public String mostrarFormularioDeRegistro(){
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
	usuarioServicio.save(registroDTO);
	return "redirect:/registro?exito";
	}
}
