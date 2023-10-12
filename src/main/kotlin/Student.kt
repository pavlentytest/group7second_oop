class Student(_name: String, _age: Int) {
    var name: String
        private set
        get() {
            return field
        }
    var age: Int

    init {
        this.name = _name
        this.age = _age
    }

    // вторичный конструктор
    constructor(name: String, age: Int, id: Int) : this(name, age){

    }
}
// Функция расширения
fun Student.toDo() {
    println("sdsdfsf")
}
fun String.maxOfTwo() {

}
//class Substudent : Student("",0) {
   //
//}
