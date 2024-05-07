package com.parcial.servicio;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.parcial.DTO.UsuarioRegistroDTO;
import com.parcial.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService{

	public Usuario save(UsuarioRegistroDTO registroDTO);
}
