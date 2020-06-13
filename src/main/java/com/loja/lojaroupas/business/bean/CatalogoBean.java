package com.loja.lojaroupas.business.bean;

import java.util.ArrayList;
import java.util.List;

import com.loja.lojaroupas.business.bean.enums.CategoriaEnum;

public class CatalogoBean {

	private List<RoupaBean> roupas;

	// Inicia a lista de roupas com os itens abaixo
	public CatalogoBean() {
		roupas = new ArrayList<>();
		roupas.add(novaRoupa("Camisa Oficial", CategoriaEnum.ROUPA_MASCULINA, 49.90f, "camisa-oficial.jpg"));
		roupas.add(novaRoupa("Camisa Passeio", CategoriaEnum.ROUPA_MASCULINA, 18.90f, "camisa-passeio.jpg"));
		roupas.add(novaRoupa("Blusa Oficial", CategoriaEnum.ROUPA_FEMININA, 15.90f, "blusa-oficial-feminina.jpg"));
		roupas.add(novaRoupa("Blusa Polo", CategoriaEnum.ROUPA_FEMININA, 159.90f, "blusa-polo.jpg"));
	}

	// Funão para criar novas roupas.
	private RoupaBean novaRoupa(String nome, CategoriaEnum categoriaEnum, Float preco, String nomeImagem) {

		// Calcular o código de acordo com o tamanho d lista

		Integer codigo = roupas.size();

		RoupaBean roupaBean = new RoupaBean();
		roupaBean.setNome(nome);
		roupaBean.setCodigoCatergoria(categoriaEnum.getCodigo());
		roupaBean.setCategoria(categoriaEnum.getNome());
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
	public List<RoupaBean> getRoupasFiltradas(String[] codigosCategoria) {

		if (codigosCategoria == null) {
			return roupas;
		}

		List<RoupaBean> roupasFiltradas = new ArrayList<>();

		List<Integer> codigos = new ArrayList<>();

		for (String codigoCategoria : codigosCategoria) {
			codigos.add(Integer.parseInt(codigoCategoria));
		}

		for (RoupaBean roupa : roupas) {
			if (codigos.contains(roupa.getCodigoCatergoria())) {
				roupasFiltradas.add(roupa);
			}
		}

		return roupasFiltradas;
	}

}
