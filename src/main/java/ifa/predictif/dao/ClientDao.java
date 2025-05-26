package ifa.predictif.dao;

import ifa.predictif.metier.modele.Client;
import ifa.predictif.metier.modele.ProfilAstral;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class ClientDao {
    public void create(Client client) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        em.persist(client);
    }

    public List<Client> findAll() {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        TypedQuery<Client> query = em.createQuery("SELECT c FROM Client c", Client.class);
        return query.getResultList();
    }

    public Client findById(long id) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        return em.find(Client.class, id);
    }

    public Client findByEmail(String email) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        TypedQuery<Client> query = em.createQuery("SELECT c FROM Client c WHERE c.email = :email", Client.class);
        query.setParameter("email", email);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public ProfilAstral findProfilAstralByClientId(long id) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        TypedQuery<ProfilAstral> query = em.createQuery("SELECT c.profilAstral FROM Client c WHERE c.id = :id", ProfilAstral.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch(NoResultException e) {
            return null;
        }
    }
}
