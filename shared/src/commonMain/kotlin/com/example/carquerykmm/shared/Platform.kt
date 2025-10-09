package com.example.carquerykmm.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
