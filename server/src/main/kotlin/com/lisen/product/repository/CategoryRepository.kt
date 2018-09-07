package com.lisen.product.repository

import com.lisen.product.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:40
 *
 **/
@Repository
interface CategoryRepository : JpaRepository<Category, Int> {



}