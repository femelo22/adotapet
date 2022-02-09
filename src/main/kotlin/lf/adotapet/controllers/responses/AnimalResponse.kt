package lf.adotapet.controllers.responses

import lf.adotapet.enums.TipoPelagem
import lf.adotapet.models.AdotanteModel

data class AnimalResponse(

    val adotante: AdotanteModel?,

    val nome: String,

    val idade: String,

    val vacina: String,

    val raca: String,

    val sexo: String,

    val castrado: Boolean,

    val pelagem: TipoPelagem,

    val cor: String,
)