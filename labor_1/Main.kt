import java.util.*

fun first(a: Int, b:Int) {
    println("$a + $b = ${a+b}")
}

fun isPrime(x: Int):Boolean{
    for (i in 2..x / 2) {
        if (x % i == 0) {
            //println("$x is not a prime number.")
            return false
        }
    }
    //println("$x is a prime number.")
    return true
}

fun encode(text: CharArray): CharArray {
    for (i in 0..text.size - 1) {
        val a = text[i].code + 5
        text[i] = a.toChar()
    }
    //print(chars)
    return text
}

fun decode(text: CharArray): CharArray {
    for (i in 0..text.size - 1) {
        val a = text[i].code.toInt() - 5
        text[i] = a.toChar()
    }
    //print(text)
    return text
}

fun messageCode(msg:CharArray, func:(CharArray)->CharArray):CharArray{
    return func(msg)
}

fun evens(list: List<Int>):List<Int> =list.filter{ it % 2 == 0}

fun generateRandom(): Int {
    val randomInteger = (0..100).shuffled().first()
    return randomInteger
}
fun main(args: Array<String>) {

    // Feladat 1.

    val a = 2
    val b = 3
    println("$a + $b = ${a+b}")

    // Feladat 2.

    val daysOfWeek = listOf("Monday", "Tuesday" , "Wednesday", "Thursday", "Friday" , "Saturday", "Sunday")
    for (day: String in daysOfWeek){
        println(day)
    }

    println()

    val withoutT = daysOfWeek.filter { it.startsWith("T") }
    for (day: String in withoutT){
        println(day)
    }

    println()

    val withE = daysOfWeek.filter { it.contains("e")}
    for (day: String in withE){
        println(day)
    }

    println()

    val len6 = daysOfWeek.filter { it.length == 6}
    for (day: String in len6){
        println(day)
    }

    println()

    // Feladat 3.

    val n = 99
    for (i in 3..n){
        if(isPrime(i))
            print("$i ")
    }

    println()

    // Feladat 4.

    val text="Sajt"
    println(encode(text.toCharArray()))
    println(decode(encode(text.toCharArray())));

    val text2="Almafa"
    val text3 =messageCode(text2.toCharArray(),::encode)
    println(text3)

    val text4 =messageCode(text3,::decode)
    println(text4)

    // Feladat 5.

    val list = listOf(1,2,3,4,5,6,7,8,9)

    println(evens(list))

    // Feladat 6.

    val doubleList = list.map { it * 2 }
    println(doubleList)

    val capitalized = daysOfWeek.map{ it.uppercase()}
    println(capitalized)

    val firstLetter = daysOfWeek.map{it.first().lowercase()}
    println(firstLetter)

    val lengthOfDays = daysOfWeek.map{it.length}
    println(lengthOfDays)

    var sum = 0
    daysOfWeek.map{ sum = sum + it.length }
    println(sum/daysOfWeek.size)

    // Feladat 7.
    //var days = Collections.unmodifiableList(daysOfWeek)
    var days = daysOfWeek.toMutableList()

    for (i in 0..days.size-3) { // hibat adott ki days.size-2 es -1re
        if (days.get(i).contains("n")){
            days.removeAt(i)
        }
    }

    /*
    for (day: String in days) {
        if(day.contains("n")) {
            days.remove(day)
        }
    }*/

    println(days)

    for (i in 0..days.size-1) {
        println("Item at $i is ${days.get(i)}")
    }

    days.sort()

    println(days)

    // Feladat 8.

    val randArray=IntArray(10){generateRandom()}
    randArray.forEach{
        print("$it ")
    }

    println()
    randArray.sort()

    randArray.forEach{
        print("$it ")
    }

    println()

    var temp=0
    var counter=0
    randArray.forEach{
        if(it%2==0) {
            temp=1
            counter++
        }
    }

    if(temp==1){
        print("It contains even numbers!")
    }
    else{
        print("It doesn't contain even numbers!")
    }

    println()

    if(counter==randArray.size) {
        print("All numbers are even!")
    }
    else{
        print("Not all numbers are even!")
    }

    println()

    var avg=0
    randArray.forEach{
        avg+=it
    }

    avg/=randArray.size

    print("Average of the random numbers: $avg")

}