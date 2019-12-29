package byteBank.conta;

public class TestBank {

	public static void main(String[] args) {
		Cliente clienteDoPaulo = new Cliente();
		
		clienteDoPaulo.setNome("Paulo Silva");
		clienteDoPaulo.setCpf("222.222.222-22");
		clienteDoPaulo.setProfissao("Programador");
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.setTitular(clienteDoPaulo);
		
		System.out.println("Nome cliente: " + contaDoPaulo.getTitular().getNome());
		
		int[] num = {1,2,3};
	}

}
