package lf.adotapet.models

import lf.adotapet.enums.StatusPet
import lf.adotapet.enums.TipoPelagem
import javax.persistence.*

@Entity(name = "TB_ANIMAL")
data class AnimalModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    val nome: String,

    @Column
    val idade: String,

    @Column
    val vacina: String,

    @Column
    val raca: String,

    @Column
    val sexo: String,

    @Column
    val castrado: Boolean,

    @Column
    @Enumerated(EnumType.STRING)
    val pelagem: TipoPelagem,

    @Column
    val cor: String,

    @ManyToOne
    @JoinColumn(name = "adotante_id")
    val adotante: AdotanteModel? = null

){
    @Column
    @Enumerated(EnumType.STRING)
    var status: StatusPet? = StatusPet.DISPONIVEL

    constructor(id: Int?, nome: String, idade: String, vacina: String, raca: String, sexo: String, castrado: Boolean, pelagem: TipoPelagem, cor: String, adotante: AdotanteModel, statusPet: StatusPet): this(id, nome, idade, vacina, raca, sexo, castrado, pelagem, cor, adotante){
        this.status = status
    }

}