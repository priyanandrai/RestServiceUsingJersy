import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;



@Path("/request")
public class Classone {

    @GET
    @Path("/data")	
    
	public String data(@QueryParam("amitrai") String data ){
    	System.out.println("-- "+ data);
		return "modify Data ";
		
	}
    
    
    @POST
    @Path("/datapost")	
    
	public String data1(String arg){
    	System.out.println("i am coming here    111   "+ arg);
		return "data";
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	}
}


