/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.poo1707;

/**
 *
 * @author andersonbosing
 */
public class Camera {
    
    private String marca;
    private String modelo;
    private Integer megapixel;
    private Boolean stFlash;
    private Boolean status;
    private Double qtdArmazenamento;
    private Integer qtdZoom;
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(Integer megapixel) {
        this.megapixel = megapixel;
    }

    public Boolean getStFlash() {
        return stFlash;
    }

    public void setStFlash(Boolean stFlash) {
        this.stFlash = stFlash;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getQtdArmazenamento() {
        return qtdArmazenamento;
    }

    public void setQtdArmazenamento(Double qtdArmazenamento) {
        this.qtdArmazenamento = qtdArmazenamento;
    }

    public Integer getQtdZoom() {
        return qtdZoom;
    }

    public void setQtdZoom(Integer qtdZoom) {
        this.qtdZoom = qtdZoom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camera{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", megapixel=").append(megapixel);
        sb.append(", stFlash=").append(stFlash);
        sb.append(", status=").append(status);
        sb.append(", qtdArmazenamento=").append(qtdArmazenamento);
        sb.append(", qtdZoom=").append(qtdZoom);
        sb.append('}');
        return sb.toString();
    }

    
}
