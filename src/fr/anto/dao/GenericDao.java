package fr.anto.dao;

import java.util.List;

import fr.anto.entities.Entity;

public interface GenericDao<E extends Entity,K> {
	
    public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(K key);
    public List<E> getAll() ;
    
}