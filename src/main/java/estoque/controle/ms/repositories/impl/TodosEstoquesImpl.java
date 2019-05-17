package estoque.controle.ms.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;

import estoque.controle.ms.entities.Estoque;
import estoque.controle.ms.repositories.TodosEstoques;

public class TodosEstoquesImpl implements TodosEstoques{

	@Autowired EntityManagerFactory emf;
	
	@Override
	public List<Estoque> listarEstoquesPorEmpresa(Long idEmpresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estoque> listarEstoquesPorProduto(Long idProduto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estoque listarEstoquesPorProdutoEmpresa(Long idProduto, Long idEmpresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estoque salvar(Estoque estoque) {
		EntityManager em = emf.createEntityManager();
		
		try {
			
			
		} catch (NoResultException e) {
			return null;
			
		} catch (Exception e) {
			
		}		
		return null;
	}

	@Override
	public Estoque inativar(Estoque estoque) {
		return salvar(estoque);

	}

}
