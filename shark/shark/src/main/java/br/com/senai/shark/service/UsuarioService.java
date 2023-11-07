package br.com.senai.shark.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.UsuarioDto;
import br.com.senai.shark.model.Usuario;
import br.com.senai.shark.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
		return usuario.orElseThrow(() -> new UsernameNotFoundException("Usuário ou senha Inválidos"));
	}

	public Usuario salvarUsuario(UsuarioDto usuarioDto) {

		Usuario usuario = new Usuario(usuarioDto);
		return usuarioRepository.save(usuario);

	}

}
