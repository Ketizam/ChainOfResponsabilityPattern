package Chain;
import Request.Request;
import Request.RequestHandler;

public class Teacher extends RequestHandler {
    @Override 
    public void handleRequest(Request request) {
        
        System.out.println("Teacher: handling request ="+ request.getDescription());
        if (request.getType().equalsIgnoreCase("PERMISO_CLASE")){
            System.out.println("Request solved by Teacher");
        }else{
            System.out.println("Teacher can't solve the request, passing to next handler");
            nextOrEnd(request);
        }
    }

}
