package com.model.entity;

import com.model.entity.Orden;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-03T17:31:59")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, Integer> id_cliente;
    public static volatile ListAttribute<Cliente, Orden> ordenList;
    public static volatile SingularAttribute<Cliente, String> nombres;

}