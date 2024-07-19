/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.poo1907;

import br.unipar.poo1907.heranca.Professor;
import br.unipar.poo1907.heranca.ProcessaPessoa;
import br.unipar.poo1907.heranca.Aluno;
import br.unipar.poo1907.heranca.Pessoa;
import br.unipar.poo1907.polimorfismo.Cachorro;
import br.unipar.poo1907.polimorfismo.Peixe;
import br.unipar.poo1907.polimorfismo.Respirador;
import java.awt.image.RescaleOp;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Poo1907 {

    public static void main(String[] args) {
        
//        Pessoa pessoa = new Pessoa();
//        pessoa.setId(1);
//        pessoa.setNome("Anderson");
//        
//        JOptionPane.showMessageDialog(null, pessoa.toString());
//        
//        ProcessaPessoa process = new ProcessaPessoa();
//        process.processa(pessoa);
//        
//        JOptionPane.showMessageDialog(null, pessoa.toString());
//        
//        Aluno aluno = new Aluno();
//        
//        Professor professor = new Professor();
        
        Cachorro cachorro = new Cachorro();
        cachorro.setId(1);
        cachorro.setNome("Hunter");
        cachorro.setQtdPatas(4);
        
        Peixe peixe = new Peixe();
        peixe.setId(2);
        peixe.setNome("Nemo");
        peixe.setPossuiEscamas(true);
        
        Respirador respirador = new Respirador();
        respirador.respirar(peixe);
        respirador.respirar(cachorro);


    }
}
