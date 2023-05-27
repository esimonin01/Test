/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Sol {
    private Pieces Pieces;
    private double surfaceS;
    private Revetement revetementS;

    public Sol(Pieces Pieces) {
        this.Pieces = Pieces;
        this.surfaceS = Pieces.calculerSurfaceAuSol();
        this.revetementS = null; // Initialisé à null par défaut, peut être associé ultérieurement
    }

    public double getSurface() {
        return surfaceS;
    }

    public Revetement getRevetement() {
        return revetementS;
    }

    public void setRevetement(Revetement revetement) {
        this.revetementS = revetementS;
    }
    
    
    
}
