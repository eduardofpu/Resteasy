package br.com.wpattern.frameworks.resteasy;

import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx1Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx3Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx4Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx5Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx1Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx3Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx4Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx5Bean;
import br.com.wpattern.frameworks.resteasy.utils.interfaces.IMathRestService;

@Named
public class MathServices implements IMathRestService {

	private Logger logger = Logger.getLogger(this.getClass());

	public MathServices() {
		this.logger.info("Math service started.");
	}

	@Override
	public String hello() {
		this.logger.info("GET service called.");
		return "Hello RESTEasy!";
	}

	@Override
	public ResponseEx1Bean exercicio1(RequestEx1Bean requesEx1Bean) {
		this.logger.info("POST service called.");
		double total = (double) (requesEx1Bean.getValue1() * 9 / 100 + 200);

		return new ResponseEx1Bean(total);
	}
	
	@Override                                       
	public ResponseEx3Bean exercicio3(RequestEx3Bean requestEx3Bean){
		this.logger.info("POST service called.");
		int s =requestEx3Bean.getValor1()+requestEx3Bean.getValor2()+requestEx3Bean.getValor3()+requestEx3Bean.getValor4();
		int p =requestEx3Bean.getValor1()*requestEx3Bean.getValor2()*requestEx3Bean.getValor3()*requestEx3Bean.getValor4();
		double m=(s)/4;
        
		
		return new ResponseEx3Bean(s,p,m);
	}
	
	@Override
	public ResponseEx4Bean exercicio4(RequestEx4Bean requestEx4Bean){
		String resposta1 = " => encaixa";
		String resposta2 = " => nao encaixa";
		String r;
		
        int  a,b,subseq, maior, menor;
		
		a = requestEx4Bean.getA();
		b = requestEx4Bean.getA();
		if (a > b) {
			maior = a;
			menor = b;
		} else {
			maior = b;
			menor = a;
		}

		subseq = 0;
		while (maior >= menor) {
			if (requestEx4Bean.Exercicio4s(maior, menor) == 1)
				subseq = 1;
			maior = menor / 10;
		}
		if (subseq == 1) {
			System.out.println(+requestEx4Bean.getA() + " "
					+ requestEx4Bean.getB() + " => encaixa\n");
			
					r= resposta1;
		} else {

			System.out.println(+requestEx4Bean.getA() + " "
					+ requestEx4Bean.getB() + "=> nao encaixa\n");
			
			r= resposta2;
		}


        
     return new ResponseEx4Bean(r);   
       

		 
	}
	
	
	
	@Override
	public ResponseEx5Bean exercicio5(RequestEx5Bean requestEx5Bean){
		String resposta1 = " => um é segmento do outro";	
			
		String resposta3 = " => um não é segmento do outro";
		String r;
		
        int  a,b,subseq = 0, maior, menor;
		
		a = requestEx5Bean.getA();
		b = requestEx5Bean.getA();
		maior = a;
		  if (a < b) {
		    a = b;
		    b = maior;
		    maior = a; /* guarda maior entre a e b */
		  }

		  while ((maior >= b) && (subseq == 0)) {
		    if (requestEx5Bean.Exercicio5s(maior, b) == 1)
		      subseq = 1;
		    maior = maior/10;
		  }
		  
		  if (subseq == 1)
		   
			 
		  r= resposta1;
		  
		 
		  else
			  r=resposta3;

        
     return new ResponseEx5Bean(r);   
       

		
	}



}
