package estoque.controle.ms.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import estoque.controle.ms.entities.Produto;

public interface TodosProdutos {

	@Cacheable(value = "produto")
	List<Produto> listarProdutos(Long idEmpresa);
}
