package com.lisen.product.service

import com.lisen.product.model.Category

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:41
 *
 **/

interface CategoryService {

    fun findAll(): List<Category>

}