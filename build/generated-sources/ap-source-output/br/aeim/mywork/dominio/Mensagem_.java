package br.aeim.mywork.dominio;

import br.aeim.mywork.dominio.Pessoa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T19:21:45")
@StaticMetamodel(Mensagem.class)
public class Mensagem_ { 

    public static volatile SingularAttribute<Mensagem, Pessoa> remetente;
    public static volatile SingularAttribute<Mensagem, Date> hora;
    public static volatile SingularAttribute<Mensagem, Long> id;
    public static volatile SingularAttribute<Mensagem, Pessoa> destinatario;

}