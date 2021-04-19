/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author MOKLET-1
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi p = new Persegi();
        p.setSisi(5);
        
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas Persegi : " + p.getLuas());
    }
    
}
