package estoque.controle.ms.repository.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import estoque.controle.ms.entity.Estoque;

public interface EstoqueService {

	Estoque getById(Integer idEstoque);	
    Estoque save(Estoque estoque);
    boolean delete(Integer id);
    
    @Cacheable(value = "estoque")
    List<Estoque> getAll();
    @Cacheable(value = "estoque")
	List<Estoque> getEstoquePorEmpresaId(Integer idEmpresa);
    @Cacheable(value = "estoque")
	List<Estoque> getEstoquePorProdutoId(Integer idProduto);
    @Cacheable(value = "estoque")
	List<Estoque> getEstoquePorEmpresaProduto(Integer idProduto, Integer idEmpresa);
	
}
