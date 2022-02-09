package lf.adotapet.controllers.requests

import lf.adotapet.enums.TipoPelagem
import lf.adotapet.models.AdotanteModel
import javax.persistence.Column

data class AnimalPostRequest (

        val nome: String,

        val idade: String,

        val vacina: String,

        val raca: String,

        val sexo: String,

        val castrado: Boolean,

        val pelagem: TipoPelagem,

        val cor: String,

        val adotanteId: AdotanteModel

)