/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.dao;

import br.com.prova.modelo.Pedido;
import javax.persistence.EntityManager;

/**
 *
 * @author kelvi
 */
public class PedidoDAO extends GenericDAO<Pedido, Integer>{

    public PedidoDAO(EntityManager em) {
        super(em);
    }
    
}
