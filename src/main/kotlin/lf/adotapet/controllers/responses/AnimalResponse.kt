package lf.adotapet.controllers.responses

import lf.adotapet.enums.TipoPelagem

data class AnimalResponse(

    val nome: String,

    val idade: String,

    val vacina: String,

    val raca: String,

    val sexo: String,

    val castrado: Boolean,

    val pelagem: TipoPelagem,

    val cor: String,
)