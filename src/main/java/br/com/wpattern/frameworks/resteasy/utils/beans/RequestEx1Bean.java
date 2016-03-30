package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestEx1Bean {

	private static final long serialVersionUID = 1L;
	
    private double value1;
    public RequestEx1Bean() {
		// TODO Auto-generated constructor stub
	}
	public RequestEx1Bean(double value1) {
		super();
		this.value1 = value1;
	}
	public double getValue1() {
		return value1;
	}
	public void setValue1(double value1) {
		this.value1 = value1;
	}
    
	


	}
