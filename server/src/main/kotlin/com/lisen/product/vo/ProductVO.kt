package com.lisen.product.vo

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:34
 *
 **/
data class ProductVO(
        var id: Int = 0,
        var name: String = "",
        var price: Double = 0.0,
        var description: String = "",
        var icon: String = ""
)