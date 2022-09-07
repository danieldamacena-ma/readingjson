package service

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

class ObjectMapper() {
    fun mapper(jsonString: String): List<Person> {
        val objectMapper = jacksonObjectMapper()
        objectMapper.registerKotlinModule()
        return objectMapper.readValue(jsonString)
    }
}