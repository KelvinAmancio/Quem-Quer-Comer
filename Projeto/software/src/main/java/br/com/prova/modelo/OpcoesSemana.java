/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.modelo;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kelvi
 */
@Entity
public class OpcoesSemana {
    @Id
    private String dataInicio;
    private String dataTermino;
    
    private String itemSegunda1, itemSegunda2, itemSegunda3, 
                   itemTerca1, itemTerca2, itemTerca3,
                   itemQuarta1, itemQuarta2, itemQuarta3,
                   itemQuinta1, itemQuinta2, itemQuinta3,
                   itemSexta1, itemSexta2, itemSexta3;

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getItemSegunda1() {
        return itemSegunda1;
    }

    public void setItemSegunda1(String itemSegunda1) {
        this.itemSegunda1 = itemSegunda1;
    }

    public String getItemSegunda2() {
        return itemSegunda2;
    }

    public void setItemSegunda2(String itemSegunda2) {
        this.itemSegunda2 = itemSegunda2;
    }

    public String getItemSegunda3() {
        return itemSegunda3;
    }

    public void setItemSegunda3(String itemSegunda3) {
        this.itemSegunda3 = itemSegunda3;
    }

    public String getItemTerca1() {
        return itemTerca1;
    }

    public void setItemTerca1(String itemTerca1) {
        this.itemTerca1 = itemTerca1;
    }

    public String getItemTerca2() {
        return itemTerca2;
    }

    public void setItemTerca2(String itemTerca2) {
        this.itemTerca2 = itemTerca2;
    }

    public String getItemTerca3() {
        return itemTerca3;
    }

    public void setItemTerca3(String itemTerca3) {
        this.itemTerca3 = itemTerca3;
    }

    public String getItemQuarta1() {
        return itemQuarta1;
    }

    public void setItemQuarta1(String itemQuarta1) {
        this.itemQuarta1 = itemQuarta1;
    }

    public String getItemQuarta2() {
        return itemQuarta2;
    }

    public void setItemQuarta2(String itemQuarta2) {
        this.itemQuarta2 = itemQuarta2;
    }

    public String getItemQuarta3() {
        return itemQuarta3;
    }

    public void setItemQuarta3(String itemQuarta3) {
        this.itemQuarta3 = itemQuarta3;
    }

    public String getItemQuinta1() {
        return itemQuinta1;
    }

    public void setItemQuinta1(String itemQuinta1) {
        this.itemQuinta1 = itemQuinta1;
    }

    public String getItemQuinta2() {
        return itemQuinta2;
    }

    public void setItemQuinta2(String itemQuinta2) {
        this.itemQuinta2 = itemQuinta2;
    }

    public String getItemQuinta3() {
        return itemQuinta3;
    }

    public void setItemQuinta3(String itemQuinta3) {
        this.itemQuinta3 = itemQuinta3;
    }

    public String getItemSexta1() {
        return itemSexta1;
    }

    public void setItemSexta1(String itemSexta1) {
        this.itemSexta1 = itemSexta1;
    }

    public String getItemSexta2() {
        return itemSexta2;
    }

    public void setItemSexta2(String itemSexta2) {
        this.itemSexta2 = itemSexta2;
    }

    public String getItemSexta3() {
        return itemSexta3;
    }

    public void setItemSexta3(String itemSexta3) {
        this.itemSexta3 = itemSexta3;
    }
}
