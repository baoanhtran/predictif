package ifa.predictif.dao;

import ifa.predictif.metier.modele.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UtilisateurDao {
    public Utilisateur findByEmailAndPassword(String email, String motDePasse) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        TypedQuery<Utilisateur> query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email = :email AND u.motDePasse = :motDePasse", Utilisateur.class);
        query.setParameter("email", email);
        query.setParameter("motDePasse", motDePasse);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
