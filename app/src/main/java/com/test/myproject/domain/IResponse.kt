package com.test.myproject.domain

import kotlinx.serialization.Serializable


@Serializable
data class IResponse(
    val session_token: String? = null,
    val ui: UI? = null
) : java.io.Serializable


@Serializable
data class UI(
    val nodes: List<Node>
) : java.io.Serializable


@Serializable
data class Node(
    val messages: List<Message>,
    val meta: Meta? = null
) : java.io.Serializable


@Serializable
data class Message(
    val text: String
) : java.io.Serializable

@Serializable
data class Meta(
    val label: Label? = null
)

@Serializable
data class Label(
    val text: String
)


