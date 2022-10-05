fun main() {
    //variables
    var person1 = Commercial( "John Wick","342-232-6467",
                              "9189 something road","150000",
                              "Wick estates",true)

    var person2 = Commercial( "DoraTheExplorer","134-424-8193",
                              "9109 treasure Av","1200",
                              "SwiperNoSwiping",false)

    var person3 = Residential("a","111-111-1111",
                              "i","30000",
                              true)

    var person4 = Residential("Sunny","313-544-4252",
                              "1213 Faraway Town","13000",
                              false)

    //user input
    println("Please select:" +
            "\n1) Commercial" +
            "\n2) Residendial")
    var input = readln()!!.toInt()

    /*if user input is 1, print all commercial customers
    if user input is 2, print residential customers
    if the input is neither, asked to pick an option
     */
    if(input == 1){
        person1.calculate()
        person2.calculate()
    }
    else if (input == 2){
        person3.calculate()
        person4.calculate()
    }
    else if(input != 1 && input != 2){
        println("Please select an option :)")
    }

}