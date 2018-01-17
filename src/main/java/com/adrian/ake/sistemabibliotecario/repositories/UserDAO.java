/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.ake.sistemabibliotecario.repositories;

import com.adrian.ake.sistemabibliotecario.models.Usuario;
import javax.annotation.Resource;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adrianake
 */
@Repository
public class UserDAO implements UserDAOI {

    @Resource
    private SessionFactory sessionFactory;

    @Autowired
    public UserDAO(SessionFactory sessionfactoryr) {
        this.sessionFactory = sessionfactoryr;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        Session session = null;
        if (this.getSessionFactory().getCurrentSession() == null) {
            session = this.getSessionFactory().openSession();
        } else {
            session = this.getSessionFactory().getCurrentSession();
        }
        if (!session.getTransaction().isActive()) {
            session.beginTransaction();
        }
        return session;
    }

    @Override
    public Usuario getUsuarioXCredenciales(String correo, String password) {
        String query = "SELECT * FROM usuario WHERE correo= :correo and password= :password";
        SQLQuery sqlQuery = this.getSession().createSQLQuery(query).addEntity(Usuario.class);
        sqlQuery.setParameter("correo", correo);
        sqlQuery.setParameter("password", password);
        return (Usuario) sqlQuery.uniqueResult();
    }
}
