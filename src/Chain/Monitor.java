package Chain;
import Request.Request;
import Request.RequestHandler;

public class Monitor extends RequestHandler {
    @Override 
    public void handleRequest(Request request) {
        
        System.out.println("Monitor: handling request ="+ request.getDescription());
        if (request.getType().equalsIgnoreCase("ASISTENCIA")){
            System.out.println("Request solved by Monitor");
        }else{
            System.out.println("Monitor can't solve the request, passing to next handler");
            nextOrEnd(request);
        }
    }

}
