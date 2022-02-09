package lf.adotapet.controllers

import lf.adotapet.controllers.requests.AnimalPostRequest
import lf.adotapet.controllers.responses.AnimalResponse
import lf.adotapet.extension.toAnimalModel
import lf.adotapet.extension.toResponse
import lf.adotapet.services.AdotanteService
import lf.adotapet.services.AnimalService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/animais")
class AnimalController(
    private val animalService: AnimalService,
    private val adotanteService: AdotanteService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastrar(@RequestBody dto: AnimalPostRequest) {
        val adotante = adotanteService.getById(dto.adotanteId)
        animalService.cadastrar(dto.toAnimalModel(adotante))
    }

    @GetMapping
    fun listarTodos(): List<AnimalResponse> {
        return animalService.listarTodos().map { it.toResponse() }
    }



}