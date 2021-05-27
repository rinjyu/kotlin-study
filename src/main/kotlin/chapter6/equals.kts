class Animal {
    override operator fun equals(other: Any?) = other is Animal
}

var greet: Any = "hello"
var odie: Any = Animal()
var toto: Any = Animal()

println(odie == greet)
println(odie == toto)