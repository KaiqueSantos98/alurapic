package certificacao.br.com.certificacao.tiposDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.sort;

class Mae{
	Mae(String s){
		System.out.println("mae");
	}
	
	Mae(int i){
		
	}
}

class Filha extends Mae{
	public Filha(String s) {
		super(s);
		System.out.println(s);
	}
	
	Filha(int i){
		this("numero: " + i);
		System.out.println("fim construtor com numero");
	}
}

class B {
    B() {
    	System.out.println("vazio");
    }
    B(String s) {
        this();
        System.out.println("s");
    }
}
class A {
    public static void main(String[] args) {
        String s = null;
        B b = new B(s);
    }
}

public class Teste {
	
	public static void main(String[] args) {
		String [][] strings = {{"A", "Z"}, {"C", "D", "S"}, {"L"}};
	
		Arrays.sort(strings);
	}
	
	public void teste() {
	}
}

class Funcionario{
	String nome;
	double salario;
	
	double soma(int a) {
		return a;
	}	
	Funcionario() {
		
	}
	
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public void mostraMensagem() {
		System.out.println("F");
	}
}

class Vendedor extends Funcionario{
	double comissao;
	
	Vendedor(String nome, double salario, double comissao){
		super(nome, salario);
		this.comissao = comissao;
	}	
	
	@Override
	public final void mostraMensagem() {
		System.out.println("V");
	}
	
	public void tempo() {
		System.out.println("Exibe Vendedor");
	}
}


class Gerente extends Funcionario{
	double bonus;
	
	@Override
	public void mostraMensagem() {
		System.out.println("G");
	}
	
	public void tempo() {
		System.out.println("Exibe Gerente");
	}
	
	Gerente(String nome, double salario, double bonus){
		super(nome, salario);
		this.bonus = bonus;
	}	
}

class RelatorioMensal{
	public void holeriteFuncionario(Funcionario f) {
		if(f instanceof Vendedor) {
			System.out.println("Relatorio vendedor !! ");
			System.out.println("Vendedor: " + f.nome);
		}
		
		if(f instanceof Gerente) {
			System.out.println("Relatorio Gerente !! ");
			System.out.println("Gerente: " + f.nome);
		}
	}
}