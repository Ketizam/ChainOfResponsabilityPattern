package Request;
public abstract class RequestHandler {
    protected RequestHandler next;

    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        
    }

    public void nextOrEnd(Request request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("End of the chain, no one could solve the request");
        }

    }
}
