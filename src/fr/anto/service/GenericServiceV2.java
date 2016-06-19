package fr.anto.service;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.anto.entities.Entity;

/**
 * Generic Service
 */
public interface GenericServiceV2<E extends Entity, ID extends Serializable> {
	
	JpaRepository<E, ID> getDao();
	
}
