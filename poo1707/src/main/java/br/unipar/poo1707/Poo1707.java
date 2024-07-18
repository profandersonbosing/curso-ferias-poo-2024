/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.poo1707;

import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Poo1707 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo "+nome);
        
        
        String materiaQueMaisGosta = 
                JOptionPane.showInputDialog("Qual disciplina você mais gosta?");
        
        String materiaQueMenosGosta = 
                JOptionPane.showInputDialog("Qual disciplina você mais gosta?");
        
        String resultado = 
                "Disciplina que você precisa estudar mais: "+materiaQueMenosGosta+" \n" +
                "Disciplina que você levará mais tranquilo: "+materiaQueMaisGosta;
        JOptionPane.showMessageDialog(null, resultado);
        
        Camera c = new Camera(); //Instanciando um objeto
        c.setMarca("Canon");
        c.setModelo("XYZ");
        c.setMegapixel(200);
        c.setQtdArmazenamento(2000.0);
        c.setQtdZoom(200);
        c.setStFlash(true);
        c.setStatus(false);
        
        System.out.println(c.toString());
        
        Gato g = new Gato();
        g.setNome("frajola");
        g.setCor("Preto e branco");
        g.setPeso(5.0);
        g.setRaca("SRD");
        g.setGenero("Macho");
        
        System.out.println(g.toString());
        
    }
}
