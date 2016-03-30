package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseEx5Bean {
	private static final long serialVersionUID = 1L;
	
	private String resposta;
	
	public ResponseEx5Bean() {
		// TODO Auto-generated constructor stub
	}

	public ResponseEx5Bean(String resposta) {
		super();
		this.resposta = resposta;
	}

	/**
	 * @return the resposta
	 */
	public String getResposta() {
		return resposta;
	}

	/**
	 * @param resposta the resposta to set
	 */
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	
}
