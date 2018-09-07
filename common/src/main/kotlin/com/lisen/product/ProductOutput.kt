package com.lisen.product

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午2:16
 *
 **/
data class ProductOutput(
        var id: Int = 0,
        var name: String = "",
        var price: Int = 0,
        var stock: Int = 0,
        var description: String = "",
        var icon: String = "",
        var status: Boolean = false,
        var categoryId: Int = 0
)