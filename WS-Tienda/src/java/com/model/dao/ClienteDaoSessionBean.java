/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marvin
 */
@Stateless
@WebService (serviceName = "ClienteWS" )
public class ClienteDaoSessionBean extends AbstractEM<Cliente>{

    @PersistenceContext(unitName = "WS-TiendaPU")
    private EntityManager em;
    
    public ClienteDaoSessionBean() {
        super(Cliente.class);
    }       

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    
    @WebMethod(operationName = "listarc" )
    public List<Cliente> listarc() {
        return em.createQuery("select c from Cliente c"). getResultList(); 
    }
}
