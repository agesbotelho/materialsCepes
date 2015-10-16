<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/registerUser.css" />
	
	<title>Cadastrar Usu�rio</title>
	<script type="text/javascript">
	
			function cadastrar() {
				//chamar funcao de verificar campos
				var formCadastro = document.forms[0]; 
				formCadastro.action ="main?acao=alterar";
				formCadastro.submit();
			}
		
		</script>
</head>
<body>
	<form method="post" action="">
		<jsp:include page="/template/msg.jsp"></jsp:include>
		<fieldset class="fieldset_register">
			<legend>Alterar Usu�rio</legend>
			<div class="campo">
				<label for="matricula">Matricula</label> <sup class="red">*</sup> <input type="text" id="matricula" name="matricula" maxlength="15" required="required" value="${param.matricula}" />
				
			</div>
			
			<div class="campo">
				<label for="nome">Nome</label> <sup class="red">*</sup> <input type="text" id="nome" name="nome" maxlength="15" value="${param.nome}" />
			</div>

			<div class="campo">
				<label for="email">Email</label> <sup class="red">*</sup> <input type="text" id="email" name="email" maxlength="15" value="${param.email}" />
				
			</div>

			<div class="campo">
				<label for="usuario">Usu�rio</label> <sup class="red">*</sup> <input type="text" id="usuario" name="usuario" maxlength="15" value="${param.usuario}" />
			</div>
			
			<div class="campo">
				<label for="senha">Senha</label> <sup class="red">*</sup> <input type="password" id="senha" name="senha" maxlength="15" value="${param.senha}" />
				
			</div>

			<div class=limpar>
				<input type="reset" value="Limpar Campos" id="limpar" name="limpar" />
			</div>
			
			<div class="cadastrar">
				<input type="button" value="Alterar" id="alterar" name="alterar" onclick="cadastrar()"/>
			</div>

		</fieldset>
		</form>
</body>
</html>