package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestEx5Bean {
	
	private static final long serialVersionUID = 1L;
	
	private int a;
	private int b;
	
	public RequestEx5Bean() {
		// TODO Auto-generated constructor stub
	}

	public RequestEx5Bean(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	 public int Exercicio5s(int a, int b) {
         
	        
	       a=getA();
	       b=getB();
	       
	         while (b != 0 && a % 10 == b % 10) {
	             a = b/10;
	              b = b/10;
	  }

	                if (b == 0)
	                   return 1;
	                      else
	                    return 0;

	        
	        
	       
	    }
	    
	

}
