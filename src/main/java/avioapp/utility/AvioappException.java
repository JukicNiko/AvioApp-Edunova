/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.utility;

/**
 *
 * @author PC
 */
public class AvioappException extends Exception {

    private String poruka;

    public AvioappException(String poruka) {
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

}
