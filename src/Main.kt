fun rectangle(){
    println("Please enter the height")
    var x = readln().toInt()
    println("Please enter the width")
    var y = readln().toInt()
    var a = x * y
    println("The area is $a")

}

fun tri(){
    println("Please enter the height")
    var x = readln().toInt()
    println("Please enter the base")
    var y = readln().toInt()
    var a = .5 * x * y
    println("The area is $a")

}

fun circle(){
    println("Please enter the radius")
    var x = readln().toDouble()
    var a = x * x * 3.14
    println("The area is $a")

}

fun ellipse(){
    println("Please enter the shortest radius")
    var x = readln().toInt()
    println("Please enter the longest radius")
    var y = readln().toInt()
    var a = 3.14 * x * y
    println("The area is $a")
}

fun main() {
    println("Welcome to the area calculator by Enok Dragon")
    println("Please enter the number next to the operation you'd like to perform")
    println("1. Find the area of a rectangle")
    println("2. Find the area of a triangle")
    println("3. Find the area of a circle")
    println("4. Find the area of a ellipse")
    var choice = readln().toInt()
    when (choice){
        1 -> rectangle()
        2 -> tri()
        3 -> circle()
        4 -> ellipse()
        !in 1..4 -> println("Out of range")
        else -> println("Unknown input")

    }

}