/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UtilisateurDAO;
import dao.UtilisateurEntity;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Fadwa
 */
@Component 
public class ConnexionServiceImpl implements ConnexionService{
    @Resource
    UtilisateurDAO user;

    @Override
    public boolean logIn(String pseudo, String password) {
        System.out.println("connexion");
        UtilisateurEntity utilisateur = user.findUserByPseudo(pseudo);
        return utilisateur != null;
    }

    @Override
    public Boolean logOut(UtilisateurEntity user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
