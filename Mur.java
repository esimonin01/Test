/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdevis;
/**
 *
 * @author eulaliesimonin
 */
import javafx.scene.canvas.GraphicsContext ; 
import javafx.scene.paint.Color; 

public class Mur {
    int idMur;
    Coin debut, fin;
    static int nextID=0;
    int nbp;
    int nbf;
  
    
    
    Mur(Coin dc, Coin fc, int nbp, int nbf)
    {
        this.idMur=nextID ++;
        this.debut=dc;
        this.fin=fc;
        this.nbp=nbp;
        this.nbf=nbf;
    }
    
 
 
    double longueur()
    {
             return  Math.sqrt((this.debut.getX()-this.debut.getX())*(this.fin.getX()-this.debut.getX()) + (this.fin.getY()-this.debut.getY())*(this.fin.getY()-this.debut.getY()));
    
}
    
    
        public double surface(double h)
    {
        return this.longueur() * h;
    }

    public int getIdMur() {
        return idMur;
    }

    public Coin getDebut() {
        return debut;
    }

    public Coin getFin() {
        return fin;
    }

    public int getNbp() {
        return nbp;
    }

    public int getNbf() {
        return nbf;
    }
        
    public void Dessiner (GraphicsContext gc) {
        //Modif couleur et epaisseur des traits
        gc.setStroke(Color.BLACK); 
        gc.setLineWidth(2);
        
        //Dessin des murs
        gc.strokeLine(debut.getX(), debut.getY(), fin.getX(), fin.getY());
        
        
    }  

}
