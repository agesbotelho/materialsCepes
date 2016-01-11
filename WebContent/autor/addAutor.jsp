<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="br.ages.crud.model.Autor"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:include page="/template/head.jsp"></jsp:include>

<div class="panel panel-primary panel-add">
	<div class="panel-heading text-center">Cadastro de Autores</div>
	<div class="panel-body">
		<div class="table-responsive">
			<form action="main?acao=addAutor" method="post">
				<jsp:include page="/template/msg.jsp"></jsp:include>
				<div class="form-group">
					<label class="form-label ages">Nome Autor: <span class="red">*</span></label> 
					<input class="form-control" id="nome" name="nome" value="${param.Nome}" type="text" required>
				</div>
	
				<div class="form-group">
					<label class="form-label ages">Sobrenome Autor: <span class="red">*</span></label> 
					<input class="form-control" id="sobrenome" name="sobrenome"	value="${param.Sobrenome}" type="text" required>
				</div>
	
				<span><sup class="red">*</sup> campos obrigat�rios</span> <br>
				<div class="text-center">
					<input class="btn btn-warning btn-limpar pull-left" type="reset" value="Limpar" id="limpar" name="limpar" />
					<input	class="btn btn-primary btn-add pull-right" type="submit" value="Cadastrar" />
				</div>
			</form>
		</div>
	</div>
</div>
		
	<jsp:include page="/template/foot.jsp"></jsp:include>
	