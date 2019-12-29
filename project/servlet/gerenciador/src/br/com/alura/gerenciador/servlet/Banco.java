package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Empresa> empresaList = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	static{
		Empresa empresa = new Empresa();
		empresa.setNomeEmpresa("IBM");
		empresa.setId(chaveSequencial++);
		
		Empresa empresa1 = new Empresa();
		empresa1.setNomeEmpresa("APPLE");
		empresa1.setId(chaveSequencial++);
		
		empresaList.add(empresa);
		empresaList.add(empresa1);
	}
	
	public void adicionar(Empresa nome){
		nome.setId(chaveSequencial++);
		Banco.empresaList.add(nome);
	}
	
	public List<Empresa> mostrarEmpresas(){
		return Banco.empresaList;
	}

	public static List<Empresa> getEmpresaList() {
		return empresaList;
	}

	public static void setEmpresaList(List<Empresa> empresaList) {
		Banco.empresaList = empresaList;
	}

	public void removerEmpresa(Integer id) {
		Iterator<Empresa> it = empresaList.iterator();
		
		while (it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId().equals(id)) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer id) {
		for(Empresa empresa : empresaList) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}
}
