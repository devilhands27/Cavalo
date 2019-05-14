package br.com.edward.restfull.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.edward.restfull.model.CavaloModel;

@Entity
@Table(name = "cavalo")
public class Cavalo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(name="nome", length = 128)
    private String nome;
    
    @NotNull
    @Column(name="preco")
    private Double preco;
    
    @NotNull
    @Column(name="peso")
    private Double peso;
    
    public Cavalo(CavaloModel model) {
        this();
        this.nome = model.getNome();
        this.preco = model.getPreco();
        this.peso = model.getPeso();
    }

    public Cavalo() {
		// TODO Auto-generated constructor stub
	}

    public void alterar(CavaloModel model) {
        
        this.nome = model.getNome();
        this.preco = model.getPreco();
        this.peso = model.getPeso();
    }

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Double getPeso() {
		return peso;
	}


	
}
