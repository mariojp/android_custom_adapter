package br.com.mariojp.exemplo.customadapter;

public class ItemLista {
	
	private Long id;
	private String titulo;
	private String subtitulo;
	private String imagem;
	 
	public ItemLista(Long id, String titulo, String subtitulo) {
		this.id = id;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
	}
	
	public ItemLista() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
	

}
