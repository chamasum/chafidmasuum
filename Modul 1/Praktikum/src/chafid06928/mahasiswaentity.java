/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chafid06928;

/**
 *
 * @author cendy
 */
public class mahasiswaentity {
    
    String nama, npm;
    
    public mahasiswaentity(String nama, String npm){
        this.nama=nama;
        this.npm=npm;
   
    }
    
    String getNama(){
        return this.nama;
    }
    
    String getNpm(){
        return this.npm;
    }
    
}
