fun greet(name: String, message: String = "Hi ${name.length}") = "$message $name"

println(greet("Rinjyu", "Developer"))
println(greet("Rinjyu"))