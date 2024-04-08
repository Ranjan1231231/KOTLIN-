fun main(args: Array<String>) {
    val person1=Person("joe",25)
}

class Person(fname:String, personage:Int){
    val firstname:String
   	var age:Int
//  Initializer block
    init{
        firstname=fname.capitalize()
        age=personage
        println("fist name= $firstname")
        println("age= $age")
    }
}
