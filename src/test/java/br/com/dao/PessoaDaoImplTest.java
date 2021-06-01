/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.model.Aluno;
import br.com.model.Funcionario;
import br.com.model.Pessoa;
import br.com.util.UtilGerador;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class PessoaDaoImplTest {

    private Pessoa pessoa;
    private PessoaDao pessoaDao;
    private Session sessao;
    private Aluno aluno;

    public PessoaDaoImplTest() {
        pessoaDao = new PessoaDaoImpl();
    }

//    @Test
    public void testLogin() {
        System.out.println("login");
        buscarPessoaBd();
        sessao = HibernateUtil.abrirConexao();
        pessoa = pessoaDao.login(pessoa.getEmail(), pessoa.getSenha(), sessao);
        if (pessoa.getPerfil().getFuncao().equals("Aluno")) {
            System.out.println("Aluno");
            aluno = (Aluno) pessoa;
            System.out.println(aluno.getTurma().getCurso().getNome());
        } else {
            System.out.println("Funcionário");
            Funcionario funcionario = (Funcionario) pessoa;
            System.out.println(funcionario.getPerfil().getFuncao());
        }
        sessao.close();
        assertNotNull(pessoa);
    }

    public Pessoa buscarPessoaBd() {
        sessao = HibernateUtil.abrirConexao();
        Query consulta = sessao.createQuery("from Pessoa");
        List<Pessoa> pessoas = consulta.list();
        sessao.close();
        if (pessoas.isEmpty()) {
            FuncionarioDaoImplTest fun = new FuncionarioDaoImplTest();
            fun.buscarFuncionarioBd();
        } else {
            pessoa = pessoas.get(UtilGerador.criarNumeroEntre2Valores(-1, pessoas.size()));
        }
        return pessoa;
    }

}
