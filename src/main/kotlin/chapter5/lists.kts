val fruits: List<String> = listOf("Apple", "Banana", "Grape", "Orange")
println(fruits)

println("first's ${fruits[0]}, that's ${fruits.get(0)}")
println(fruits.contains("Apple"))
println("Apple" in fruits)

val addMelon = fruits + "Melon"
println(fruits)
println(addMelon)

val noBanana = fruits - "Banana"
println(noBanana)

println(fruits::class)
println(fruits.javaClass)