package br.ages.crud.command;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import br.ages.crud.dao.LivroDAO;

public class CreateScreenLivroCommand implements Command {

	private String proxima;

	private LivroDAO cadastroDao;

	public String execute(HttpServletRequest request) throws SQLException {

		cadastroDao = new LivroDAO();
		
		// Verifica se abre tela edi��o de livro ou de adi��o de livro.
		String isEdit = request.getParameter("isEdit");
		if (isEdit != null && !"".equals(isEdit)) {
			proxima = "livro/editLivro.jsp";
		} else {
			proxima = "livro/addLivro.jsp";
		}
		try {


		} catch (Exception e) {
			request.setAttribute("msgErro", e.getMessage());
		}

		return proxima;
	}
}
