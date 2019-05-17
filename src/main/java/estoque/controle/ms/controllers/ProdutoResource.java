package estoque.controle.ms.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import estoque.controle.ms.entities.Produto;

@RestController
@RequestMapping(value="/api/produto")
public class ProdutoResource {
	
private final static Logger log = LoggerFactory.getLogger(ProdutoResource.class);
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping() {	
		log.info("RequestService: /ping");
	    return new ResponseEntity<>("Pong!", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Produto> listarProdutos(){
		
		
		return new ResponseEntity<Produto>(HttpStatus.BAD_REQUEST);
		
	}

}
