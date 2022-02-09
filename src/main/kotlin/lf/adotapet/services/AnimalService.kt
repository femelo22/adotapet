package lf.adotapet.services

import lf.adotapet.models.AnimalModel
import lf.adotapet.repositories.AnimalRepository
import org.springframework.stereotype.Service

@Service
class AnimalService(
     private val animalRepository: AnimalRepository
) {

    fun cadastrar(animal: AnimalModel){
        animalRepository.save(animal)
    }

    fun listarTodos(): List<AnimalModel>{

        val m: List<AnimalModel> = animalRepository.findAll();

        return animalRepository.findAll()
    }
}