import java.util.Locale;
import java.util.Scanner;

/**
 * Classe do coiso do terminal.
 */
public class ContaTerminal {
    
    int numConta;
    String numAgencia;
    String nomeCliente;
    double saldo = 0.0;
    
    
    public static void main(String[] args) {
	
	System.out.println("OIEEEE!!!!");
	
	var conta = new ContaTerminal();
	
	conta.leConta();
	conta.imprimeConta();
    }
    
    
    void leConta() {
	var out = System.out;
	
	try (var readScan = new Scanner(System.in)) {
	    readScan.useLocale(Locale.of("en", "US"));

	    out.println("Por favor, digite o número da sua conta!");
	    numConta = readScan.nextInt();

	    out.println("Por favor, digite o número da agência!");
	    numAgencia = readScan.next();

	    out.println("Por favor, digite o seu nome!");
	    nomeCliente = readScan.next();
	    
	    out.println("Por favor, digite o seu saldo!");
	    saldo = readScan.nextDouble();
	}
	
    }
    
    
    void imprimeConta() {
	System.out.format(
		"Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %g já está disponível para saque!",
		nomeCliente, numAgencia, numConta, saldo);
    }
    
}

















