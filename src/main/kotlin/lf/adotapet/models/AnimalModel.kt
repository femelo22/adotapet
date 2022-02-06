package lf.adotapet.models

import lf.adotapet.enums.StatusPet
import javax.persistence.*

@Entity(name = "TB_ANIMAL")
data class AnimalModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Int? = null,

    @Column
    private val nome: String,

    @Column
    private val raca: String,

    @Column
    private val sexo: String,

    @Column
    private val castrado: Boolean,

    @Column
    private val pelagem: String,

    @Column
    private val cor: String,

){
    @Column
    @Enumerated(EnumType.STRING)
    var status: StatusPet? = null

    constructor(id: Int?, nome: String, raca: String, sexo: String, castrado: Boolean, pelagem: String, cor: String, statusPet: StatusPet): this(id, nome, raca, sexo, castrado, pelagem, cor){
        this.status = status
    }
}