package com.lisen.product.model

import java.math.BigDecimal
import javax.persistence.*

/**
 *
 *
 * @author lisen
 * @create 2018-08-29 04-59
 *
 **/
@Entity
@Table(name = "t_product")
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