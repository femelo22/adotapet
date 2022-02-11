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

    fun getAll(): List<AnimalModel>{
        return animalRepository.findAll()
    }

    fun getById(id: Int): AnimalModel {
        return animalRepository.findById(id).orElseThrow()
    }

    fun update(id: Int, animalModel: AnimalModel){
        val animal = this.getById(id)
        animalRepository.save(animal)
    }

    fun delete(id:Int) {
        val animal = this.getById(id)
        animalRepository.delete(animal)
    }
}