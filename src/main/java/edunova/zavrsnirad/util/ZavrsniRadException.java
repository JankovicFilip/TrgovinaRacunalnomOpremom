/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.zavrsnirad.util;

/**
 *
 * @author Admin
 */
public class ZavrsniRadException extends Exception{
    private String poruka;
    
    public ZavrsniRadException(String poruke) {
        super();
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    
    

    
    
    
}
