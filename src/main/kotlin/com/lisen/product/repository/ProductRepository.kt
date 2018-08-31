package com.lisen.product.repository

import com.lisen.product.model.Product
import org.springframework.data.jpa.repository.JpaRepository

/**
 *
 *
 * @author lisen
 * @create 2018-08-29 04-55
 *
 **/
interface ProductRepository : JpaRepository<Product, Int> {



}