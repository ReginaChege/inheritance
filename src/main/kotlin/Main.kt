fun main(){
var car = Car("Mercedess","G-Wagon","black",5)
   car.identity("white","Nissan","Teana")
    car.carry(3)
    println(car.calculateparkingFee(8))

    var bus =Bus("Grey","Hound","biege",49)
    println(bus.calculateParkingFees(3,49))
    println(bus.maxTripFare(120.00))


}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people: Int){
      if (capacity>=people){
          println("Carring $people pessagers")
      }
        else{
            println("over capacity by $people people")
      }
    }
    //- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
   fun  identity(color:String,make:String,model:String){
      println("I am a $color $make $model")
   }
    //- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)
    fun calculateparkingFee(hours:Int) :Int{
     var fees=hours*20
        return fees

    }

}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
class Bus(make:String,model:String,color:String,capacity:Int) :Car(make,model,color,capacity){
    fun maxTripFare(fare: Double) :Double{
     var maxtripfare=fare*capacity
        return maxtripfare

    }
   fun calculateParkingFees(hours: Int,capacity: Int) :Int{
       var parkingfees= hours *capacity
       return parkingfees
   }
}
