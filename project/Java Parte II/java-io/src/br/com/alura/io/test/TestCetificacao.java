package br.com.alura.io.test;

import java.lang.Math. *;
import static java.lang.Math. *;
import java.lang.*;



public class TestCetificacao {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println(p.id);
		
		System.out.println();
			
		System.out.println(Pessoa.id);
		
	}
}

class Pessoa{
	static int id = 1;
	
	static void eat() {
		System.out.println(id);
	}
}