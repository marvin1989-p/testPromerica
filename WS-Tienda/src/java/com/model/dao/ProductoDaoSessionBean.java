/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Producto;
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
@WebService (serviceName = "ProductoWS" )
public class ProductoDaoSessionBean extends AbstractEM<Producto> {

    @PersistenceContext(unitName = "WS-TiendaPU")
    private EntityManager em;

    public ProductoDaoSessionBean() {
        super(Producto.class);
    }       

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @WebMethod(operationName = "listarp" )
    public List<Producto> listarp() {
        return em.createQuery("select p from Producto p"). getResultList(); 
    }

}
