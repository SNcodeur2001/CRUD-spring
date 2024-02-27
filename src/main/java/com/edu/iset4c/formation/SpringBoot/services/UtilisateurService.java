package com.edu.iset4c.formation.SpringBoot.services;

import java.util.List;

import com.edu.iset4c.formation.SpringBoot.entities.Utilisateur;

public interface UtilisateurService {
	
	//method CRUD  basiques
	public List<Utilisateur> getAllUtilisateurs();
	public Utilisateur findByIdUtilisateur(Long id);
	public Utilisateur createUtilisateur(Utilisateur utilisateur);
    public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	public void deleteUtilisateur(Long id);

	//methodes avancées

	public List<Utilisateur>findByFirstName(String firstName);
	
}
