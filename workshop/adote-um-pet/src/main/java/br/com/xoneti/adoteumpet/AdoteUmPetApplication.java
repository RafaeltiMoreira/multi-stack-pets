package br.com.xoneti.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.xoneti.adoteumpet.core.models.Pet;
import br.com.xoneti.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setName("Atena");
		pet.setStory(
				"Momentos emocionantes: Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad recusandae eaque ipsa voluptates quo at. Corrupti, eius? Laborum quo explicabo perferendis placeat reiciendis iure, nesciunt adipisci mollitia vitae beatae at.");
		pet.setPhoto("https://cdn.pixabay.com/photo/2014/08/21/14/51/dog-423398_960_720.jpg");
		petRepository.save(pet);
	}

}
