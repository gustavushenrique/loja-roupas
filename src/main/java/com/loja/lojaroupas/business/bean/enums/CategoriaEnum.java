package com.loja.lojaroupas.business.bean.enums;

public enum CategoriaEnum {

	ROUPA_MASCULINA("Roupa Masculina", 1), ROUPA_FEMININA("Roupa Feminina", 2), FANTASIA("Fantasia", 3);

	private String nome;
	private Integer codigo;

	private CategoriaEnum(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

}
