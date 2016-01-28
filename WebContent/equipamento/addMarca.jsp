<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="br.ages.crud.model.Editora"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:include page="/template/head.jsp"></jsp:include>
	<div class="panel panel-primary panel-add-marcaModelo">
		<div class="panel-heading text-center">Cadastro de Marca</div>
		<div class="panel-body">
			<form action="main?acao=addEditora" method="post">
				<jsp:include page="/template/msg.jsp"></jsp:include>
					
				<div class="form-group">
				<div class="row">
					<div class="col-md-12">
						<label class="form-label ages">Marca <span class="red">*</span></label> 
						<div class="input-group">
						    <input class="form-control" type="text" placeholder="" name="marca"	value="${param.marca}" />
						    <div class="input-group-btn">
						        <a class="btn btn-info" href=""  data-toggle="tooltip" title="Digite a Marca e click aqui para adicionar!"><span class="glyphicon glyphicon-plus" ></span> Marca </a>
						    </div>
						</div>
					</div>
				</div>
				</div>
			</form>
		<div class="table-responsive">
			<table class="table table-hover table-striped table-bordered">

				<thead>
					<tr>
						<th style="text-align: center;"></th>
						<th style="text-align: center;">ID</th>
						<th style="text-align: center;">Marca</th>
						<th colspan="2" style="text-align: center;">A��es</th>
					</tr>
				</thead>

				<tbody>
					<!-- **** essas linhas abaixo  ser�o montadas por um array-->
					<tr>
						<td><input type="checkbox" /></td>
						<td>101</td>
						<td class="col-sm-8">Sony</td>
						<td align="center"><a href="" title="Editar"> <i class="glyphicon glyphicon-pencil"></i></a>
						<td align="center"><a href="" title="Deletar"> <i class="glyphicon glyphicon-trash"></i></a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
<jsp:include page="/template/foot.jsp"></jsp:include>
<script>
	var demo2 = $('.listaModelos').bootstrapDualListbox({
		nonSelectedListLabel : 'Modelos n�o associados a uma Marca',
		selectedListLabel : 'Modelo associados a uma Marca',
		preserveSelectionOnMove : 'moved',
		moveOnSelect : false,
		nonSelectedFilter : '',
		filterTextClear : 'Mostrar Todos',
		infoTextEmpty : 'Sem Marca '
	});
</script>
<script>
	$(document).ready(function(){
	    $('[data-toggle="tooltip"]').tooltip();   
	});
</script>