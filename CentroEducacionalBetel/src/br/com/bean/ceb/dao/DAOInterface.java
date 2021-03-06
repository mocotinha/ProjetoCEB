package br.com.bean.ceb.dao;

public interface DAOInterface<T> {
	public void persist(T obj);
	public void remove(T obj) ;
	public T merge(T obj);
	public void refresh(T obj);
}
