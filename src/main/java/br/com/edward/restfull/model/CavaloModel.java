package br.com.edward.restfull.model;

import br.com.edward.restfull.domain.Cavalo;

public class CavaloModel {
    
    private Long id;
    private String nome;
    private Double preco;
    private Double peso;
   
    public CavaloModel() {
       
    }
    
    public CavaloModel(Cavalo domain) {
        this.id = domain.getId();
        this.nome = domain.getNome();
        this.preco = domain.getPreco();
        this.peso = domain.getPeso();
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
