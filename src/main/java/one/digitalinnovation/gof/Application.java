// Inicializar um projeto Spring Boot atraves de: https://start.spring.io/
// Converter JSON para Java atraves de: https://www.jsonschema2pojo.org/
// Pegar dados do CEP atraves de: https://viacep.com.br

// REAULTADOS
// 1. Estourou o erro: Unable to create a Configuration, because no Jakarta Bean Validation provider could be found. Add a provider like Hibernate Validator (RI) to your classpath.
// Solução - Adicionei a dependencia: spring-boot-starter-validation dependency
// 2. A API exibe o erro: Whitelabel Error Page This application has no explicit mapping for /error, so you are seeing this as a fallback
// Solução: Não encontrei...

package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication // Inicializa a aplicacao Spring Boot
@EnableFeignClients  // ?
public class Application { // Classe principal do sistema, que inicializa tudo (vai chamar os controllers)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}