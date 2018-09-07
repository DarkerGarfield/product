package com.lisen.product.model

import javax.persistence.*

/**
 *
 *
 * @author   lisen
 * @create   2018-08-31 下午2:29
 *
 **/

@Entity
@Table(name = "t_category")
data class Category(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        var name: String = ""
)