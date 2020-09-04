/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import ws.orden.Orden;
import ws.orden.OrdenWS;

/**
 *
 * @author marvin
 */
@Named("Orden")
@RequestScoped
public class OrdenControlador {
    
    @Produces
    @Named("ordenes")
    @RequestScoped
    public List<Orden> listar(){
        OrdenWS ordenws = new OrdenWS();
        return ordenws.getOrdenDaoSessionBeanPort().listaro() ;
    }
    
}
