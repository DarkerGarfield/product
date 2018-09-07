package com.lisen.product.service

import com.lisen.product.model.Product

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:17
 *
 **/
interface ProductService {

    fun findAllByCategoryId(categoryId: Int): List<Product>

}