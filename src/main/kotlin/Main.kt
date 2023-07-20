
fun main() {

    //Source
    val list = listOf(9,3,10,52,5,6,14,24,7,11)
    val word = "oso"
    var nameList: List<String> = listOf("Alicia","Jose","Darwin","Luis","Kyaro")
    val person = Person("Julio", 22, "male")
    val listStudent = mutableListOf<Student>()

    //Task 1: Calculate average
    println("El promedio de la lista es: ${calculateAverage(list)}")
    println()

    //Task 2: Filter by odd numers
    val newList: List<Int> = list.filter { it % 2 == 1 }
    println("Los números impares son: $newList")
    println()

    //Task 3: isPalindrome function
    println((if (isPalindrome(word)) "La palabra sí es un palíndromo." else "La palabra no es un palíndromo."))
    println()

    //Task 4: Add "¡Hola ,(name)!"
    nameList = nameList.map { name -> "¡Hola $name!" }
    nameList.forEach{name -> println(name)}
    println()

    //Task 5: performOperation lambda
    println("El resultado de la suma es: ${performOperation(1,6) { a, b -> a + b }}")
    println("El resultado de la resta es: ${performOperation(1,6) { a, b -> a - b }}")
    println()

    //Task 6: Data class
    val student = mappingPersontoStudent(person, listStudent.size)
    listStudent.add(student)
    listStudent.forEach{
        studentA -> println(studentA.toString())
    }


}

fun calculateAverage(numbers: List<Int>): Double{
    val sum = numbers.reduce{acc, num -> acc + num}
    return sum.toDouble()/numbers.size
}

fun performOperation(num1: Int, num2: Int,operation: (Int, Int) -> Int): Int{
    return operation(num1, num2)
}

fun isPalindrome(word: String): Boolean = word.reversed() == word

data class Person(val name: String, val age: Int, val gender: String)

data class Student(val name: String, val age: Int, val gender: String, val studentId: Int){
    override fun toString(): String{
        return if("male" == gender){
            "El estudiante $name tiene $age"
        }else if("female" == gender){
            "La estudiante $name tiene $age"
        }else{
            "El estudiante $name tiene $age"
        }
    }
}

fun mappingPersontoStudent(person: Person, length: Int):Student{
    return Student(person.name, person.age, person.gender, length+1 )
}





