val names = listOf("Rinjyu", "injoo", "Joo")

run {
    val checkLength = { name: String -> name.length == 5 }
    println(names.find(checkLength))
}

run {
    val checkLength: (String) -> Boolean = { name -> name.length == 5 }
    println(names.find(checkLength))
}

run {
    val checkLength: (String) -> Boolean = { name: String -> name.length == 5 }
    println(names.find(checkLength))
}

run {
    val checkLength = fun(name: String): Boolean { return name.length == 5 }
    println(names.find(checkLength))
}

run {
    println(
        names.find(fun(name: String): Boolean { return name.length == 5 })
    )
}
