package br.com.wpattern.frameworks.resteasy.utils.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.wpattern.frameworks.resteasy.utils.ServiceName;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx1Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx3Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx4Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestEx5Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx1Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx3Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx4Bean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseEx5Bean;



@Path(ServiceName.MATH_SERVICE)
@Produces(MediaType.APPLICATION_JSON)//Content-Type:application/json
@Consumes(MediaType.APPLICATION_JSON)//Content-Type:application/json
public interface IMathRestService {
	@GET
	public String hello();

		
	
	
	@POST//    {"requestEx1Bean":{"value1":5000}}
	@Path("/exercicio1")
	public ResponseEx1Bean exercicio1(RequestEx1Bean requestEx1Bean);
	
	@POST//    {"requestEx3Bean":{"valor1":10,"valor2":40,"valor3":30,"valor4":35}}
	@Path("/exercicio3")
	public ResponseEx3Bean exercicio3(RequestEx3Bean requestEx3Bean);
	
	

	@POST
	@Path("exercicio4") // {"requestEx4Bean":{"a": 2457, "b": 245}}
	public ResponseEx4Bean exercicio4(RequestEx4Bean requestEx4Bean);
	
	@POST
	@Path("exercicio5") // {"requestEx5Bean":{"a": 567890, "b": 678}}
	public ResponseEx5Bean exercicio5(RequestEx5Bean requestEx5Bean);
	
	
	

	

}
