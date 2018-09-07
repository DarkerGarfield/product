package com.lisen.product.repository

import com.lisen.product.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 *
 * @author lisen
 * @create 2018-08-29 04-55
 *
 **/

@Repository
interface ProductRepository : JpaRepository<Product, Int> {

    fun findByCategoryIdIsAndStatusTrue(categoryId: Int): List<Product>

}