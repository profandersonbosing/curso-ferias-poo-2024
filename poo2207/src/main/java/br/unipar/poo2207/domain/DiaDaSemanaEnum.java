/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unipar.poo2207.domain;

/**
 *
 * @author andersonbosing
 */
public enum DiaDaSemanaEnum {
    
    SEGUNDA("Segunda-feira", 2), 
    TERCA("Terça-feira", 3),
    QUARTA("Quarta-feira", 4),
    QUINTA("Quinta-feira", 5),
    SEXTA("Sexta-feira", 6),
    SABADO("Sabado", 7),
    DOMINGO("Domingo", 1);
    
    private String descricao;
    private int dia;
    
    private DiaDaSemanaEnum(String descricao, int dia) {
        this.descricao = descricao;
        this.dia = dia;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDia() {
        return dia;
    }
    
}
