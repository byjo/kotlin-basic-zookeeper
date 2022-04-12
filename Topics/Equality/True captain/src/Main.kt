// you don not need to understand how it works, ignore it
class Pirate (name : String) {
    var name: String = name
        private set    
}

fun main() {
    val captain = Pirate("Hector Barbossa")
    println(captain.name) 
    // Do not touch the lines above
    // put your code here
    val jack = Pirate("Jack Sparrow")
    println(jack.name)
}