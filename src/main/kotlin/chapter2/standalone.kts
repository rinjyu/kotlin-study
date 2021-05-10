fun nofluff() {
    println("nofluff called...")
    throw RuntimeException("exception!!")
}

println("not in a function, calling nofluff()")

try {
    nofluff()
} catch (e: Exception) {
    var stackTrace = e.getStackTrace()
    println(stackTrace[0])
    println(stackTrace[1])
}