package pajakku.kotlin.restful.service

import pajakku.kotlin.restful.model.CreateProductRequest
import pajakku.kotlin.restful.model.ListProductRequest
import pajakku.kotlin.restful.model.ProductResponse
import pajakku.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun getList(listProductRequest: ListProductRequest): List<ProductResponse>

}