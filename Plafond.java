/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devisbatiment;

/**
 *
 * @author rsow01
 */
public class Plafond {
    int idPlafond;
    Mur M1;
    Mur M2;
    Mur M3;
    Mur M4;

    public Plafond(int idPlafond, Mur M1, Mur M2, Mur M3, Mur M4) {
        this.idPlafond = idPlafond;
        this.M1 = M1;
        this.M2 = M2;
        this.M3 = M3;
        this.M4 = M4;
    }

    @Override
    public String toString() {
        return "Plafond{" + "idPlafond=" + idPlafond + ", M1=" + M1 + ", M2=" + M2 + ", M3=" + M3 + ", M4=" + M4 + '}';
    }

    public Mur getM1() {
        return M1;
    }

    public void setM1(Mur M1) {
        this.M1 = M1;
    }

    public Mur getM2() {
        return M2;
    }

    public void setM2(Mur M2) {
        this.M2 = M2;
    }

    public Mur getM3() {
        return M3;
    }

    public void setM3(Mur M3) {
        this.M3 = M3;
    }

    public Mur getM4() {
        return M4;
    }

    public void setM4(Mur M4) {
        this.M4 = M4;
    }
    
    public double longueur(){
        return Math.srgt(Math.pow[debut.getX], idPlafond)[]);
    }
    
    
    public Plafond(int idRevetement, String designation, boolean pourMur, boolean pourSol, boolean pourPlafond, double prixUnitaire) {
        super(idRevetement, designation, pourMur, pourSol, pourPlafond, prixUnitaire);
    }

    @Override
    public boolean isCompatible(TypeSurface typeSurface) {
        return this.isPourPlafond() && !typeSurface.isPourSol();
    }
}
   
    
}



