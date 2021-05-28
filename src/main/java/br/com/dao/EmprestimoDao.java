/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.model.Aluno;
import br.com.model.Emprestimo;
import br.com.model.Turma;
import java.util.Date;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Felip
 */
public interface EmprestimoDao extends BaseDao<Emprestimo, Long>{
    List<Emprestimo> pesquisarPorAluno(Aluno aluno, Session sessao) throws HibernateException;
    
    List<Emprestimo> pesquisarPorTurmaData(Turma turma, Date data, Session sessao) throws HibernateException;
    
    List<Emprestimo> pesquisarPorAlunoData(Aluno aluno, Date data, Session sessao) throws HibernateException;
    
    List<Emprestimo> listarTodos(Session sessao) throws HibernateException;
    
    List<Emprestimo> listarTodosEmAberto(Session sessao) throws HibernateException;
}