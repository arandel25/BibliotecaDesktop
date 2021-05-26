/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.model.Aluno;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Felip
 */
public interface AlunoDao extends BaseDao<Aluno, Long>{
    List<Aluno> pesquisarPorNome(String nome, Session sessao) throws HibernateException;
    List<Aluno> listarTodos(Session sessao) throws HibernateException;
}
