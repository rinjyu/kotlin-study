val names = listOf("Rinjyu", "Rachel", "Joo")
println(names.find { name -> name.length == 6 })
println(names.find { name -> name.length == 3 })

fun predicateOfLength1(length: Int): (String) -> Boolean {
    return { input: String -> input.length == length }
}

fun predicateOfLength2(length: Int) = { input: String -> input.length == length }
println(names.find(predicateOfLength2(6)))
println(names.find(predicateOfLength2(3)))