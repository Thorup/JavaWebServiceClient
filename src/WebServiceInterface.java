import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://localhost:1024/ws/hello")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WebServiceInterface
{
    @WebMethod
    String getHelloWorldAsString(String name);
}
