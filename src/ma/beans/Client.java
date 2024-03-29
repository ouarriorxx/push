/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.beans;

import java.util.Date;

/**
 *
 * @author Lachgar
 */
public class Client {
    private int id;
    private String nom;
    private String prenom;
    private Date date;
    private Service service;

    public Client(String nom, String prenom, Date date, Service service) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.service = service;
    }

    public Client(int id, String nom, String prenom, Date date, Service service) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.service = service;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", service=" + service + '}';
    }

    
   
    
    
    
}
