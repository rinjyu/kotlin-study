fun process(card: Card) = when (card) {
    is Ace -> "${card.javaClass.name} of ${card.suit}"
    is King, is Queen, is Jack -> "$card"
    is Pip -> "${card.number} of ${card.suit}"
}

fun processWithEnum(card: CardWithEnum) = when (card) {
    is AceWithEnum -> "${card.javaClass.name} of ${card.suit}"
    is KingWithEnum, is QueenWithEnum, is JackWithEnum -> "$card"
    is PipWithEnum -> "${card.number} of ${card.suit}"
}