package com.lucas.learn.avergersapi.application.web.resource.respose

import com.lucas.learn.avergersapi.domain.avenger.Avenger

data class AvengerResponse(
    val id: Long?,
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
) {
    companion object {
        fun from(avenger: Avenger) = AvengerResponse(
            id = avenger.id,
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.history,
            history = avenger.history
        )
    }
}