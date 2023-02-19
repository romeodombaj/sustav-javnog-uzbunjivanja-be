package romeodombaj.sustavjavnoguzbunjivanjabe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
@CrossOrigin
public class SustavJavnogUzbunjivanjaBeApplication {

	private final SirenRepository sirenRepository;

	public SustavJavnogUzbunjivanjaBeApplication(SirenRepository sirenRepository){
		this.sirenRepository = sirenRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SustavJavnogUzbunjivanjaBeApplication.class, args);
	}

	@GetMapping("/groups")
	public List<Siren> getSiren(){
		System.out.println("jelo " + sirenRepository.findAll());
		return sirenRepository.findAll();
	}

	/*@GetMapping("/getting")
	public List<Siren> getSiren(){
		System.out.println("jelo " + sirenRepository.findAll());
		return new URI("api/group") sirenRepository.findAll();
	}*/


}
