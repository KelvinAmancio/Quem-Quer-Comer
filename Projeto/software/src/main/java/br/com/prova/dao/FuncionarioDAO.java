/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.dao;

import br.com.prova.modelo.Funcionario;
import javax.persistence.EntityManager;

/**
 *
 * @author kelvi
 */
public class FuncionarioDAO extends GenericDAO<Funcionario, String>{

    public FuncionarioDAO(EntityManager em) {
        super(em);
    }
    
}
