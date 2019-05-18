package estoque.controle.ms;

import java.util.Date;
import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import estoque.controle.ms.dict.StatusEstoque;
import estoque.controle.ms.entity.Estoque;
import estoque.controle.ms.repository.EstoqueRepository;


@SpringBootApplication(scanBasePackages = "estoque.controle.ms")
@EnableJpaRepositories("estoque.controle.ms.repository")
@EntityScan("estoque.controle.ms.entity")
public class MsControleEstoqueApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MsControleEstoqueApplication.class, args);
	}
	
//	@Bean
//    CommandLineRunner init(EstoqueRepository repository) {
//        return args -> {
//            repository.deleteAll();
//            LongStream.range(1, 61)
//                    .mapToObj(i -> {
//                        Estoque c = new Estoque();
//                        c.setAtivo(true);
//                        c.setDataEntrada(new Date());
//                        c.setQuantidade(10);
//                        c.setStatus(StatusEstoque.DISPONIVEL);
//                        return c;
//                    })
//                    .map(v -> repository.save(v))
//                    .forEach(System.out::println);
//        };
//    }
}