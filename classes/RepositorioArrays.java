package classes;

import java.util.ArrayList;

public class RepositorioArrays {
	
	//------------------Discentes----------------------//
	
	ArrayList<Discente> listaDiscentes = new ArrayList<>();
	
	public void adicionar(Discente discente) {
		if (discente!= null)
			listaDiscentes.add(discente);
	}

	public ArrayList<Discente> getDiscentes() {
		return listaDiscentes;
	}
	
	//------------------Requerimentos------------------//
	
	ArrayList<Requerimento> listaRequerimentos = new ArrayList<>();
	
	public void adicionar(Requerimento requerimento) {
		if (requerimento!= null)
			listaRequerimentos.add(requerimento);
	}

	public ArrayList<Requerimento> getRequerimentos() {
		return listaRequerimentos;
	}
}
