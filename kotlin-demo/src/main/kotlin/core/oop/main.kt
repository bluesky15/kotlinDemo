package core.oop

abstract class Mammals {
    abstract fun eat()
    abstract fun poop()
}

class Rabbit : Mammals() {
    override fun eat() {
        println("Eating --Done Eating ")
    }

    override fun poop() {
        println("pooped -- ")
    }

}

class Eliphant : Mammals() {
    override fun eat() {
        println("Eating --Done Eating ")
    }

    override fun poop() {
        println("pooped -- ")
    }

}

fun main() {
    //Extension function
    fun Rabbit.hop() {
        print("Rabbit moving")
    }
    val rabbit = Rabbit()
    rabbit.eat()
    rabbit.poop()
    rabbit.hop()
}