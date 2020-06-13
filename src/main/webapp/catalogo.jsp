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
								<h3>Catalogo</h3>
							</div>
						</div>
						<div class="row">
							<div class="col-6">
								<c:forEach items="${roupas}" var="roupa">
									<div class="card m-2 p-2">
										<div class="card-header text-center">
											<h5>${roupa.nome}</h5>
										</div>
										<div class="card-body">
											<img class="card-img"
												src="assets/img/catalogo/${roupa.nomeImagem }">
											<div class="card-title text-center mt-3">
												<div class="badge badge-dark">
													<h6>
														<fmt:formatNumber value="${roupa.preco }" type="currency"
															currencySymbol="R$" />
													</h6>
												</div>
											</div>
										</div>
										<div class="card-footer text-center">
											<button class="btn btn-dark">Adicionar</button>
											<a class="btn btn-info text-white" href="#">Detalhes</a>
										</div>
									</div>
								</c:forEach>
							</div>
							<div class="col-3 text-center">
								<h5>Filtros</h5>
								<form method="post">
									<div class="form-group">
										<label for="categorias">Categorias</label> <select multiple
											name="categoria" class="form-control" id="categorias">
											<c:forEach items="${categorias}" var="categoria">
												<option value="${categoria.codigo }">${categoria.nome}</option>
											</c:forEach>
										</select>
									</div>
									<div>
										<button class="btn btn-success btn-lg active">Filtrar</button>
										<button class="btn btn-danger btn-lg active" type="reset">Reset</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<c:import url="/common/footer.jsp" />
	</div>
</body>
</html>