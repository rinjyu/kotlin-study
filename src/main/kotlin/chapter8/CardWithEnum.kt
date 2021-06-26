enum class Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

sealed class CardWithEnum(val suit: Suit)

class AceWithEnum(suit: Suit): CardWithEnum(suit)

class KingWithEnum(suit: Suit): CardWithEnum(suit) {
    override fun toString() = "King of $suit"
}

class QueenWithEnum(suit: Suit) : CardWithEnum(suit) {
    override fun toString() = "Queen of $suit"
}

class JackWithEnum(suit: Suit) : CardWithEnum(suit) {
    override fun toString() = "Jack of $suit"
}

class PipWithEnum(suit: Suit, val number: Int): CardWithEnum(suit) {
    init {
        if (number < 2 || number > 10) {
            throw RuntimeException("Pip has to be between 2 and 10")
        }
    }
}