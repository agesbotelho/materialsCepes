package br.ages.crud.command;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import br.ages.crud.dao.EditoraDAO;
import br.ages.crud.model.Livro;
import br.ages.crud.model.Editora;

public class CreateScreenEditoraCommand implements Command {

	private String proxima;

	private EditoraDAO editoraDao;

	public String execute(HttpServletRequest request) throws SQLException {

		editoraDao = new EditoraDAO();
		
		
		try {
			// Verifica se abre tela edi��o de editora ou de adi��o de editora.
			String isEdit = request.getParameter("isEdit");
			if (isEdit != null && "sim".equals(isEdit)) {
				int editoraId = Integer.parseInt(request.getParameter("editora_id"));
				
				// Criar fun�ao EditoraDAO.consultarEditora(int editoraID)
				/* Editora editora = editoraDAO.consultarEditora(editoraId);
				request.setAttribute("editora", editora); */
				
				proxima = "editora/editEditora.jsp";
			} else {
				proxima = "editora/addEditora.jsp";
			}


		} catch (Exception e) {
			request.setAttribute("msgErro", e.getMessage());
		}

		return proxima;
	}
}
