class Car(val yearOfMake: Int, theColor: String) {
    var fuelLevel = 100
    var color = theColor
    set(value) {
        if (value.isBlank()) {
            throw RuntimeException("no empty, please")
        }
        field = value
    }
}

var car = Car(2021, "Red")
car.color = "Green"
car.fuelLevel--
println(car.fuelLevel)
try {
    car.color = ""
} catch (e: Exception) {
    println(e.message)
}

println(car.color)