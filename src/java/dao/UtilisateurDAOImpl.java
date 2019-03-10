/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fadwa
 */
@Repository
public class UtilisateurDAOImpl implements UtilisateurDAO{

    @PersistenceContext(unitName = "testProjetPU")
    private EntityManager em;

    public EntityManager getEm() {
        return this.em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Transactional
    @Override
    public void save(UtilisateurEntity u) {
         u = em.merge(u);
        em.persist(u);
    }

    @Override
    public void update(UtilisateurEntity u) {
        em.merge(u);
    }

    @Override
    public void delete(UtilisateurEntity u) {
        u= em.merge(u);
        em.remove(u);
    }

    @Override
    public UtilisateurEntity findUserByPseudo(String pseudo) {
        Query query = this.em.createQuery("select u FROM UtilisateurEntity u WHERE u.pseudo = :pseudo");
        query.setParameter("pseudo", pseudo);
        List<UtilisateurEntity> utilisateurs = query.getResultList();
        if (utilisateurs != null && utilisateurs.size() == 1) {
            return utilisateurs.get(0);
        }
        return null;
    }
    
    @Override
    public UtilisateurEntity findUserByEmail(String email) {
        Query query = this.em.createQuery("select u FROM UtilisateurEntity u WHERE u.email = :email");
        query.setParameter("email", email);
        List<UtilisateurEntity> utilisateurs = query.getResultList();
        if (utilisateurs != null && utilisateurs.size() == 1) {
            return utilisateurs.get(0);
        }
        return null;
    }

    @Override
    public UtilisateurEntity findUserByName(String name) {
        Query query = this.em.createQuery("select u FROM UtilisateurEntity u WHERE u.prenom = :name");
        query.setParameter("prenom", name);
        List<UtilisateurEntity> utilisateurs = query.getResultList();
        if (utilisateurs != null && utilisateurs.size() == 1) {
            return utilisateurs.get(0);
        }
        return null;
    }

    @Override
    public UtilisateurEntity findUserBySurname(String surname) {
        Query query = this.em.createQuery("select u FROM UtilisateurEntity u WHERE u.nom = :surname");
        query.setParameter("nom", surname);
        List<UtilisateurEntity> utilisateurs = query.getResultList();
        if (utilisateurs != null && utilisateurs.size() == 1) {
            return utilisateurs.get(0);
        }
        return null;
    }

    @Override
    public List<UtilisateurEntity> findAll() {
        Query query = em.createQuery("SELECT u FROM UtilisateurEntity u");
         List<UtilisateurEntity> utilisateurs = query.getResultList();
        if (utilisateurs != null ) {
            return utilisateurs;
        }
        return null;
    }

    @Override
    public UtilisateurEntity isValidUser(String pseudo, String motPasse) {
        Query query = this.em.createQuery("select u FROM UtilisateurEntity u WHERE u.pseudo = :pseudo and u.motPasse = :motPasse");
        query.setParameter("pseudo", pseudo);
        query.setParameter("motPasse", motPasse);
        List<UtilisateurEntity> utilisateurs = query.getResultList();
        if (utilisateurs != null && utilisateurs.size() == 1) {
            return utilisateurs.get(0);
        }
        return null;
    }
    
}
