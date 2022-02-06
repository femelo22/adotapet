package lf.adotapet.models

import lf.adotapet.enums.StatusPet
import javax.persistence.Entity

@Entity
data class Animal (

    private val id: Int? = null,

    private val nome: String,

    private val raca: String,

    private val sexo: String,

    private val castrado: Boolean,

    private val pelagem: String,

    private val cor: String,

    private val status: StatusPet
)