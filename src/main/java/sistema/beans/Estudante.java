package sistema.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Estudante implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer codigo;

	private String nome;
	
	private String email;
	
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	private String situacao;

	private List<TurmaEstudante> turmaEstudantes = new ArrayList<TurmaEstudante>();

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TurmaEstudante> getTurmaEstudantes() {
		return turmaEstudantes;
	}

	public void setTurmaEstudantes(List<TurmaEstudante> turmaEstudantes) {
		this.turmaEstudantes = turmaEstudantes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
