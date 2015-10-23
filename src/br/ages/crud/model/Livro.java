package br.ages.crud.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity Livro - Data Transfer Objeto 
 * @author C�ssio Trindade
 *
 */
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;
		private int idLivro;
		private String titulo;
		private String subtitulo;
		private Date dataCadastro;
		private long preco;
		private String lingua;
		private String codigoISBN;
		private Integer edicao;
		private Date ano;
		private Integer paginas;
		private boolean video;
		private boolean cd_dvd;
		private boolean e_book;
		private String descricao;
		private String bruxura_revista;
									
		public int getIdLivro() {
			return idLivro;
		}

		public void setIdLivro(int idLivro) {
			this.idLivro = idLivro;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getBruxura_revista() {
			return bruxura_revista;
		}

		public void setBruxura_revista(String bruxura_revista) {
			this.bruxura_revista = bruxura_revista;
		}

		public String getSubtitulo() {
			return subtitulo;
		}

		public void setSubtitulo(String subtitulo) {
			this.subtitulo = subtitulo;
		}

		public Date getDataCadastro() {
			return dataCadastro;
		}

		public void setDataCadastro(Date dataCadastro) {
			this.dataCadastro = dataCadastro;
		}

		public long getPreco() {
			return preco;
		}

		public void setPreco(long l) {
			this.preco = l;
		}

		public String getCodigoISBN() {
			return codigoISBN;
		}

		public void setCodigoISBN(String codigoISBN) {
			this.codigoISBN = codigoISBN;
		}

		public Integer getEdicao() {
			return edicao;
		}

		public void setEdicao(Integer edicao) {
			this.edicao = edicao;
		}

		public java.sql.Date getAno() {
			return (java.sql.Date) ano;
		}

		public void setAno(Date ano) {
			this.ano = ano;
		}

		public Integer getPaginas() {
			return paginas;
		}

		public void setPaginas(Integer paginas) {
			this.paginas = paginas;
		}

		public boolean isVideo() {
			return video;
		}

		public void setVideo(boolean video) {
			this.video = video;
		}

		public boolean isCd_dvd() {
			return cd_dvd;
		}

		public void setCd_dvd(boolean cd_dvd) {
			this.cd_dvd = cd_dvd;
		}

		public boolean isE_book() {
			return e_book;
		}

		public void setE_book(boolean e_book) {
			this.e_book = e_book;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public Livro() {
		}

		public String getLingua() {
			return lingua;
		}

		public void setLingua(String lingua) {
			this.lingua = lingua;
		}

}

