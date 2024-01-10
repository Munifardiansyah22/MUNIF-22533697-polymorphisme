/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismpbomunif;

/**
 *
 * @author MUNIF
 */

    public class Kotak extends ObjekGeometri{
    private double sisi;
    
    Kotak(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public String getLuas(){
        return "Luas Persegi = "+ sisi * sisi;
    }
       
}

