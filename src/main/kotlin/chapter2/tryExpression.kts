fun tryExpression(blowup: Boolean): Int {
    return try {
        if (blowup) {
            throw RuntimeException("fail!!!!!")
        }
        2
    } catch (e: Exception) {
        4
    } finally {

    }
}

println(tryExpression(false))
println(tryExpression(true))