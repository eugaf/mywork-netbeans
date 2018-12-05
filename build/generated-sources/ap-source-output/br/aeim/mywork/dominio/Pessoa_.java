package br.aeim.mywork.dominio;

import br.aeim.mywork.dominio.Avaliacao;
import br.aeim.mywork.dominio.Mensagem;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T19:21:45")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, Float> pontuacao;
    public static volatile SingularAttribute<Pessoa, String> senha;
    public static volatile ListAttribute<Pessoa, Avaliacao> avaliacoes;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile ListAttribute<Pessoa, Mensagem> mensagens;
    public static volatile SingularAttribute<Pessoa, String> email;

}