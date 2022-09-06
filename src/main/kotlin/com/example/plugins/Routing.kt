package com.example.plugins

import com.example.routes.articleRoutes
import com.example.routes.customerRouting
import com.example.routes.listOrdersRoute
import com.example.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        static("/static") {
            resources("files")
        }
        customerRouting()
        listOrdersRoute()
        totalizeOrderRoute()
        articleRoutes()
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
