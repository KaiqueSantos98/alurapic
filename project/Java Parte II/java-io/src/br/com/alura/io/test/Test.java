package br.com.alura.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;

public class Test {
	public static void main(String[] args) throws IOException{
		
		// Fluxo de entrada com arquivo.
		
		FileInputStream file = new FileInputStream("explicacao.txt"); // Byte
		InputStreamReader read = new InputStreamReader(file); // Caracteres
		
		BufferedReader br = new BufferedReader(read); // juntos todos caracteres em uma linha.
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();
		
		System.out.println("************************************");
		
		/*
		 * Outra forma de entrada de dados com arquivo.
		 */
		
		
		FileInputStream arquivo = new FileInputStream("explicacao.txt"); // Byte
		InputStreamReader leitura = new InputStreamReader(arquivo); // Caracteres
		
		BufferedReader ler = new BufferedReader(leitura); // juntos todos caracteres em uma linha.
		
		String line = ler.readLine();
		
		while (line != null) {
			System.out.println(line);	
			line = ler.readLine();			 
		}
		
		
		ler.close();
	}
}
