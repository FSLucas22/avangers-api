package com.lucas.learn.avergersapi.application.web.resource.request

import com.lucas.learn.avergersapi.domain.avenger.Avenger
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

data class AvengerRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val nick: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val person: String,

    val description: String? = null,
    val history: String? = null
) {
    fun toAvenger() = Avenger(
        nick = this.nick,
        person = this.person,
        description = this.description,
        history = this.history
    )

    companion object {
        fun to(id: Long?, request: AvengerRequest) = Avenger(
            id = id,
            nick = request.nick,
            person = request.person,
            description = request.description,
            history = request.history
        )
    }
}