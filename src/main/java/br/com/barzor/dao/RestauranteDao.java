package br.com.barzor.dao;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.barzor.model.Restaurante;
import br.com.barzor.persistance.HibernateUtil;

public class RestauranteDao {
	
		
	public Restaurante getById(UUID id){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Restaurante restaurante = (Restaurante)session.byId(Restaurante.class).load(id);		
		
		session.flush();
		session.close();
		
		return restaurante;
	}
	
	public List<Restaurante> list(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		List<Restaurante> list = session.createQuery("from Restaurante").list();	
		
		session.flush();
		session.close();
		
		return list;
	}
	
	public Restaurante getByName(String name){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Restaurante restaurante = (Restaurante) session.createQuery("from Restaurante where nome = :nome").setParameter("name", name).uniqueResult();		
		
		session.flush();
		session.close();
		
		return restaurante;
	}
	
	public void save(Restaurante restaurante){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(restaurante);
		transaction.commit();
		
		session.flush();
		session.close();
	}
	
	public void delete(Restaurante restaurante){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.delete(restaurante);
		transaction.commit();
		
		session.flush();
		session.close();
	}
	public void update(Restaurante restaurante){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.update(restaurante);
		transaction.commit();
		
		session.flush();
		session.close();
	}

}
