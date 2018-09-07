package com.lisen.product.controllers

import com.lisen.product.service.CategoryService
import com.lisen.product.service.ProductService
import com.lisen.product.vo.CategoryVO
import com.lisen.product.vo.ProductVO
import com.lisen.product.vo.ResponseVO
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *
 * @author   lisen
 * @create   2018-09-07 下午1:25
 *
 **/

@RestController
@RequestMapping("/com/lisen/product")
class ProductController {

    @Autowired
    lateinit var categoryService: CategoryService

    @Autowired
    lateinit var productService: ProductService


    @GetMapping("/list")
    fun list(): ResponseVO<List<CategoryVO>> {
        // 查询所有商品类型
        val categoryList = categoryService.findAll()

        val categoryVOList = arrayListOf<CategoryVO>()
        // 遍历商品类型，查询对应的商品集合
        if(categoryList.isNotEmpty()) {
            categoryList.forEach {

                val productList = productService.findAllByCategoryId(it.id)

                if (productList.isNotEmpty()) {

                    val productVOList = productList.map { product ->
                        val productVO = ProductVO()
                        BeanUtils.copyProperties(product, productVO)
                        productVO
                    }
                    categoryVOList.add(CategoryVO(id = it.id, name = it.name.trim(), products = productVOList))
                }
            }
            return ResponseVO(data = categoryVOList)
        }
        return ResponseVO(code = -1, msg = "")
    }

}