/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.poo1907.polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Peixe extends Animal {
    
    private boolean possuiEscamas;

    public boolean isPossuiEscamas() {
        return possuiEscamas;
    }

    public void setPossuiEscamas(boolean possuiEscamas) {
        this.possuiEscamas = possuiEscamas;
    }
    
    @Override
    public void respirar(){
        JOptionPane.showMessageDialog(null, "Peixe respirando no aquario");
    }
    
}
