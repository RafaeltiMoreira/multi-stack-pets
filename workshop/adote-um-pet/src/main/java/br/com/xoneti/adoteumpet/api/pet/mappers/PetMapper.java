package br.com.xoneti.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.xoneti.adoteumpet.api.pet.dtos.PetResponse;
import br.com.xoneti.adoteumpet.core.models.Pet;

@Component
public class PetMapper {

    public PetResponse toResponse(Pet pet) {
        var petResponse = new PetResponse();
        petResponse.setId(pet.getId());
        petResponse.setName(pet.getName());
        petResponse.setStory(pet.getStory());
        petResponse.setPhoto(pet.getPhoto());
        return petResponse;
    }

}
