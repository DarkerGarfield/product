package com.lisen.product.vo

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:37
 *
 **/
data class ResponseVO<T>(
        var code: Int = 0,
        var msg: String = "",
        var data: T? = null
)