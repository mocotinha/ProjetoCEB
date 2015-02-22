package br.com.bean.ceb.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	@Lob
	private byte[] foto;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;
	private String alergia;
	private String outrasDoencas;
	private String outrasInformacoes;
	@ManyToOne
	private Responsavel responsavel;
	@OneToOne(mappedBy="aluno",cascade=CascadeType.ALL)
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
		endereco.setAluno(this);
		this.endereco = endereco;
	}

	public Aluno() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getOutrasDoencas() {
		return outrasDoencas;
	}

	public void setOutrasDoencas(String outrasDoencas) {
		this.outrasDoencas = outrasDoencas;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	
}
