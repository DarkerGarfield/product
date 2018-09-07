package com.lisen.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
open class ProductApplication

fun main(args: Array<String>) {
    runApplication<ProductApplication>(*args)
}
