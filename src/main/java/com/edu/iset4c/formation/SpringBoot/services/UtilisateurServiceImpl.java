package com.edu.iset4c.formation.SpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.iset4c.formation.SpringBoot.entities.Utilisateur;
import com.edu.iset4c.formation.SpringBoot.repositories.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired // Instanciation de classe
	private UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findByIdUtilisateur(Long id) {
		Optional<Utilisateur> utOptional = utilisateurRepository.findById(id);
		if (utOptional.isEmpty()) {
			return null;
		}else {
			return utOptional.get();
		}

	}

	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
		
	}

	

	@Override
	public void deleteUtilisateur(Long id) {
		utilisateurRepository.deleteById(id);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		 Optional<Utilisateur> utOptional = utilisateurRepository.findById(utilisateur.getId());
		    if (utOptional.isPresent()) {
		        return utilisateurRepository.save(utilisateur);
		    } else {
		    	return null;
		    }
		    
	}

	@Override
	public List<Utilisateur> findByFirstName(String firstName) {
		return utilisateurRepository.findByFirstName(firstName);
	}

}
