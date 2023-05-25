/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projettestzk;

/**
 *
 * @author eulaliesimonin
 */
public class coin {
     int idcoin;
   double x;
   double y;
    private static int nextId=0;
   
   public coin(int idcoin, double x, double y){
       this.idcoin = idcoin;
       this.x = x;
       this.y = y; 
       }
   
    
   public coin(double x, double y){
       this.idcoin = nextId;
       this.x = x;
       this.y = y; 
       }
   
       public String toString(){
           return this.idcoin +""+ this.x+""+this.y;
       }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getIdcoin() {
        return idcoin;
    }
  
       
       
            
             public void setX (double x){
                 this.x = x;
             }
             public void setY (double y){
                 this.y = y;
                    
             }
             
              
}
             public void getY (double y){
                 return y;
             }
             public void setX (double x){
                 this.x = x;
             }
             public void setY (double y){
                 this.y = y;
                    
             }
             
             
   }

