package sistema.controlador;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import sistema.beans.Curso;
import sistema.dao.CursoDao;

@Named
public class CursoControlador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Curso> cursos = null;
	private Curso curso;
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Curso> listarCursos(){
		return this.cursos;
	}
	
	public String getCursos(){
		cursos = new CursoDao().listar();
		return "curso.xhtml";
	}
	
	public String inserirCurso() {
		CursoDao cursoDao = new CursoDao();
		cursoDao.cadastrar(this.curso);
		return "inicial.xhtml";
	}
	
	public String deletar(Curso curso) {
		CursoDao cursoDao = new CursoDao();
		cursoDao.excluir(curso);
		return "curso.xhtml";
	}
	
	

}
