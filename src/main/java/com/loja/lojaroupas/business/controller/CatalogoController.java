package com.loja.lojaroupas.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loja.lojaroupas.business.bean.CatalogoBean;

/**
 * Servlet implementation class CatalogoController
 */
@WebServlet("/catalogo")
public class CatalogoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CatalogoBean catalogoBean;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CatalogoController() {
		super();

		// Inicia o catálogo com as roupas padrão
		catalogoBean = new CatalogoBean();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String codigoCategoria = request.getParameter("categoria");
		System.out.println(codigoCategoria);
		
		// envia as roupas para o catálogo do front
		request.setAttribute("roupas", catalogoBean.getRoupasFiltradas(codigoCategoria));

		// Envia na requisição a página jsp
		request.getRequestDispatcher("/catalogo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
