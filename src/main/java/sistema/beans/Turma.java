package sistema.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Turma implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	
	private String professor;
	
	private List<TurmaEstudante> turmaEstudantes = 
			new ArrayList<TurmaEstudante>();
	
	private Curso curso;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public List<TurmaEstudante> getTurmaEstudantes() {
		return turmaEstudantes;
	}

	public void setTurmaEstudantes(List<TurmaEstudante> turmaEstudantes) {
		this.turmaEstudantes = turmaEstudantes;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
