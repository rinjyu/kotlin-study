fun String.Companion.toURL(link: String) = java.net.URL(link)

val url: java.net.URL = String.toURL("https://blog.naver.com/rinjyu")

println(url)