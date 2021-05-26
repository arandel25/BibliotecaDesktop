/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.model.Aluno;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Felip
 */
public class AlunoDaoImpl extends BaseDaoImpl<Aluno, Long> implements AlunoDao{
    @Override
    public Aluno pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Aluno) sessao.get(Aluno.class, id);
    }
    
    @Override
    public List<Aluno> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Aluno where nome like :nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.list();
    }
    
    @Override
    public List<Aluno> listarTodos(Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery(("FROM Aluno"));
        return consulta.list();
    }
}
