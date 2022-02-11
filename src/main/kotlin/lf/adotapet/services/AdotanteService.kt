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

    fun getAll(): List<AdotanteModel> {
        return adotanteRepository.findAll()
    }

    fun update(id: Int, adotanteModel: AdotanteModel){
        val adotante = this.getById(id)
        if(!adotanteRepository.existsById(id)){
            throw Exception()
        }
        adotanteRepository.save(adotante)
    }

    fun delete(id: Int){
        val adotante = adotanteRepository.findById(id).orElseThrow()
        adotanteRepository.delete(adotante)
    }
}