package com.model.entity;

import com.model.entity.Orden;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-03T17:31:59")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile ListAttribute<Producto, Orden> ordenList;
    public static volatile SingularAttribute<Producto, Integer> id_producto;
    public static volatile SingularAttribute<Producto, String> nombre;

}