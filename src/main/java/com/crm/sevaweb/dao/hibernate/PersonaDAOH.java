/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.dao.hibernate;

import com.crm.sevaweb.dao.PersonaDAO;
import com.crm.sevaweb.model.Persona;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rtorres
 */
public class PersonaDAOH extends BaseHibernateDAO implements PersonaDAO {

    @Override
    public List<Persona> all() {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return criteria.list();
    }

    @Override
    public Persona find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", id));
        return (Persona) criteria.uniqueResult();
    }

    @Override
    public void save(Persona t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Persona t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Persona t) {
        this.getSession().delete(t);
    }
}
