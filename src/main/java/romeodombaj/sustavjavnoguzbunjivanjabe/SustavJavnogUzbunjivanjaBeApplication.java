package romeodombaj.sustavjavnoguzbunjivanjabe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SustavJavnogUzbunjivanjaBeApplication {

	private final SirenRepository sirenRepository;

	public SustavJavnogUzbunjivanjaBeApplication(SirenRepository sirenRepository){
		this.sirenRepository = sirenRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SustavJavnogUzbunjivanjaBeApplication.class, args);
	}

	@GetMapping("/getting")
	public List<Siren> getSiren(){
		System.out.println("jelo " + sirenRepository.findAll());
		return sirenRepository.findAll();
	}


}
