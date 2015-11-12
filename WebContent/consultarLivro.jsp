<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="br.ages.crud.model.Livro"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Cadastro de livros</title>
<link rel="stylesheet" type="text/css" href=".../comum.css" />
</head>
<%Livro livro = (Livro) request.getAttribute("livro"); %>
<body>
	<table align='center' border="1">
		<div id="outer">
			<div id="inner">
				<tr>
					<td>CADASTRO DE LIVROS</td>
				</tr>
				<tr>
					<td><label>Codigo isbn</label></td>
					<td><label>Titulo</label></td>
				</tr>
				<tr>
					<td><label><%livro.getCodigoISBN(); %></label></td>
					<td><label><%livro.getTitulo();%></label></td>
				</tr>
				<tr>
					<td><label>Lingua</label></td>
					<td><label>Subtitulo</label></td>
				</tr>
				<tr>
					<td><select name="">
							<option value="Lingua"><%livro.getLingua();%></option>
					</select></td>
					<td><label><<%livro.getSubtitulo();%>/label></td>
				</tr>
				<tr>
					<td><label>Autor</label></td>
					<td><label>Editora</label></td>
				</tr>
				<tr>
					<td><select name="">
							<option value="Autor"><%livro.getAutor().getNome();%> </option>
					</select></td>
					<td><select name="">
							<option value="Editora"><%livro.getEditora().getNome();%></option>
					</select></td>

				</tr>
				<tr>
					<td colspan='2'><textarea rows="4" cols="90"></textarea></td>
				</tr>
				<tr>
					<td><label>Numero de paginas</label></td>
					<td><label>Ano</label></td>
					<td><label>Edicao</label></td>
				</tr>
				<tr>
					<td><label><%livro.getPaginas();%></label></td>
					<td><label><%livro.getAno();%></label></td>
					<td><label><%livro.getEdicao();%></label></td>
				</tr>
				<tr>
					<td><label>Preco</label></td>
					<td><label>Data de compra</label></td>
					<td><label><%livro.getBruxura_revista(); %></label></td>
				</tr>

				<tr>
					<td><%livro.getPreco(); %></td>
					<td><%livro.getDataCadastro(); %></td>
				</tr>
				<tr>
					<td></td>
				

				</tr>
				<tr>

					<td><input type="checkbox" name="video">video</td>
				</tr>

			</div>
		</div>
	</table>
</body>
</html>