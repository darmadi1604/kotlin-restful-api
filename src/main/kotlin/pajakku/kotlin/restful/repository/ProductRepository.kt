package pajakku.kotlin.restful.repository

import org.springframework.data.jpa.repository.JpaRepository
import pajakku.kotlin.restful.entity.Product

interface ProductRepository : JpaRepository<Product, String>{

}