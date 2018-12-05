package br.aeim.mywork.dominio;

import br.aeim.mywork.dominio.Cliente;
import br.aeim.mywork.dominio.Prestador;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T19:21:45")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, Cliente> cliente;
    public static volatile SingularAttribute<Servico, Prestador> prestador;
    public static volatile SingularAttribute<Servico, Long> id;

}