package br.aeim.mywork.dominio;

import br.aeim.mywork.dominio.Pessoa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T19:21:45")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, Float> pontuacao;
    public static volatile SingularAttribute<Avaliacao, Pessoa> pessoa;
    public static volatile SingularAttribute<Avaliacao, Long> id;
    public static volatile SingularAttribute<Avaliacao, String> comentario;

}