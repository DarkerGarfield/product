package com.lisen.product.vo

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:36
 *
 **/
data class CategoryVO(
        var id: Int = 0,
        var name: String = "",
        var products: List<ProductVO>
)