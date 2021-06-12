package chapter7

fun unitsSupported() = listOf("Metric", "Imperial")
fun precision(): Int = throw RuntimeException("Not implemented yet")

object Temperature {
    fun c2f(c: Double) = c * 9.0/5 + 32
    fun f2f(f:Double) = (f - 32) * 5.0/9
}

object Distance {
    fun milesToKim(miles: Double) = miles * 1.609344
    fun kimToMiles(km: Double) = km / 1.609344
}