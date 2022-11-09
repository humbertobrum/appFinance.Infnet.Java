
package br.edu.infnet.appfinance.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfinance.model.domain.Usuario;
import br.edu.infnet.appfinance.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	public void incluir(Usuario item) {
		repository.save(item);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) repository.findAll();
	}	
	
	public Usuario login(String email, String senha) {
		
		Usuario usuario = repository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
	}
}