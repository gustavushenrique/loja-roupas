<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

<c:import url="/common/header.jsp" />

<body>
	<div class="p-3 mb-2 bg-light">
		<div class="container-fluid">
			<c:import url="/common/titulo.jsp" />
			<div class="row">
				<c:import url="/common/sidebar.jsp" />
				<!-- SideBar é col-3 -->
				<div class="col-9">
					<div class="container">
						<div class="row">
							<div class="col-12">
								<h3>Carrinho de Compras</h3>
							</div>
						</div>
					</div>
					<table
						class="table table-bordered text-center table-hover table-striped">
						<thead class="thead-dark">
							<th>NOME</th>
							<th>PREÇO</th>
							<th>FOTO</th>
							<th>-</>
						</thead>
						<tbody>
							<c:forEach items="${cart}" var="roupa" varStatus="index">
								<tr>
									<td class="align-middle">${roupa.nome}</td>
									<td class="align-middle"><fmt:formatNumber
											value="${roupa.preco }" type="currency" currencySymbol="R$" /></td>
									<td><img class="img-thumbnail"
										style="width: 5vw; height: auto;"
										src="assets/img/catalogo/${roupa.nomeImagem }"></td>
									<td class="text-center align-middle">
										<form method="post">
											<button name="excluir" class="btn btn-danger " value="${index.count}">x</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</tbody>
						<tfoot>
							<tr class="thead-dark">
								<th>TOTAL</th>
								<th><fmt:formatNumber value="${total}" type="currency"
										currencySymbol="R$" /></th>
								<th>-</>
								<th>-</>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
		<c:import url="/common/footer.jsp" />
	</div>
</body>
</html>