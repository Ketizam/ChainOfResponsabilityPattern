package Chain;
import Request.Request;
import Request.RequestHandler;

public class Secretariat extends RequestHandler {
    @Override 
    public void handleRequest(Request request) {
        
        System.out.println("Secretariat: handling request ="+ request.getDescription());
        if (request.getType().equalsIgnoreCase("CERTIFICADO")){
            System.out.println("Request solved by Secretariat");
        }else{
            System.out.println("Secretariat can't solve the request, passing to next handler");
            nextOrEnd(request);
        }
    }

}
