package sistema.dao;

import java.util.ArrayList;
import java.util.List;

import sistema.beans.Estudante;

public class EstudanteDao {
	
	private static List<Estudante> dados = 
			new ArrayList<Estudante>();
	
	public void cadastrar(Estudante a) {
		dados.add(a);
	}
	
	public void excluir(Estudante a) {
		dados.remove(a);
	}
	
	public List<Estudante> pesquisar(){
		return dados;
	}

}
