fun nickName(name: String?): String? {
    if (name != null) {
        return name.reversed()
    }

    return null
}

println("Nickname for Rinjyu is ${nickName("Rinjyu")}")
println("Nickname for Rachel is ${nickName("Rachel")}")
println("Nickname for null is ${nickName(null)}")