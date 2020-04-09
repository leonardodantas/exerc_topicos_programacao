package sistema.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import sistema.beans.Estudante;
import sistema.dao.EstudanteDao;

@SessionScoped
public class EstudanteControlador implements Serializable {

	private static final long serialVersionUID = 1L;

	private Estudante estudante;

	private List<Estudante> estudantes = null;
	
	private List<SelectItem> itensSelect;
	
	private String itemSelecionar;
	
	public List<SelectItem> getItensSelect() {
		return itensSelect;
	}

	public void setItensSelect(List<SelectItem> itensSelect) {
		this.itensSelect = itensSelect;
	}

	public String getItemSelecionar() {
		return itemSelecionar;
	}

	public void setItemSelecionar(String itemSelecionar) {
		this.itemSelecionar = itemSelecionar;
	}

	public String prepararAcessoConsultaEstudantes() {
		estudantes = new EstudanteDao().pesquisar();
		return "consultarestudante.xhtml";
	}

	public String cadastrarEstudante() {
		EstudanteDao dao = new EstudanteDao();
		estudante.setSituacao(itemSelecionar);
		dao.cadastrar(estudante);
		FacesContext a = FacesContext.getCurrentInstance();
		a.addMessage(null, new FacesMessage("Estudante cadastrado!"));
		return "inicial.xhtml";
	}

	public String prepararRemocaoEstudante(Estudante est) {
		this.estudante = est;
		return "excluirestudante.xhtml";
	}

	public String removerEstudante() {
		EstudanteDao dao = new EstudanteDao();
		dao.excluir(estudante);
		return "consultarestudante.xhtml";
	}

	public String prepararCadastrarEstudante() {
		estudante = new Estudante();
		itensSelect = new ArrayList<SelectItem>();
		SelectItem s1 = new SelectItem("Ativo");
		SelectItem s2 = new SelectItem("Inativo");
		SelectItem s3 = new SelectItem("Inadinplente");
		itensSelect.add(s1);
		itensSelect.add(s2);
		itensSelect.add(s3);
		return "cadastrarestudante.xhtml";
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	
	public String listarCursos() {
		return "curso.xhtml";
	}

}
