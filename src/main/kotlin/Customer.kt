/*
Class Customer
Author: Erin B
Oct 4 2022

Paramters: Customer name (String)
           Customer phone number (String)
           Customer address (String)
           Square footage (String)
 */


open class Customer (customerName: String,
                     customerPhone: String,
                     customerAddress: String,
                     squareFootage: String) {

    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerPhone: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerAddress: String = ""
        get() = field
        set(value) {
            field = value
        }
    var squareFootage: String = ""
        get() = field
        set(value) {
            field = value
        }

    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }

fun getInfo(){
    println("Name: $customerName" +
            "\nPhone: $customerPhone" +
            "\nAddress: $customerAddress" +
            "\nSquare footage: $squareFootage")
}

}