package lf.adotapet.models

import javax.persistence.*

@Entity(name = "TB_ADOTANTE")
data class AdotanteModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Int? = null,

    @Column
    private val nome: String,

    @Column
    private val cpf: String,

    @Column
    private val telefone: String,

    @Column
    private val email: String

)