class Mailer {
    val details = StringBuilder()
    fun from(addr: String) = details.append("from $addr...\n")
    fun to(addr: String) = details.append("to $addr...\n")
    fun subject(line: String) = details.append("subject $line...\n")
    fun body(message: String) = details.append("body $message...\n")
    fun send() = "...sending...\n$details"
}

fun createMailer() = Mailer()

fun prepareAndSend(mailer: Mailer) = mailer.run {
    from("rinjyu@test.com")
    to("joo@test.com")
    subject("Hello")
    body("details")
    send()
}

val mailer = createMailer()
val result = prepareAndSend(mailer)
println(result)