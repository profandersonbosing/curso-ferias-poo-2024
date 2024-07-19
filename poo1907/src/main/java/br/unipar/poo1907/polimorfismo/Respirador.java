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
public class Respirador {
    
    public void respirar(Animal a){
        a.respirar();
        
        if (a instanceof Peixe) {
            JOptionPane.showMessageDialog(null, "Borbulhando");
        }
        
        if (a instanceof Cachorro) {
            JOptionPane.showMessageDialog(null, "Abana o rabo");
        }
    }
    
}
