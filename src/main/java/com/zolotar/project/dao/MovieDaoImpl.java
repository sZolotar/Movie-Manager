package com.zolotar.project.dao;

import com.zolotar.project.entity.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {

    @Autowired
    SessionFactory sessionFactory;

    public MovieDaoImpl() {
    }
    public MovieDaoImpl(SessionFactory factory){
        sessionFactory = factory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public List<Movie> findAll() {
        return getSessionFactory().getCurrentSession().createQuery("SELECT m FROM movie m").list();
    }
}
