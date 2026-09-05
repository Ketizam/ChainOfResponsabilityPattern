package Chain;
import Request.Request;
import Request.RequestHandler;

public class Coordinator extends RequestHandler {
    @Override 
    public void handleRequest(Request request) {
        
        System.out.println("Coordinator: handling request ="+ request.getDescription());
        if (request.getType().equalsIgnoreCase("CAMBIO_HORARIO")){
            System.out.println("Request solved by Coordinator");
        }else{
            System.out.println("Coordinator can't solve the request, passing to next handler");
            nextOrEnd(request);
        }
    }

}
