package estoque.controle.ms.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/estoque")
public class EstoqueResource {
private final static Logger log = LoggerFactory.getLogger(EstoqueResource.class);
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping() {	
		log.info("RequestService: /ping");
	    return new ResponseEntity<>("Pong!", HttpStatus.OK);
	}

}
