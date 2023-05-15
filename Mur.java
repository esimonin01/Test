/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devisbatiment;
import java.lang.Math;
/**
 *
 * @author rsow01
 */
public class Mur { // ajouter attribut nomber de porte et nombre de fenetre et demander pour ensuite enlver de la surface totale) 
    int idMur;
    Coin debut;
    Coin C2;
    double hsp;
    
    private static int nextId=0;
    public Mur(Coin debut, Coin fin) {
        if (debut.getX() == fin.getX() && debut.getY() == fin.getY()) {
            Systeme.out.println ("Les deux coins du mur se superposent"); } 
        this.idMur = nextid;
        this.debut = debut;
        this.fin = fin;

    public Mur(int idMur, Coin debut, Coin fin) {
        if (debut.getX() == fin.getX() && debut.getY() == fin.getY()) {
            Systeme.out.println ("Les deux coins du mur se superposent");}
        this.idMur = idMur;
        this.debut = debut;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", debut=" + debut + ", fin=" + fin + '}';
    }

    public Coin getdebut() {
        return debut;
    }

    public Coin getfin() {
        return fin;
    }

    public void setdebut(Coin debut) {
        this.C1 = debut;
    }

    public void setfin(Coin fin) {
        this.fin = fin;
    }
     public double longueur(Coin debut, Coin fin){
        return Math.sqrt(Math.pow((debut.getX()-fin.getX()),2)+Math.pow((debut.getY()-fin.getY(),2));
    }
     public double surface(Mur m){
         return hsp*m.longueur(debut,fin);
         
     }

    public Carrelage(int idRevetement, String designation, boolean pourMur, boolean pourSol, boolean pourPlafond, double prixUnitaire) {
        super(idRevetement, designation, pourMur, pourSol, pourPlafond, prixUnitaire);
    }

    @Override
    public boolean isCompatible(TypeSurface typeSurface) {
        return this.isPourSol() && typeSurface.isPourSol() && !typeSurface.isPourPlafond();
    }

    
    }
    
    

