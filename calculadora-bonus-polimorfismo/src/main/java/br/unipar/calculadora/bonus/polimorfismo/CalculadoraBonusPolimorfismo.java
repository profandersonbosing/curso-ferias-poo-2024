/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.calculadora.bonus.polimorfismo;

import br.unipar.calculadora.bonus.polimorfismo.model.CalculadoraBonus;
import br.unipar.calculadora.bonus.polimorfismo.model.Coladorador;
import br.unipar.calculadora.bonus.polimorfismo.model.Diretor;
import br.unipar.calculadora.bonus.polimorfismo.model.Gerente;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraBonusPolimorfismo {

    public static void main(String[] args) {
        Coladorador colab = new Coladorador();
        colab.setSalario(1500.0);
        
        Gerente gerente = new Gerente();
        gerente.setSalario(10000.0);
        
        Diretor diretor = new Diretor();
        diretor.setSalario(40000.0);
        
        CalculadoraBonus calc = new CalculadoraBonus();
        calc.calcular(colab);
        calc.calcular(gerente);
        calc.calcular(diretor);
        
    }
}
