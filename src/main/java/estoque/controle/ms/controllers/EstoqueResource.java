package estoque.controle.ms.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estoque.controle.ms.entity.Estoque;
import estoque.controle.ms.repository.service.EstoqueService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value="/api/estoque")
public class EstoqueResource {

	private final static Logger log = LoggerFactory.getLogger(EstoqueResource.class);
	private EstoqueService estoqueService;

	EstoqueResource(EstoqueService estoqueService) {
       this.estoqueService = estoqueService;
	}

	@GetMapping
	public ResponseEntity<List<Estoque>> getEstoque() throws NoSuchBeanDefinitionException {
		log.info("EstoqueResource: iniciando processamento getEstoque()");
		
		try {
			List<Estoque> estoques = estoqueService.getAll();
			return new ResponseEntity<List<Estoque>>(estoques, HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			log.info("EstoqueResource: Erro ao processar getEstoque({})", e.getCause().toString());
			return new ResponseEntity<List<Estoque>>(HttpStatus.BAD_REQUEST);
		} finally {
			log.info("EstoqueResource: finalizando processamento getEstoque()");
		}
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Optional<Estoque>> getEstoquePorId(@PathVariable Integer id){
		log.info("EstoqueResource: iniciando processamento getEstoque(/{})", id);
		Optional<Estoque> estoques = estoqueService.getById(id);
		log.info("EstoqueResource: finalizando processamento getEstoque(/{})", id);
		return new ResponseEntity<Optional<Estoque>>(estoques, HttpStatus.ACCEPTED); 
	}	
	
	@GetMapping(path = {"/empresa/{id}"})
	public ResponseEntity<Estoque> getEstoquePorEmpresa(@PathVariable Long id){
		log.info("EstoqueResource: iniciando processamento getEstoque(/{})", id);
		log.info("EstoqueResource: finalizando processamento getEstoque(/{})", id);
		return new ResponseEntity<Estoque>(HttpStatus.ACCEPTED); 
	}	
	
	@GetMapping(path = {"/produto/{id}"})
	public ResponseEntity<Estoque> getEstoquePorProduto(@PathVariable Long id){
		log.info("EstoqueResource: iniciando processamento getEstoque(/{})", id);
		log.info("EstoqueResource: finalizando processamento getEstoque(/{})", id);
		return new ResponseEntity<Estoque>(HttpStatus.ACCEPTED); 
	}	
	
	@GetMapping(path = {"/{idEmpresa}/{idProduto}"})
	public ResponseEntity<Estoque> getEstoquePorEmpresaProduto(@PathVariable Long idEmpresa, Long idProduto){
		log.info("EstoqueResource: iniciando processamento getEstoque(/{}/{})", idEmpresa, idProduto);
		log.info("EstoqueResource: finalizando processamento getEstoque(/{}/{})", idEmpresa, idProduto);
		return new ResponseEntity<Estoque>(HttpStatus.ACCEPTED); 
	}	
	
	@PutMapping
	public ResponseEntity<Estoque> putEstoque(@RequestBody Estoque estoque){
		log.info("EstoqueResource: iniciando processamento putEstoque()");
		try {
			Estoque novoEstoque = estoqueService.save(estoque);
			log.info("EstoqueResource: finalizando processamento putEstoque()");
			
			return new ResponseEntity<Estoque>(novoEstoque, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.info("EstoqueResource: Erro ao salvar estoque putEstoque({})", e.getCause().toString());
			return new ResponseEntity<Estoque>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(path = {"/{id}"})
	public ResponseEntity<?> deleteEstoque(@PathVariable Long id){
		log.info("EstoqueResource: iniciando processamento deleteEstoque({})", id);
		log.info("EstoqueResource: finalizando processamento deleteEstoque({})", id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED); 
	}

}
