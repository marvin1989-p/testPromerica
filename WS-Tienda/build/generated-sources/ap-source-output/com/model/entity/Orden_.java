package com.model.entity;

import com.model.entity.Cliente;
import com.model.entity.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-03T17:31:59")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Date> fecha;
    public static volatile SingularAttribute<Orden, Cliente> id_cliente;
    public static volatile SingularAttribute<Orden, Producto> id_producto;
    public static volatile SingularAttribute<Orden, Integer> cantidad;
    public static volatile SingularAttribute<Orden, Integer> id_orden;

}