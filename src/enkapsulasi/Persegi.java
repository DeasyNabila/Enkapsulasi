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
public class Persegi {
    
    private int sisi;
    
    public int getSisi(){
    return sisi;
    
    }
    
    public void setSisi(int sisi){
    this.sisi = sisi;
    
    }
    //konstruktor
    public Persegi(){
    int sisi = 0;
    
    }
   
    public int luas(int sisi){
    return sisi*sisi;
    
    }
    
    public int getLuas(){
    return luas (sisi);
    
    }
}
