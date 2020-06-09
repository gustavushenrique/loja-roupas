package com.loja.lojaroupas.business.bean;

import java.util.ArrayList;
import java.util.List;

public class CatalogoBean {

	private List<RoupaBean> roupas;

	// Inicia a lista de roupas com os itens abaixo
	public CatalogoBean() {
		roupas = new ArrayList<>();
		roupas.add(novaRoupa("Camisa", "Roupa Masculina", 49.9f));
		roupas.add(novaRoupa("Calça", "Roupa Masculina", 18.9f));
		roupas.add(novaRoupa("Blusa", "Roupa Feminina", 15.9f));
		roupas.add(novaRoupa("Vestido", "Roupa Feminina", 159.9f));
	}

	// Funão para criar novas roupas.
	private RoupaBean novaRoupa(String nome, String categoria, Float preco) {
		
		// Calcular o código de acordo com o tamanho d lista
		
		Integer codigo = roupas.size();
		
		RoupaBean roupaBean = new RoupaBean();
		roupaBean.setNome(nome);
		roupaBean.setCategoria(categoria);
		roupaBean.setPreco(preco);

		return roupaBean;
	}

	public List<RoupaBean> getRoupas() {
		return roupas;
	}

	public void setRoupas(List<RoupaBean> roupas) {
		this.roupas = roupas;
	}

}
