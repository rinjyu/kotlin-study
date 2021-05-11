fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
    println("$name $age $height $weight")
}

createPerson("Rinjyu", 20, 170, 40)
createPerson("Rinjyu", age = 20, weight = 40, height = 170)
createPerson("Rinjyu", 20, weight = 40, height = 170)
createPerson(weight = 40, height = 170, name = "Rinjyu")
createPerson("Rinjyu", weight = 40, height = 170)