package com.edu.iset4c.formation.SpringBoot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.iset4c.formation.SpringBoot.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	public List<Utilisateur> findByFirstName(String firstName);
}
