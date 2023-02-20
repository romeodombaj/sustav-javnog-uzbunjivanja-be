package romeodombaj.sustavjavnoguzbunjivanjabe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api")
@CrossOrigin
public class SustavJavnogUzbunjivanjaBeApplication {

	private final SirenRepository sirenRepository;

	@Autowired
	private final SirenService sirenService;

	public SustavJavnogUzbunjivanjaBeApplication(SirenRepository sirenRepository, SirenService sirenService){
		this.sirenRepository = sirenRepository;
		this.sirenService = sirenService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SustavJavnogUzbunjivanjaBeApplication.class, args);
	}

	@GetMapping("/sirenInfo")
	public List<Siren> getSiren(){
		return sirenRepository.findAll();
	}

	/*@GetMapping("/getting")
	public List<Siren> getSiren(){
		System.out.println("jelo " + sirenRepository.findAll());
		return new URI("api/group") sirenRepository.findAll();
	}*/

	@PostMapping("/sirenInfo/add")
	public String add(@RequestBody Siren siren)
	{
		sirenService.saveSiren(siren);
		return "Saved";
	}

	@PutMapping("/sirenInfo/put")
	public String put(@RequestBody Siren siren)
	{
		sirenService.saveSiren(siren);
		return "PUT";
	}

	@PatchMapping("/sirenInfo/{id}")
	public Siren updateSirenAttributes(@PathVariable int id,@RequestBody Map<String, Object> attributes){
		return sirenService.updateSirenByAttribute(id, attributes);
	}


}
