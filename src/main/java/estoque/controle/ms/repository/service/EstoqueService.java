package estoque.controle.ms.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;

import estoque.controle.ms.entity.Estoque;

public interface EstoqueService {

	Optional<Estoque> getById(Integer idEstoque);	
    Estoque save(Estoque estoque);
    
    @Cacheable(value = "estoque")
    List<Estoque> getAll();
}
