package br.com.systemdevelopment.model;

public class Livro {
	private int IdLivro;
	private String Descricao;
	private int Categoria;
	private String Sinopse;
	private int Autor;
	private int Editora;
	private int AnoLancamento;
	private int Quantidade;
	private Boolean Ativo;
	
	public String getSinopse() {
		return Sinopse;
	}
	public void setSinopse(String sinopse) {
		Sinopse = sinopse;
	}
	public int getAutor() {
		return Autor;
	}
	public void setAutor(int autor) {
		Autor = autor;
	}
	public int getEditora() {
		return Editora;
	}
	public void setEditora(int editora) {
		Editora = editora;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public int getIdLivro() {
		return IdLivro;
	}
	public void setIdLivro(int idLivro) {
		IdLivro = idLivro;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getCategoria() {
		return Categoria;
	}
	public void setCategoria(int categoria) {
		Categoria = categoria;
	}
	public int getAnoLancamento() {
		return AnoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		AnoLancamento = anoLancamento;
	}
	public Boolean getAtivo() {
		return Ativo;
	}
	public void setAtivo(Boolean ativo) {
		Ativo = ativo;
	}	
}
