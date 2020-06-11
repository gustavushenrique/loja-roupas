<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-3">
	<nav id="sidebar">
		<ul class="list-unstyled">
			<div>
				<li><a class="btn btn-dark btn-lg m-1"
					href="<c:url value="/"/>">Principal</a></li>
			</div>

			<div>
				<li><a class="btn btn-dark btn-lg m-1"
					href="<c:url value="/catalogo"/>">Catálogo</a></li>
			</div>
		</ul>
	</nav>
</div>

