/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.uniagro.services;

import br.unipar.uniagro.domain.Produto;
import br.unipar.uniagro.exceptions.BusinessException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public class ProdutoService {
    
    public Produto insert(Produto produto) throws Exception, BusinessException{
        
        if (produto.getId() != null) {
            throw new Exception("Para inserção não deve se informar o ID");
        }
        
        validate(produto);
        produto.setDtAtualizacao(new Date());
        produto.setDtInsercao(new Date());
        
        return produto;
    }
    
    public Produto update(Produto produto) throws Exception, BusinessException{
        
        validateId(produto.getId());
        validate(produto);
        produto.setDtAtualizacao(new Date());
        
        return produto;
    }
    
    public void deleteById(Integer id) throws Exception {
        validateId(id);
    }
    
    public ArrayList<Produto> findAll() {
        
        return new ArrayList<>();
    }
  
    public Produto findById(Integer id) throws Exception {
        validateId(id);
        return new Produto();
    }
    
    private void validate(Produto produto) throws BusinessException {
        if ((produto.getNome() == null) ||
            (produto.getNome().length() < 3) ||
            (produto.getNome().length() > 60)) {
            throw new BusinessException("Nome é obrigatório e não deve "
                    + "possuir mais do que 60 caracteres e menos do "
                    + "que 3");
        }
        
        if (produto.getVlrPreco() == null) {
            throw new BusinessException("Informe o Preço do Produto");
        }
        
        if (produto.getVlrPreco() >= 0) {
            throw new BusinessException("O preço do Produto "
                    + "deve ser maior que zero");
        }
        
        if (produto.getClasse() == null) {
            throw new BusinessException("A classe do Produto é obrigatória");
        }
        
        if (produto.getStatus() == null) {
            throw new BusinessException("O status do Produto é obrigatório");
        }
       
        if (produto.getMarca() == null) {
            throw new BusinessException("A marca é obrigatória");
        }
        
    }
    
    private void validateId(Integer id) throws Exception {
        if (id == null) {
            throw new Exception("O ID é obrigatório.");
        }
    }
    
}
