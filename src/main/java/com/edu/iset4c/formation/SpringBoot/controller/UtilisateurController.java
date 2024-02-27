package com.edu.iset4c.formation.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.iset4c.formation.SpringBoot.entities.Utilisateur;
import com.edu.iset4c.formation.SpringBoot.services.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	public UtilisateurService utilisateurService;

	@GetMapping(path = "/getAllUtilisateurs")
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurService.getAllUtilisateurs();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Utilisateur> findUtilisateurById(@PathVariable Long id) {
		Utilisateur utilisateur = utilisateurService.findByIdUtilisateur(id);

		if (utilisateur==null) {
			return new ResponseEntity<Utilisateur>(HttpStatus.NO_CONTENT);
		}else{
			return new ResponseEntity<Utilisateur>(utilisateur,HttpStatus.OK);
		}
	}
	
	@PostMapping
	public Utilisateur createAllUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.createUtilisateur(utilisateur);
	}

	@PutMapping(path = "/putAllUtilisateurs")
	public Utilisateur updateAllUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.updateUtilisateur(utilisateur);
	}

	@DeleteMapping(path = "/{id}")
	public void supprimerAllUtilisateur(@PathVariable Long id) {
		utilisateurService.deleteUtilisateur(id);
	}

	@GetMapping(path = "/findByFirstName/{firstName}")
	public ResponseEntity<List<Utilisateur>> findUtilisateurByFirstName(@PathVariable String firstName) {
		List<Utilisateur> utilisateurs = utilisateurService.findByFirstName(firstName);

		if (utilisateurs.isEmpty()) {
			return new ResponseEntity<List<Utilisateur>>(HttpStatus.NO_CONTENT);
		}else{
			return new ResponseEntity<List<Utilisateur>>(utilisateurs,HttpStatus.OK);
		}
	}
}
