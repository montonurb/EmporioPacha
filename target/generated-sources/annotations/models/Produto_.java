package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Tipo;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T20:20:11")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Tipo> tipo;
    public static volatile SingularAttribute<Produto, Double> valor;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, Long> id;

}