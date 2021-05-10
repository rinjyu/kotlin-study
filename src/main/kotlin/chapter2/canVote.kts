fun canVote1(name: String, age: Int): String {
    var status: String
    if (age > 17) {
        status = "yes, please vote!"
    } else {
        status = "nope, please come back!"
    }

    return "$name, $status"
}

fun canVote2(name: String, age: Int): String {
    var status = if (age > 17) "yes, please vote!" else "nope, please come back!"
    return "$name, $status"
}

println(canVote1("Rinjyu", 20))
println(canVote2("Rinjyu", 15))