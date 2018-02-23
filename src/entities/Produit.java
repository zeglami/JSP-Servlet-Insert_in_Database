/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cours.entities;

/**
 *
 * @author Abdelhamid
 */
public class Produit {
private int id;
private String nom;
private int quantite;

    public Produit() {
    }

    public Produit(int id, String nom, int quantite) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }





}
