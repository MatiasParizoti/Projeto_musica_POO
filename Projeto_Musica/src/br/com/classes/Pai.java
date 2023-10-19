package br.com.classes;

public class Pai {
	
	protected String nome ;
	protected String artista ;
	protected String  curtidas ;
	protected String genero ;
	protected double duracao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(String curtidas) {
		this.curtidas = curtidas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
		
	public void favorito() {
		
		System.out.println("--------------------------------");
	    
	    if ("curti".equals(getCurtidas())) {
	        System.out.println("Nome: " + getNome());
	        System.out.println("Artista: " + getArtista());
	        System.out.println("Genero: " + getGenero());
	        System.out.println("Duração: " + getDuracao() + " minutos");
	    }
	    
	}

}
