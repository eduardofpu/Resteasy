package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseEx3Bean {
	private static final long serialVersionUID = 1L;
	private int soma;
	private int produto;
	private double media;
	
	
	public ResponseEx3Bean() {
		// TODO Auto-generated constructor stub
	}


	public ResponseEx3Bean(int soma, int produto, double media) {
		super();
		this.soma = soma;
		this.produto = produto;
		this.media = media;
	}


	/**
	 * @return the soma
	 */
	public int getSoma() {
		return soma;
	}


	/**
	 * @param soma the soma to set
	 */
	public void setSoma(int soma) {
		this.soma = soma;
	}


	/**
	 * @return the produto
	 */
	public int getProduto() {
		return produto;
	}


	/**
	 * @param produto the produto to set
	 */
	public void setProduto(int produto) {
		this.produto = produto;
	}


	/**
	 * @return the media
	 */
	public double getMedia() {
		return media;
	}


	/**
	 * @param media the media to set
	 */
	public void setMedia(double media) {
		this.media = media;
	}
	
}
