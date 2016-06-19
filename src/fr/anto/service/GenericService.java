package fr.anto.service;

import java.util.List;

import fr.anto.entities.Entity;

/**
 * Generic Service
 */
public interface GenericService<E extends Entity, K> {
	
    public void saveOrUpdate(E entity);

    public List<E> getAll();

    public E get(K id);

    public void add(E entity);

    public void update(E entity);

    public void remove(E entity);
}
