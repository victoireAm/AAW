/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UtilisateurEntity;

/**
 *
 * @author Fadwa
 */
public interface ConnexionService {
    
    public boolean logIn(String pseudo, String password);
    public Boolean logOut(UtilisateurEntity user);
}
