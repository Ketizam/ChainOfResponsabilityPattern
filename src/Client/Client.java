package Client;
import Chain.Coordinator;
import Chain.DeanOffice;
import Chain.Monitor;
import Chain.Secretariat;
import Chain.Teacher;
import Request.Request;
import Request.RequestHandler;

public class Client {
    public static void main(String[] args) {
        RequestHandler monitor = new Monitor();
        RequestHandler teacher = new Teacher();
        RequestHandler coordinator = new Coordinator();
        RequestHandler secretariat = new Secretariat();
        RequestHandler deanOffice = new DeanOffice();

        monitor.setNext(teacher);
        teacher.setNext(coordinator);
        coordinator.setNext(secretariat);
        secretariat.setNext(deanOffice);

        Request[] requests = {
            new Request("ASISTENCIA", "The student arrived late and needs to justify the entry"),
            new Request("PERMISO_CLASE", "The student requests permission to leave class early"),
            new Request("CAMBIO_HORARIO", "The student requests a change in class schedule"),
            new Request("CERTIFICADO", "The student requests a certificate of enrollment"),
            new Request("SANCION_DISCIPLINARIA", "The student has been sanctioned for misconduct"),
            new Request("OTRO", "The student wants to get off of the university")
        };

        for (Request request : requests) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("///////////////////Client: Sending request  = " + request.getDescription()+ "///////////////////");
            System.out.println("----------------------------------------------------------------");
            monitor.handleRequest(request);
            System.out.println();
        }
        
        
    }
}
