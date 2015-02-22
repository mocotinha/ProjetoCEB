package br.com.bean.ceb.application;

import br.com.bean.ceb.dao.DAO;
import br.com.bean.ceb.dao.DAOAluno;
import br.com.bean.ceb.dao.DAOResponsavel;
import br.com.bean.ceb.model.Aluno;
import br.com.bean.ceb.model.Endereco;
import br.com.bean.ceb.model.Responsavel;

public class ApplicationTeste {

	public static void main(String[] args) {
		DAOAluno daoA = new DAOAluno();
		DAOResponsavel daoR = new DAOResponsavel();
		
		Aluno a = new Aluno();
		Responsavel r = new Responsavel();
		Endereco e = new Endereco();
		a.setEndereco(e);
		r.setEndereco(e);
		r.addAluno(a);
		DAO.open();
		DAO.begin();
		daoA.persist(a);
		daoR.persist(r);
		DAO.commit();
		DAO.close();

	}

}
