package lf.adotapet.extension

import lf.adotapet.controllers.requests.AdotantePostRequest
import lf.adotapet.controllers.requests.AnimalPostRequest
import lf.adotapet.controllers.responses.AnimalResponse
import lf.adotapet.models.AdotanteModel
import lf.adotapet.models.AnimalModel

fun AnimalPostRequest.toAnimalModel(adotante: AdotanteModel): AnimalModel {
    return AnimalModel(
            nome = this.nome,
            idade = this.idade,
            vacina = this.vacina,
            raca = this.raca,
            sexo = this.sexo,
            castrado = this.castrado,
            pelagem = this.pelagem,
            cor = this.cor,
            adotante = adotante
    )
}

fun AnimalModel.toResponse(): AnimalResponse {
    return AnimalResponse(
        adotante = this.adotante,
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

fun AdotantePostRequest.toAdotanteModel(): AdotanteModel {
    return AdotanteModel(
            nome = this.nome,
            cpf = this.cpf,
            telefone = this.telefone,
            email = this.email
    )
}
