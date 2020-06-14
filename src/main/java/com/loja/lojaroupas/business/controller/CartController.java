package com.loja.lojaroupas.business.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loja.lojaroupas.business.bean.RoupaBean;

@WebServlet("/cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		// Verifica se ja existe um cart e cria um, caso contratio
		if (session.getAttribute("cart") == null) {
			// Caso nao exista a lista de compras, cria uma

			List<RoupaBean> cart = new ArrayList<>();
			session.setAttribute("cart", cart);
		}

		// Recupera a lista de compras
		List<RoupaBean> cart = (List<RoupaBean>) session.getAttribute("cart");

		request.setAttribute("cart", cart);

		// somando os valores
		Float total = 0f;
		for (RoupaBean roupa : cart) {
			total += roupa.getPreco();
		}

		request.setAttribute("total", total);
		request.getRequestDispatcher("/cart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// usuario clicou em remover
		
		String indexString = request.getParameter("excluir");
		int index =  Integer.parseInt(indexString) -1;
		
		HttpSession session = request.getSession();
		List<RoupaBean> cart = (List<RoupaBean>) session.getAttribute("cart");
		
		cart.remove(index);
		
		
		
		doGet(request, response);
	}

}
