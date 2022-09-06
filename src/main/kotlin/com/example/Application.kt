package com.example

import com.example.dao.DatabaseFactory
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.application.*

//fun main() {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//        configureSerialization()
//        configureRouting()
//        configureTemplating()
//    }.start(wait = true)
//}

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    DatabaseFactory.init()
    configureRouting()
    configureTemplating()
    configureSerialization()
}