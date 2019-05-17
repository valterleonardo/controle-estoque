package estoque.controle.ms.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import estoque.controle.ms.entities.Estoque;

public interface TodosEstoques {

	@Cacheable(value = "estoque")
	List<Estoque> listarEstoquesPorEmpresa(Long idEmpresa);
	
	@Cacheable(value = "estoque")
	List<Estoque> listarEstoquesPorProduto(Long idProduto);
	
	@Cacheable(value = "estoque")
	Estoque listarEstoquesPorProdutoEmpresa(Long idProduto, Long idEmpresa);
	
	Estoque salvar(Estoque estoque);
	
	Boolean remover(Estoque estoque);
	
	
}
