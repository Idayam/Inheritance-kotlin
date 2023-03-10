fun main() {
    var vehicles=car("Mercedes-Benz","C-class","black",4)
    vehicles.carry(3)
    vehicles.carry(6)
    vehicles.identity()
    println(vehicles.calculateParkingFees(4))

    var vehicle2=Bus("Toyota","coach","blue",24)
    println(vehicle2.maxTripFare(60.0))
    println(vehicle2.calculateParkingFees(2))



}
open class car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){

        var x =people-capacity
        if (people<=capacity){
            println("Carrying $people passengers")

        }else{
            println("over capacity $x people")}

    }
    fun identity(){
        println("I am $color $make $model")
    }
    open fun calculateParkingFees(hour:Int):Int{
        var total=hour*20
        return total

    }

    }

class Bus( make:String, model: String,color: String,capacity: Int):car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var total=fare*capacity
        return total

    }
    override fun calculateParkingFees(hour:Int):Int {
        var total = hour * capacity
        return total
    }

}