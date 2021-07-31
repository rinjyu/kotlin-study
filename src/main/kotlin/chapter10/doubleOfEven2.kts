var doubleOfEven = (1..10)
    .filter { e -> e % 2 == 0}
    .map { e -> e * 2 }
println(doubleOfEven)