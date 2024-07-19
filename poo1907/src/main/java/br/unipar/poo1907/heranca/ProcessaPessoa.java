/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.poo1907.heranca;

import br.unipar.poo1907.heranca.Pessoa;

/**
 *
 * @author andersonbosing
 */
public class ProcessaPessoa {
    
    //passagem referencia
    public void processa(Pessoa p) {
        p.setNome("CRIPTOGRAFADO");
    }
    
    //retorno por valor
    public Pessoa processaPessoa(Pessoa p) {
        p.setNome("CRIPTOGRAFADO");
        return p;
    }
    
}
