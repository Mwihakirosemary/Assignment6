fun main(){
    var car = Car("Prado","4x4","Grey",5)
    car.carry(7)
    car.capacity
    car.identity("Black","Toyota","Pickup")
    car.calculateParkingFees(7)
    var unified = Bus("modern","coast","yellow",30)
    unified.maxTripfare(50.50)
    unified.calculateParkingFees(15)

}
open class Car(var make: String,var model: String,var colour: String,var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }


    }

    fun identity(colour: String, make: String, model: String) {
        println("I am a $colour $make $model")
    }

    open fun calculateParkingFees(hours: Int):Int{
        var x = hours * 20
        println(x)
        return x
    }
}
class Bus(make: String,model: String,colour: String,capacity: Int): Car(make,model,colour,capacity){
    fun maxTripfare(fare: Double): Double{
        var  maxFare = fare * capacity
        println(maxFare)
        return maxFare
    }

    override fun calculateParkingFees(hours: Int): Int{
        //  super.calculateParkingFees(hours)
        var cap = hours * capacity
        println(cap)
        return cap
    }
}