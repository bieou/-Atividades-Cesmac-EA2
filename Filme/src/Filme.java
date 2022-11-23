
public class Filme {
	private String nomeDoFilme;
	private String diretor;
	private String descricao;
	private String genero;
	private String duracaoDoFilme;
	
	public Filme(String nome, String diretor, String descricao, String genero, String duracaoDoFilme) {
		this.nomeDoFilme= nome;
		this.diretor= diretor;
		this.descricao=descricao;
		this.genero= genero;
		this.duracaoDoFilme= duracaoDoFilme;
	}
	
	
	public String getNomeDoFilme() {
		return nomeDoFilme;
	}
	public void setNomeDoFilme(String nomeDoFilme) {
		this.nomeDoFilme = nomeDoFilme;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracaoDoFilme() {
		return duracaoDoFilme;
	}
	public void setDuracaoDoFilme(String duracaoDoFilme) {
		this.duracaoDoFilme = duracaoDoFilme;
	}
}
