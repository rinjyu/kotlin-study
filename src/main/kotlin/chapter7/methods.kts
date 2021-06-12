class Person(val first: String, val last: String) {
    var fulltime = true
    var location: String = "-"

    constructor(first: String, last: String, fte: Boolean): this(first, last) {
        fulltime = true
    }

    constructor(first: String, last: String, loc: String): this(first, last, false) {
        location = loc
    }

    override fun toString() = "$first $last $fulltime $location"

    internal fun fullName() = "$last, $first"
    private fun yearsOfService(): Int = throw RuntimeException("Not implemented yet")
}

val jane = Person("Jane", "Done")
println(jane.fullName())