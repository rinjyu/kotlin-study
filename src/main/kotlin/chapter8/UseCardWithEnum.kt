fun main() {
    println(processWithEnum(AceWithEnum(Suit.DIAMONDS)))
    println(processWithEnum(KingWithEnum(Suit.CLUBS)))
    println(processWithEnum(PipWithEnum(Suit.SPADES, 2)))
    println(processWithEnum(PipWithEnum(Suit.HEARTS, 6)))
}