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
import ws.cliente.Cliente;
import ws.cliente.ClienteWS;

/**
 *
 * @author marvin
 */
@Named("Cliente")
@RequestScoped
public class ClienteControlador {
    
    @Produces
    @Named("clientes")
    @RequestScoped
    public List<Cliente> lista(){
        ClienteWS clientews=new ClienteWS();
        return clientews.getClienteDaoSessionBeanPort().listarc();
    }
}
