package pajakku.kotlin.restful.auth

import org.springframework.stereotype.Component
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Component
class ApiKeyConfiguration(val apiKeyInterceptor: ApiKeyInterceptor) : WebMvcConfigurer{

    override fun addInterceptors(registry: InterceptorRegistry) {
        super.addInterceptors(registry)

        // for automatic registration apikey
        registry.addWebRequestInterceptor(apiKeyInterceptor)
    }

}