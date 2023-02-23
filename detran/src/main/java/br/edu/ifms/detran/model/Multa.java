package br.edu.ifms.detran.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Multa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cidade;
	private int ano;
	
	@ManyToOne
	@JoinColumn(name="id_carro")
	private Carro carro;
	
	@ManyToOne
	@JoinColumn(name="id_infracao")
	private Infracao infracao;
	
	public Multa() {
		
	}

	public Multa(Long id, String cidade, int ano, Carro caro, Infracao infracao) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.ano = ano;
		this.carro = carro;
		this.infracao = infracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro getCaro() {
		return carro;
	}

	public void setCaro(Carro caro) {
		this.carro = caro;
	}

	public Infracao getInfracao() {
		return infracao;
	}

	public void setInfracao(Infracao infracao) {
		this.infracao = infracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multa other = (Multa) obj;
		return Objects.equals(id, other.id);
	}
	

}
