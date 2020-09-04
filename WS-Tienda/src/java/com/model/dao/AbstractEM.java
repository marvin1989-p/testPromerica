/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import javax.jws.WebMethod;
import javax.persistence.EntityManager;

/**
 *
 * @author marvin
 */
public abstract class AbstractEM<EM> {
    private Class<EM> entityClass;

    public AbstractEM(Class<EM> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    @WebMethod(operationName = "crear" )
    public void crear(EM entity) {
        getEntityManager().persist(entity);
    }

    @WebMethod(operationName = "actualizar" )
    public void editar(EM entity) {
        getEntityManager().merge(entity);
    }

    @WebMethod(operationName = "eliminar" )
    public void eliminar(EM entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    @WebMethod(operationName = "buscar" )
    public EM buscar(Object id) {
        return getEntityManager().find(entityClass, id);
    }

}
