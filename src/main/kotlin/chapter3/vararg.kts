fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }

    return large
}

println(max(1, 5, 2))
println(max(1, 5, 2, 12, 7 , 3))

var values = intArrayOf(1, 20, 5)
println(max(values[0], values[1], values[2]))
println(max(*values))
println(max(*listOf(1, 4, 18, 12).toIntArray()))