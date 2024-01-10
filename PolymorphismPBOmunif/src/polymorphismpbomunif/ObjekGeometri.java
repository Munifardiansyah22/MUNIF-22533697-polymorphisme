/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismpbomunif;

/**
 *
 * @author MUNIF
 */
public class ObjekGeometri {
   
    private String Jenis;
    private String luas;
    private String color = "red";
    
    ObjekGeometri(){
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return this.color;    
    }
    public String getLuas(){
        return luas;
    }
    
}

