package com.lisen.product.model

import java.math.BigDecimal
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *
 *
 * @author lisen
 * @create 2018-08-29 04-59
 *
 **/
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = -1,
        var name: String = "",
        var price: BigDecimal = BigDecimal.ZERO,
        var stock: Int = 0,
        var description: String = "",
        var icon: String = "",
        var status: Boolean = false,
        var categoryId: Int = 0
)