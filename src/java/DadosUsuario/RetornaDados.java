/*
 * WebService. Recebe nome como parâmetro e retorna nome e idade em um String.
*/
package DadosUsuario;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "RetornaDados")
@Stateless()
public class RetornaDados 
{
    @WebMethod(operationName = "Retorna")
    public String Retorna(@WebParam(name = "nome") String nome) 
    {
        int idade = 10;
        String dados = "Nome: " + nome + " Idade: " + idade;
        return dados;
    }
}
