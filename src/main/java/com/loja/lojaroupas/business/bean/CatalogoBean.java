package com.loja.lojaroupas.business.bean;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

public class CatalogoBean {
	
	private final String ROUPA_MASCULINA = "Roupa Masculina";
	private final String ROUPA_FEMININA = "Roupa Feminina";


	private List<RoupaBean> roupas;

	// Inicia a lista de roupas com os itens abaixo
	public CatalogoBean() {
		roupas = new ArrayList<>();
		roupas.add(novaRoupa("Camisa Oficial", ROUPA_MASCULINA, 49.90f, "camisa-oficial.jpg"));
		roupas.add(novaRoupa("Camisa Passeio", ROUPA_MASCULINA, 18.90f, "camisa-passeio.jpg"));
		roupas.add(novaRoupa("Blusa Oficial", ROUPA_FEMININA, 15.90f, "blusa-oficial-feminina.jpg"));
		roupas.add(novaRoupa("Blusa Polo", ROUPA_FEMININA, 159.90f, "blusa-polo.jpg"));
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

	// retorna as roupas filtradas de acordo com o codigo informado no filtro no
	// navegador
	public List<RoupaBean> getRoupasFiltradas(String codigoCategoria) {

		if (codigoCategoria == null) {
			return roupas;
		}

		int codigo = Integer.parseInt(codigoCategoria);

		List<RoupaBean> roupasFiltradas = new ArrayList<>();

		// 1 = masculino, 2 = feminino

		for (RoupaBean roupa : roupas) {
			if (codigo == 1) {
				if (ROUPA_MASCULINA.equals(roupa.getCategoria())) {
					roupasFiltradas.add(roupa);
				}
			} else if (codigo == 2) {
				if (ROUPA_FEMININA.equals(roupa.getCategoria())) {
					roupasFiltradas.add(roupa);
				}
			}
		}

		return roupasFiltradas;
	}

}
