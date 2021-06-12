class Car(var yearOfMake: Int, var color: String)

val car = Car(2021, "Red")
car.color = "Green"

println(car.color)