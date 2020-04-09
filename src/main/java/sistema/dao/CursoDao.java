package sistema.dao;

import java.util.ArrayList;
import java.util.List;

import sistema.beans.Curso;

public class CursoDao {

	private static List<Curso> dados = 
			new ArrayList<Curso>();
	
	public void cadastrar(Curso a) {
		dados.add(a);
	}
	
	public void excluir(Curso a) {
		dados.remove(a);
	}
	
	public List<Curso> listar(){
		return dados;
	}
}
