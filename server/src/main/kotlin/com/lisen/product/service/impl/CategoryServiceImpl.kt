package com.lisen.product.service.impl

import com.lisen.product.model.Category
import com.lisen.product.repository.CategoryRepository
import com.lisen.product.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:42
 *
 **/

@Service
open class CategoryServiceImpl : CategoryService {

    @Autowired
    lateinit var categoryRepository: CategoryRepository

    @Transactional(rollbackFor = [Exception::class])
    override fun findAll(): List<Category> = categoryRepository.findAll()


}