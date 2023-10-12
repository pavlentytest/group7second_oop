class Program {
    val x = 100

    companion object {
        const val NAME = "Program"
        fun toMake() {

        }
    }
}
abstract class Animal {
    abstract fun makeSound()
    fun method1() {

    }
    // SOLID - принципе ОО Проектирования
}
interface Movable {
    fun doMove()
    fun method2() {

    }
}
interface Flyable {

}

class Cat : Animal(), Movable, Flyable {
    override fun makeSound() {
      // логика
    }
    override fun doMove() {
        TODO("Not yet implemented")
    }
}
