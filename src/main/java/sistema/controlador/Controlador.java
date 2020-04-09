package sistema.controlador;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.beans.Aluno;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class Controlador implements Serializable {

	private List<Aluno> alunos = null;

	@SuppressWarnings("unchecked")
	public String prepararConsulta() {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
			EntityManager em = null;
			
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Aluno a = new Aluno();
			a.setCodigo(1);
			a.setNome("Jose");
			em.persist(a);
			em.getTransaction().commit();
			em.close();
			
			em = emf.createEntityManager();
			String sql = "select * from aluno order by nome";
			Query query = em.createNativeQuery(sql, Aluno.class);
			alunos = query.getResultList();
			return "consultaralunos.xhtml";
			
		} catch (Exception e) {
			return null;
		}
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
