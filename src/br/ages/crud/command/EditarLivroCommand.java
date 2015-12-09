package br.ages.crud.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import br.ages.crud.bo.AutorBO;
import br.ages.crud.bo.LivroBO;
import br.ages.crud.bo.EditoraBO;
import br.ages.crud.model.Editora;
import br.ages.crud.model.Livro;
import br.ages.crud.model.Autor;
import br.ages.crud.util.MensagemContantes;

public class EditarLivroCommand implements Command {

	private String proxima;

	private LivroBO livroBO;
	private EditoraBO editoraBO;
	private AutorBO autorBO;

	@Override
	public String execute(HttpServletRequest request) throws ParseException {

		livroBO = new LivroBO();
		editoraBO = new EditoraBO();
		autorBO = new AutorBO();
		proxima = "main?acao=listLivro";

		String titulo = request.getParameter("titulo");
		String subtitulo = request.getParameter("subtitulo");
		//Date dataCadastro = new Date();

		String sPreco = (request.getParameter("preco"));
		long preco = sPreco.equals("") ? 0 : Long.parseLong(sPreco);

		String lingua = request.getParameter("lingua");
		String codigoISBN = request.getParameter("isbn");

		String sEdicao = (request.getParameter("edicao"));
		Integer edicao = sEdicao.equals("") ? null : Integer.parseInt(sEdicao);

		String sAno = request.getParameter("ano");
		SimpleDateFormat sdano = new SimpleDateFormat("yyyy");
		Date ano = sAno.equals("") ? null : sdano.parse(sAno);

		String sPaginas = (request.getParameter("paginas"));
		Integer paginas = sPaginas.equals("") ? null : Integer
				.parseInt(sPaginas);

		Boolean bruxura_revista = request.getParameter("bruxuraRevista") == null ? false : true;
		Boolean video = request.getParameter("video") == null ? false : true;
		Boolean cd_dvd = request.getParameter("cd_dvd") == null ? false : true;
		Boolean e_book = request.getParameter("ebook") == null ? false : true;
		String descricao = request.getParameter("descricao");

		// Object receptor
		Integer idEditora = Integer.parseInt(request.getParameter("editora"));
		ArrayList<Integer> idAutores = new ArrayList<Integer>();
		Integer idAutor = Integer.parseInt(request.getParameter("autor"));
		idAutores.add(idAutor);

		try {

			Livro livro = new Livro();
			livro.setTitulo(titulo);
			livro.setSubtitulo(subtitulo);
			//livro.setDataCadastro(dataCadastro);
			livro.setPreco(preco);
			livro.setLingua(lingua);
			livro.setCodigoISBN(codigoISBN);
			livro.setEdicao(edicao);
			livro.setAno(ano);
			livro.setPaginas(paginas);
			livro.setVideo(video);
			livro.setCd_dvd(cd_dvd);
			livro.setE_book(e_book);
			livro.setDescricao(descricao);
			livro.setBruxura_revista(bruxura_revista);
			Editora editora = editoraBO.consultarEditora(idEditora);
			livro.setEditora(editora);
			ArrayList<Autor> autores = autorBO.consultarAutores(idAutores);
			livro.setAutores(autores);

			/*
			 * boolean isValido = usuarioBO.validaCadastroUsuarioA(user); if
			 * (!isValido) { request.setAttribute("msgErro",
			 * MensagemContantes.MSG_ERR_USUARIO_DADOS_INVALIDOS); } else { //
			 * cadastro de pessoa com sucesso
			 */
			livroBO.alterarLivro(livro);
			
			/**/

		} catch (Exception e) {
			request.setAttribute("msgErro", e.getMessage());
		}
		return proxima;
	}

	public boolean isNulo(HttpServletRequest request, String parameter) {
		return request.getParameter(parameter) == null;
	}
}
