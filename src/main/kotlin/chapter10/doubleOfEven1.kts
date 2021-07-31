var doubleOfEven = mutableListOf<Int>()
for (i in 1..10) {
    if (i % 2 == 0) {
        doubleOfEven.add(i * 2)
    }
}