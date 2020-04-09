package sistema.beans;

import java.io.Serializable;

public class TurmaEstudante implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	
	private Estudante estudante;
	
	private Turma turma;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
