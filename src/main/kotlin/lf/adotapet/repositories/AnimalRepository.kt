package lf.adotapet.repositories

import lf.adotapet.models.AnimalModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AnimalRepository: JpaRepository<AnimalModel, Int> {

}