package lf.adotapet.services

import lf.adotapet.models.AdotanteModel
import lf.adotapet.repositories.AdotanteRepository
import org.springframework.stereotype.Service

@Service
class AdotanteService(
        private val adotanteRepository: AdotanteRepository
) {

    fun create(adotanteModel: AdotanteModel){
        adotanteRepository.save(adotanteModel)
    }

    fun getById(adotanteId: Int): AdotanteModel{
        return adotanteRepository.findById(adotanteId).orElseThrow()
    }
}