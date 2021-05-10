var factor = 2
fun doubleIt(number: Int) = number * factor
var message = "The factor is $factor"
factor = 0

println(doubleIt(2))    //0
println(message)    //The factor is 2