/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Fadwa
 */
public interface UtilisateurDAO {
    
    public void save(UtilisateurEntity u);
    public void update(UtilisateurEntity u);
    public void delete(UtilisateurEntity u);
    
    public UtilisateurEntity isValidUser(String pseudo, String motPasse);
    public UtilisateurEntity findUserByPseudo(String pseudo);
    public UtilisateurEntity findUserByEmail(String email);
    public UtilisateurEntity findUserByName(String name);
    public UtilisateurEntity findUserBySurname(String surname);
    
    public List<UtilisateurEntity> findAll();
    
}
