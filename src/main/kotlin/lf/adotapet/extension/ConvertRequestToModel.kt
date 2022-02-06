package lf.adotapet.extension

import lf.adotapet.controllers.requests.AnimalPostRequest
import lf.adotapet.controllers.responses.AnimalResponse
import lf.adotapet.models.AnimalModel

fun AnimalPostRequest.toAnimalModel(): AnimalModel {
    return AnimalModel(
            nome = this.nome,
            idade = this.idade,
            vacina = this.vacina,
            raca = this.raca,
            sexo = this.sexo,
            castrado = this.castrado,
            pelagem = this.pelagem,
            cor = this.cor,
            adotante = this.adotante
    )
}

fun AnimalModel.toResponse(): AnimalResponse {
    return AnimalResponse(
        nome = this.nome,
        idade = this.idade,
        vacina = this.vacina,
        raca = this.raca,
        sexo = this.sexo,
        castrado = this.castrado,
        pelagem = this.pelagem,
        cor = this.cor
    )
}