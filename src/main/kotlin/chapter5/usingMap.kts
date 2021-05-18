val sites = mapOf("rinjyu" to "http://blog.naver.com/rinjyu", "Backend developer" to "http://github.com/rinjyu")
println(sites.size)
println(sites.containsKey("Backend developer"))
println(sites.containsValue("http://blog.naver.com/rinjyu"))
println(sites.containsValue("Backend developer"))
println("Backend developer" in sites)

val blog: String? = sites.get("Rinjyu")
val myBlog: String? = sites["Rinjyu"]
val backendDeveloper = sites.getOrDefault("Backend developer", "http://blog.naver.com/rinjyu")
val sitesWithGitHub = sites + ("GitHub" to "http://github.com")
val withoutBackendDeveloper = sites - "Backend developer"

for (entry in sites) {
    println("${entry.key} --- ${entry.value}")
}

for ((key, value) in sites) {
    println("$key --- $value")
}