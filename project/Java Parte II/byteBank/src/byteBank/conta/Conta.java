package byteBank.conta;

public class Conta {
	private double saldo;
	private String agencia;
	private int numero;
	private Cliente titular;
	
	
	public boolean sacar(Double valor) {
		if(this.getSaldo() <= valor) {
			this.setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso, no valor de R$" + valor);
			
			return true;
		}else {
			System.out.println("Saldo indisponivel.");
			
			return false;
		}		
	}
	
	public void depositar(Double deposito) {
		if(deposito != 0.00) {
			this.setSaldo(getSaldo() + deposito);
		}else{
			System.out.println("Valor invalido.");
		}		
	}
	
	public boolean transfere(Double transfere, Conta contaDestino) {
		if(transfere != 0.00) {
			this.setSaldo(this.getSaldo() - transfere);
			contaDestino.depositar(transfere);
			System.out.println("Transferencia realizado com sucesso.");
			
			return true;
		}else{
			System.out.println("Saldo indisponivel.");
			
			return false;
		}	
		
	}	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
}
