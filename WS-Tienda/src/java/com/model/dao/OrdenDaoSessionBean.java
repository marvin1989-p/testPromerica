/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Orden;
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
@WebService (serviceName = "OrdenWS" )
public class OrdenDaoSessionBean extends AbstractEM<Orden>{

    @PersistenceContext(unitName = "WS-TiendaPU")
    private EntityManager em;
    
    public OrdenDaoSessionBean() {
        super(Orden.class);
    }       

    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @WebMethod(operationName = "listaro" )
    public List<Orden> listaro() {
        return em.createQuery("select o from Orden o"). getResultList(); 
    }
}
