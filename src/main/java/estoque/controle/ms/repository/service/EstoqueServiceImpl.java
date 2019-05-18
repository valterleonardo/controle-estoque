package estoque.controle.ms.repository.service;

import static java.util.Objects.isNull;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import estoque.controle.ms.entity.Estoque;
import estoque.controle.ms.repository.EstoqueRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EstoqueServiceImpl implements EstoqueService {

    private EstoqueRepository estoqueRepository = null;

    EstoqueServiceImpl(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
 	}
    
    
    public List<Estoque> getAll(){
    	return (List<Estoque>) estoqueRepository.findAll();
    }
    
    @Override
    public Optional<Estoque> getById(Integer id) {
    	Optional<Estoque> estoque = estoqueRepository.findById(id);
        if(isNull(estoque)) {
            return null;
        }
        return estoque;
    }

    @Override
    public Estoque save(Estoque estoque) {
        try {
        	return estoqueRepository.save(estoque);			
		} catch (Exception e) {
			return null;
		}
        
    }
    
}