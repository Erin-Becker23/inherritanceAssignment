/*
Class Residential
Author: Erin B
Oct 5 2022

Parameters: Inherited same from customer class
           senior (boolean)
 */


class Residential(customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: String,
                  var senior: Boolean)
    :Customer(customerName, customerPhone, customerAddress, squareFootage) {

    //sets the rate at 6$/1000sqrft
    var rate = ((squareFootage.toDouble()/1000)*6)

 init{

 }
    //calculates the rate, discounts, and prints all the info nicely
    fun calculate(){
    if (senior == true){
        rate = (rate - (rate * .15))
    }
        else{
            rate = rate.toDouble()
    }
        println("Name: $customerName" +
                "\nPhone: $customerPhone" +
                "\nAddress: $customerAddress" +
                "\nSquare footage: $squareFootage" +
                "\nIs a senior: $senior" +
                "\nWeekly Charge: $$rate" +
                "\n-----------------------")
    }


}
