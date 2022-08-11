package com.example.Services;

import java.io.Serializable;
import java.util.List;

import com.example.Entities.Base;

public interface BaseService <E extends Base, ID extends Serializable> {
	
	public List<E> getAll()throws Exception;
	public E getOne(ID id) throws Exception;
	public E save(E entity) throws Exception;
	public E update(ID id, E entity) throws Exception;
	public boolean delete(ID id) throws Exception;
}
