val names = listOf("Rinjyu", "Rachel", "Anne")

fun nameIndices() {
    for (index in names.indices) {
        println("Position of ${names.get(index)} is $index")
    }
}

fun nameWithIndex() {
    for ((index, name) in names.withIndex()) {
        println("Position of $name is $index")
    }
}

nameIndices()
nameWithIndex()