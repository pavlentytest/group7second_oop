fun main(args: Array<String>) {
    val ivan = Student("Ivan",12)
    ivan.name = "Ivan2"
    println(ivan.name)
    ivan.toDo()

    Program.NAME
    Program.toMake()

    val cat = Animal()
    val cat2 = Cat()
    cat2.makeSound()
    val cat3 = object : Animal() {
        override fun makeSound() {
            TODO("Not yet implemented")
        }
    }
    cat3.makeSound()


}