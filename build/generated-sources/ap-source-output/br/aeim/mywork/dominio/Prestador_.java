package br.aeim.mywork.dominio;

import br.aeim.mywork.dominio.Area;
import br.aeim.mywork.dominio.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T19:21:45")
@StaticMetamodel(Prestador.class)
public class Prestador_ extends Pessoa_ {

    public static volatile SingularAttribute<Prestador, Area> area;
    public static volatile SingularAttribute<Prestador, String> nomeEmpresa;
    public static volatile ListAttribute<Prestador, Cliente> historico;

}