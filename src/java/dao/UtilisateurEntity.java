/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Fadwa
 */
@Entity
public class UtilisateurEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * *******************************************
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * ******************************************
     */
    @Column(unique = true, nullable = false)
    private String pseudo;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String motPasse;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String nom;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateNaissance;

    @Column(nullable = false)
    private String sexe;

    @Column(nullable = false)
    private String pays;

    @Lob
    @Column(nullable = true)
    private byte[] photoProfile;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateCreation;

    /**
     * *********************************************************
     */
    /**
     * @param pseudo
     *
     * @param email
     *
     * @param motPasse
     * @param prenom
     * @param nom
     *
     * @param dateNaissance
     *
     * @param sexe
     *
     * @param pays*
     *
     */
     public UtilisateurEntity(){
         
     }
    
    public UtilisateurEntity(String pseudo, String email, String motPasse, String prenom, String nom, Date dateNaissance, String sexe, String pays) {

        this.pseudo = pseudo;
        this.email = email;
        this.motPasse = motPasse;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.pays = pays;
        this.dateCreation = new Date();
    }

    /**
     * *********************************************************
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the motPasse
     */
    public String getMotPasse() {
        return motPasse;
    }

    /**
     * @param motPasse the motPasse to set
     */
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the dateNaissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the pays
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays the pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * @return the photoProfile
     */
    public byte[] getPhotoProfile() {
        return photoProfile;
    }

    /**
     * @param photoProfile the photoProfile to set
     */
    public void setPhotoProfile(byte[] photoProfile) {
        this.photoProfile = photoProfile;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = new Date();
    }

    /**
     * *********************************************************
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UtilisateurEntity)) {
            return false;
        }
        UtilisateurEntity other = (UtilisateurEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.UtilisateurEntity[ id=" + id + " ]";
    }

}
