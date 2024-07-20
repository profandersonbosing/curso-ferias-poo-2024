/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.calculadora.bonus.polimorfismo.model;

import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */

public class CalculadoraBonus {

    public void calcular(Funcionario funcionario) {
        Double bonus = 0.0;
        
        if (funcionario instanceof Coladorador) {
            bonus = funcionario.getSalario() * 1.1;
        } else if (funcionario instanceof Gerente) {
            bonus = funcionario.getSalario() * 1.25;
        } else if (funcionario instanceof Diretor) {
            bonus = funcionario.getSalario() * 1.50;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel calcular");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Salario com bonus será de "+bonus);
        
    }
    
}
