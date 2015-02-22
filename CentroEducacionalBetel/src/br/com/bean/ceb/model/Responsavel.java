package br.com.bean.ceb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Responsavel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String rg;
	private String cpf;
	private String nis;
	private String beneficiarioNis;
	private String profissao;
	private String telefone;
	private String telefone2;
	@OneToMany(mappedBy="responsavel")
	private List<Aluno> alunos;
	@OneToOne(mappedBy="responsavel",cascade=CascadeType.ALL)
	private Endereco endereco;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		endereco.setResponsavel(this);
		this.endereco = endereco;
	}

	public void addAluno(Aluno aluno){
		aluno.setResponsavel(this);
		this.alunos.add(aluno);
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Responsavel() {
		this.alunos = new ArrayList<Aluno>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNis() {
		return nis;
	}
	public void setNis(String nis) {
		this.nis = nis;
	}
	public String getBeneficiarioNis() {
		return beneficiarioNis;
	}
	public void setBeneficiarioNis(String beneficiarioNis) {
		this.beneficiarioNis = beneficiarioNis;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	
	
	
}
