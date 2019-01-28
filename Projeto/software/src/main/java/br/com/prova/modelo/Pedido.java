/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author kelvi
 */
@Entity
public class Pedido {
    @Id
    @GeneratedValue
    private int codigo;
    
    private String itemSegunda, itemTerca, itemQuarta, itemQuinta, itemSexta;
    
    @OneToOne
    @JoinColumn(name="nome_funcionario")
    private Funcionario func;
    
    @OneToOne
    @JoinColumn(name="data_inicio_semana")
    private OpcoesSemana opcoes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getItemSegunda() {
        return itemSegunda;
    }

    public void setItemSegunda(String itemSegunda) {
        this.itemSegunda = itemSegunda;
    }

    public String getItemTerca() {
        return itemTerca;
    }

    public void setItemTerca(String itemTerca) {
        this.itemTerca = itemTerca;
    }

    public String getItemQuarta() {
        return itemQuarta;
    }

    public void setItemQuarta(String itemQuarta) {
        this.itemQuarta = itemQuarta;
    }

    public String getItemQuinta() {
        return itemQuinta;
    }

    public void setItemQuinta(String itemQuinta) {
        this.itemQuinta = itemQuinta;
    }

    public String getItemSexta() {
        return itemSexta;
    }

    public void setItemSexta(String itemSexta) {
        this.itemSexta = itemSexta;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public OpcoesSemana getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(OpcoesSemana opcoes) {
        this.opcoes = opcoes;
    }
    
}
