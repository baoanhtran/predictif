package ifa.predictif.dao;

import ifa.predictif.metier.modele.Employe;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class EmployeDao {
    public Employe findByEmail(String email) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        TypedQuery<Employe> query = em.createQuery("SELECT e FROM Employe e WHERE e.email = :email", Employe.class);
        query.setParameter("email", email);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public void create(Employe employe) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        em.persist(employe);
    }
}
