import kotlin.math.sqrt

fun main(args: Array<String>) {
    //first exercise
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    println(exercises)

    exercisesSolved += 1


    //second exercise
    val myAge: Int = 18
    println(myAge)

    exercisesSolved += 1


    //third exercise
    var middleAge: Double = 18.0
    middleAge = (18.0 + 30) / 2
    println(middleAge)

    exercisesSolved += 1


    //fourth exercise
    val testNumber: Int = 36
    val evenOdd: Double = testNumber % 2.0
    println(evenOdd)

    exercisesSolved += 1


    //fifth exercise
    var answer: Int = 0
    answer = ((answer + 1 + 10) * 10) shr 3
    println(answer)

    exercisesSolved += 1


    //sixth exercise
    var age: Int
    age = 16
    println(age)
    age = 30
    println(age)

    exercisesSolved += 1


    //seventh exercise
    val a: Int = 46
    val b: Int = 10

    //1
    val answer1: Int = (a * 100) + b
    //2
    val answer2: Int = (a * 100) + (b * 100)
    //3
    val answer3: Int = (a * 100) + (b / 10)

    println(answer1)
    println(answer2)
    println(answer3)

    exercisesSolved += 1


    //eighth exercise
    println( (5 * 5) - ((4 / 2) * 2) )

    exercisesSolved += 1


    //ninth exercise
    val a2: Double = 12.0
    val b2: Double = 24.0

    val average: Double = (a2 + b2) / 2.0
    println(average)

    exercisesSolved += 1


    // tenth exercise
    val fahrenheit: Double =  64.0
    val celsius: Double = (fahrenheit - 32) / 1.8
    println(celsius)

    exercisesSolved += 1


    //eleventh exercise
    val position: Int = 16
    var row: Int = 0
    var column: Int = 0
    var buffer: Int = 0

    for (i in 1..position){
        if ( i % 8 == 0 ) row += 1
        buffer = i
    }

    if (buffer % 10 == 9) column =  0
    else column = buffer % 10 - 1

    println(row)
    println(column)

    exercisesSolved += 1


    //twelfth exercise
    val degrees: Double = 110.0
    val Pi: Double = Math.PI
    val radians: Double = degrees * Pi / 180
    println(radians)

    exercisesSolved += 1


    //thirteenth exercise
    val x1: Double = 0.0
    val y1: Double = 4.0
    val x2: Double = 4.0
    val y2: Double = 0.0

    val distance: Double = sqrt(Math.pow( (x2 - x1), 2.0) +
            Math.pow( (y2 - y1), 2.0))
    println(distance)

    exercisesSolved += 1
}