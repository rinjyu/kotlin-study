val numberRanges: IntRange = 1..10
val charRanges: CharRange = 'a'..'z'
val seekHelp: ClosedRange<String> = "Hela".."Help"

println(seekHelp.contains("Helm"))
println(seekHelp.contains("Helz"))

for (i in numberRanges) {
    print("$i, ")
}

for (ch in charRanges) {
    print("$ch, ")
}