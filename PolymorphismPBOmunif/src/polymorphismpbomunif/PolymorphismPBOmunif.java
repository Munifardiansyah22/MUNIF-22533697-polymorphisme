/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphismpbomunif;

/**
 *
 * @author MUNIF
 */
public class PolymorphismPBOmunif {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ObjekGeometri obj;
        obj = new PersegiPanjang (15,20);
        System.out.println(obj.getLuas());
        obj = new Segitiga (5,10);
        System.out.println(obj.getLuas());
        obj = new Lingkaran (5);
        System.out.println(obj.getLuas());
        obj = new Kotak (12);
        System.out.println(obj.getLuas());
    }
    
    }
    

