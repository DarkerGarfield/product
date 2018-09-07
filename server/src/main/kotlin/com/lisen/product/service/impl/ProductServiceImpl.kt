package com.lisen.product.service.impl

import com.lisen.product.model.Product
import com.lisen.product.repository.ProductRepository
import com.lisen.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:21
 *
 **/

@Service
class ProductServiceImpl : ProductService {

    @Autowired
    lateinit var productRepository: ProductRepository

    override fun findAllByCategoryId(categoryId: Int): List<Product> = productRepository.findByCategoryIdIsAndStatusTrue(categoryId)
}