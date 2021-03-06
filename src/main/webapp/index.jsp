<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
								<h3>Página Principal</h3>
							</div>
						</div>
						<p>Boas vindas</p>
					</div>
				</div>
			</div>
		</div>
		<c:import url="/common/footer.jsp" />
	</div>
</body>
</html>