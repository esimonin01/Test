/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Plafond {
    private Pieces Pieces;
    private double surfaceP;
    private String revetementP;

    public Plafond(Pieces Pieces) {
        this.Pieces = Pieces;
        this.surfaceP = Pieces.calculerSurfaceAuSol();
        this.revetementP = null; // Initialisée à null par défaut, peut être définie ultérieurement
    }

    public double getSurface() {
        return surfaceP;
    }

    public String getFinition() {
        return revetementP;
    }

    public void setFinition(String finition) {
        this.revetementP = revetementP;
    }
}
