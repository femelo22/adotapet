package lf.adotapet.extension

import lf.adotapet.controllers.requests.AnimalPostRequest
import lf.adotapet.models.AnimalModel

fun AnimalPostRequest.toAnimalModel(): AnimalModel {
    return AnimalModel(
            nome = this.nome,


    )

}