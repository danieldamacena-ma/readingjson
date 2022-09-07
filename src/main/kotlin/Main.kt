import service.ObjectMapper
import java.io.File

fun main() {
//instantiating the class which countains the method that configures jackson object mapper and maps the objects inside the json file
    val objectMapper = ObjectMapper()

    //setting a variable to receive the json file content
    val jsonString =
        File("C:/users/Daniel/ideaprojects/readingjson/src/main/resources/people.json").readText(Charsets.UTF_8)

    //setting a variable to receive the mapping result. It will be a list of Person objects
    val people = objectMapper.mapper(jsonString)

    //A loop to print each  object
    for (person in people) {
        println(person.toString())
    }

}
