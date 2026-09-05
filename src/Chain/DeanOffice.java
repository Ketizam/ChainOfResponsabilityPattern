package Chain;
import Request.Request;
import Request.RequestHandler;

public class DeanOffice extends RequestHandler {
    @Override 
    public void handleRequest(Request request) {
        
        System.out.println("DeanOffice: handling request ="+ request.getDescription());
        if (request.getType().equalsIgnoreCase("SANCION_DISCIPLINARIA")){
            System.out.println("Request solved by DeanOffice");
        }else{
            System.out.println("DeanOffice can't solve the request, passing to next handler");
            nextOrEnd(request);
        }
    }

}
