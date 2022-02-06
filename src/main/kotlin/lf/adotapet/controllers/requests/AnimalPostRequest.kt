package lf.adotapet.controllers.requests

data class AnimalPostRequest (

        val nome: String,

        val raca: String,

        val sexo: String,

        val castrado: Boolean,

        val pelagem: String,

        val cor: String,

)