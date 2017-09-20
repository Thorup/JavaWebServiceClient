import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;


public class WebServiceClient
{
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL("http://localhost:1024/ws/hello?wsdl");
            QName qname = new QName("http://localhost:1024/ws/hello", "WebServiceImplementationService");
            Service service = Service.create(url, qname);
            WebServiceInterface webServiceServerInterface = service.getPort(WebServiceInterface.class);
            System.out.println(webServiceServerInterface.getHelloWorldAsString("Alex"));
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
