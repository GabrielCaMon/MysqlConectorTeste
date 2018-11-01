package br.com;

import java.util.Calendar;
import java.util.Date;

public class Gafanhotos {
	private Integer id;
	private String nome;
	private String profissao;
	private Date data;
	private String sexo;
	private Double peso;
	private Double altura;
	private String nacionalidade;
	private Integer cursopreferido;
	
	public Gafanhotos() {
		
	}
	
	
	public Gafanhotos(Integer id, String nome, String profissao, Date data, String sexo, Double peso, Double altura,
			String nacionalidade, Integer cursopreferido) {
		this.id = id;
		this.nome = nome;
		this.profissao = profissao;
		this.data = data;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
		this.cursopreferido = cursopreferido;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getCursopreferido() {
		return cursopreferido;
	}

	public void setCursopreferido(Integer cursopreferido) {
		this.cursopreferido = cursopreferido;
	}

	@Override
	public String toString() {
	
		return "gafanhoto: "+ this.getNome()+" "+this.getId()+" "+this.getData();
	}
	
}
