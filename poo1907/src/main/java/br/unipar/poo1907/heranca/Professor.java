/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.poo1907.heranca;

import br.unipar.poo1907.heranca.Ocupacao;
import br.unipar.poo1907.heranca.Pessoa;

/**
 *
 * @author andersonbosing
 */
public class Professor extends Pessoa {
    
    private String matricula;
    private Double salario;
    private Ocupacao ocupacao;

    public Professor() {
        super();
        this.matricula = "NÃO INFORMADA";
        this.salario = 0.0;
        this.ocupacao = new Ocupacao();
        super.setCpf("NAO INFORMADO");
        super.setNome("NAO INFORMADO");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Ocupacao getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(Ocupacao ocupacao) {
        this.ocupacao = ocupacao;
    }

    @Override
    public String toString() {
        return "Professor{" + "matricula=" + matricula + ", salario=" + salario + ", ocupacao=" + ocupacao + '}';
    }
    
}
