fun useCar(): Pair<Int, String> {
    val car = Car(2021, "Red")
    val year = car.yearOfMake
    car.color = "Green"
    val color = car.color

    return year to color
}