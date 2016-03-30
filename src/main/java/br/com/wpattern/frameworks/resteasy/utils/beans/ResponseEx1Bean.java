package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseEx1Bean {
	private static final long serialVersionUID = 1L;
	
	private double response;
	
	public ResponseEx1Bean() {
		// TODO Auto-generated constructor stub
	}

	public ResponseEx1Bean(double response) {
		super();
		this.response = response;
	}

	/**
	 * @return the response
	 */
	public double getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(double response) {
		this.response = response;
	}
	
	
	

}
