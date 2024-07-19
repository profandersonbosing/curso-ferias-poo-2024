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
public class Cachorro extends Animal {
    
    private int qtdPatas;

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
    
    @Override
    public void respirar(){
        super.respirar();
        JOptionPane.showMessageDialog(null, "Cachorro respirando ar puro da floresta");
    }
    
}
