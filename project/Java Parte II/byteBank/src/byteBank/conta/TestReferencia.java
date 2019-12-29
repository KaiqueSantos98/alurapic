package byteBank.conta;

public class TestReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.setSaldo(300.00);
		System.out.println(primeiraConta.getSaldo());
		
		// Os dois objs apontam para a mesma referencia.
        Conta outraConta = primeiraConta;
        outraConta.setSaldo(outraConta.getSaldo() + 1000.0);
        
        System.out.println(primeiraConta.getSaldo());
        
        
        if(primeiraConta.equals(outraConta)) {
        	System.out.println("A mesma conta");
        }
	}

}
