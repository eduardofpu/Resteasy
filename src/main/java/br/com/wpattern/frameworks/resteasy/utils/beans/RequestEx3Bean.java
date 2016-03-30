package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestEx3Bean {
	
	private static final long serialVersionUID = 1L;
	private int valor1;
	private int valor2;
	private int valor3;
	private int valor4;
	
	
	public RequestEx3Bean() {
		// TODO Auto-generated constructor stub
	}


	public RequestEx3Bean(int valor1, int valor2, int valor3, int valor4) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}


	/**
	 * @return the valor1
	 */
	public int getValor1() {
		return valor1;
	}


	/**
	 * @param valor1 the valor1 to set
	 */
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}


	/**
	 * @return the valor2
	 */
	public int getValor2() {
		return valor2;
	}


	/**
	 * @param valor2 the valor2 to set
	 */
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}


	/**
	 * @return the valor3
	 */
	public int getValor3() {
		return valor3;
	}


	/**
	 * @param valor3 the valor3 to set
	 */
	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}


	/**
	 * @return the valor4
	 */
	public int getValor4() {
		return valor4;
	}


	/**
	 * @param valor4 the valor4 to set
	 */
	public void setValor4(int valor4) {
		this.valor4 = valor4;
	}
	
}
