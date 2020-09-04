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
import ws.producto.Producto;
import ws.producto.ProductoWS;

/**
 *
 * @author marvin
 */
@Named("Producto")
@RequestScoped
public class ProductoControlador {
    
    private Producto pr ;
    private ProductoWS proWS;
    
    @Produces
    @Named("productos")
    @RequestScoped
    public List<Producto> lista(){
        ProductoWS productows= new ProductoWS();
        return productows.getProductoDaoSessionBeanPort().listarp();
    }
    
    public void preCrear(){
        System.out.println("entro a preCREAR *********");
        pr=new Producto();
        //proWS.getProductoDaoSessionBeanPort().crear(pr);
    }
    
    public void Crear(Producto p ){        
        proWS.getProductoDaoSessionBeanPort().crear(p);
    }
    
    public Producto getPr() {
        return pr;
    }

    public void setPr(Producto pr) {
        System.out.println("entro" + pr.getNombre());
        this.pr = pr;
    }
    
    public ProductoWS getProWS() {
        return proWS;
    }

    public void setProWS(ProductoWS proWS) {
        this.proWS = proWS;
    }
      
}
