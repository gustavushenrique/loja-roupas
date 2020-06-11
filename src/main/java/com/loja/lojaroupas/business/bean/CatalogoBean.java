package com.loja.lojaroupas.business.bean;

import java.util.ArrayList;
import java.util.List;

public class CatalogoBean {

	private List<RoupaBean> roupas;

	// Inicia a lista de roupas com os itens abaixo
	public CatalogoBean() {
		roupas = new ArrayList<>();
		roupas.add(novaRoupa("Camisa Oficial", "Roupa Masculina", 49.90f, "camisa-oficial.jpg"));
		roupas.add(novaRoupa("Camisa Passeio", "Roupa Masculina", 18.90f, "camisa-passeio.jpg"));
		roupas.add(novaRoupa("Blusa Oficial", "Roupa Feminina", 15.90f, "blusa-oficial-feminina.jpg"));
		roupas.add(novaRoupa("Blusa Polo", "Roupa Feminina", 159.90f, "blusa-polo.jpg"));
	}

	// Funão para criar novas roupas.
	private RoupaBean novaRoupa(String nome, String categoria, Float preco, String nomeImagem) {
		
		// Calcular o código de acordo com o tamanho d lista
		
		Integer codigo = roupas.size();
		
		RoupaBean roupaBean = new RoupaBean();
		roupaBean.setNome(nome);
		roupaBean.setCategoria(categoria);
		roupaBean.setPreco(preco);
		roupaBean.setNomeImagem(nomeImagem);

		return roupaBean;
	}

	public List<RoupaBean> getRoupas() {
		return roupas;
	}

	public void setRoupas(List<RoupaBean> roupas) {
		this.roupas = roupas;
	}

}
