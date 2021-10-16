package pl.aberidus.tobuylist

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}