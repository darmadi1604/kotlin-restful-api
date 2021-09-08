package pajakku.kotlin.restful.repository

import org.springframework.data.jpa.repository.JpaRepository
import pajakku.kotlin.restful.entity.ApiKey

interface ApiKeyRepository: JpaRepository<ApiKey, String> {
}