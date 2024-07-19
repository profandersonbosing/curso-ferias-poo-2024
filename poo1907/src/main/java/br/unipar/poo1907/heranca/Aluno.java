/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.poo1907.heranca;

/**
 *
 * @author andersonbosing
 */
public class Aluno extends Pessoa {
    
    private String registroAcademico;
    private String carteiraEstudantil;
    private Curso curso;

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCarteiraEstudantil() {
        return carteiraEstudantil;
    }

    public void setCarteiraEstudantil(String carteiraEstudantil) {
        this.carteiraEstudantil = carteiraEstudantil;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "registroAcademico=" + registroAcademico + ", carteiraEstudantil=" + carteiraEstudantil + ", curso=" + curso + '}';
    }
    
}
