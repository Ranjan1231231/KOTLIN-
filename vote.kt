fun main(args: Array<String>) {
    println("Hello, world!!!")
//    	object of the class

	var obj1=Person("ranjan",22)
    obj1.canVote(22)
}

class Person(var name:String , var age:Int){
    fun canVote(age:Int){
        if(age<18){
            println("Can not vote")
        }
        else{
            print("Can vote")
        }
    }
}
