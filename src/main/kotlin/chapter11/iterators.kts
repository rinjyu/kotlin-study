data class Person(val firstName: String, val age: Int)
val people = listOf(
    Person("Sara", 12),
    Person("Jill", 51),
    Person("Paula", 23),
    Person("Paul", 25),
    Person("Mani", 12),
    Person("Jack", 70),
    Person("Sue", 10)
)

val result1 = people.filter { person -> person.age > 20 }
    .map { person -> person.firstName }
    .map { name -> name.toUpperCase() }
    .reduce { names, name -> "$names, $name" }

println(result1)

val result2 = people.filter { person -> person.age > 20 }
    .map { person -> person.firstName }
    .map { name -> name.toUpperCase() }
    .joinToString(", ")

println(result2)

val totalAge1 = people.map { person -> person.age }
    .reduce { total, age -> total + age }

println(totalAge1)

val totalAge2 = people.map { person -> person.age }
    .sum()

println(totalAge2)

val nameOfFirstAdult = people.filter { person -> person.age > 17 }
    .map { person -> person.firstName }
    .first()

println(nameOfFirstAdult)

val families = listOf(
    listOf(Person("Jack", 40), Person("Jill", 40)),
    listOf(Person("Eve", 18), Person("Adam", 18)))

println(families.size)
println(families.flatten().size)

val namesAndReversed1 = people.map { person -> person.firstName }
    .map(String::toLowerCase)
    .map { name -> listOf(name, name.reversed())}

println(namesAndReversed1.size)

val namesAndReversed2 = people.map { person -> person.firstName }
    .map(String::toLowerCase)
    .map { name -> listOf(name, name.reversed())}
    .flatten()

println(namesAndReversed2.size)

val namesAndReversed3 = people.map { person -> person.firstName }
    .map(String::toLowerCase)
    .flatMap { name -> listOf(name, name.reversed())}

println(namesAndReversed3.size)

val namesSortedByAge = people.filter { person -> person.age > 17 }
    .sortedBy { person -> person.age }
    .map { person -> person.firstName }

println(namesSortedByAge)

val namesSortedByAgeDesc = people.filter { person -> person.age > 17 }
    .sortedByDescending { person -> person.age }
    .map { person -> person.firstName }

println(namesSortedByAgeDesc)

val groupBy1stLetter = people.groupBy { person -> person.firstName.first() }

println(groupBy1stLetter)

val namesBy1stLetter =
    people.groupBy({ person -> person.firstName.first() }) {
            person -> person.firstName
    }

println(namesBy1stLetter)

