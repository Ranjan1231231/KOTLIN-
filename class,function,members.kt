fun main(args: Array<String>) {
    println("Hello, world!!!")
    val l1=Lamp()
    val l2=Lamp()
    l1.turnon()
    l2.turnoff()
    l1.displaylightstatus("l1")
    l2.displaylightstatus("l2")
    
}


class Lamp{
    private var ison:Boolean=false
    fun turnon(){
        ison=true
        
    }
    fun turnoff(){
        ison=false
        
    }
    fun displaylightstatus(lamp:String){
        if(ison==true)
       		println("$lamp lamp is on")
        else
        	println("$lamp lamp is off" )
    }
}
