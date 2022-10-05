/*
Class Commercial
Author: Erin B
Oct 5 2022

Parameters: Inherited from customer Class
            Property name (String)
            multiprop (Boolean)
 */

class Commercial(customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: String,
                 var propertyName: String,
                 var multiProp: Boolean)
    :Customer(customerName, customerPhone, customerAddress, squareFootage) {

    //sets the rate at 5$/1000sqrft
    var rate = ((squareFootage.toDouble() / 1000) * 5)

    init{

    }

    //calculates the rate, discounts, and prints all the info nicely
     fun calculate(){
        if (multiProp == true ){
            rate = (rate - (rate * .01))
        }
        else {
            rate = rate.toDouble()
        }
        println("Name: $customerName" +
                "\nPhone: $customerPhone" +
                "\nAddress: $customerAddress" +
                "\nProperty Name: $propertyName" +
                "\nSquare footage: $squareFootage" +
                "\nMultiple Properties: $multiProp" +
                "\nWeekly Charge: $$rate" +
                "\n-----------------------")
    }



}