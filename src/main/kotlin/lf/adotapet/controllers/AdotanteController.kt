package lf.adotapet.controllers

import lf.adotapet.controllers.requests.AdotantePostRequest
import lf.adotapet.extension.toAdotanteModel
import lf.adotapet.services.AdotanteService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/adotante")
class AdotanteController(
    private val adotanteService: AdotanteService
) {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody adotantePostRequest: AdotantePostRequest){
        adotanteService.create(adotantePostRequest.toAdotanteModel())
    }


}