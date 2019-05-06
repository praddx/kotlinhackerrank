fun main(args: Array<String>): Unit {
    var number = 2
    var array = intArrayOf(1, 2, 3, 4, 5)
    var result = rotateArray(number, array)

    result.forEach { i -> print("$i ") }
}

fun rotateArray(rotationNumber: Int, inputArray: IntArray): IntArray {

    var counter = 0
    var result = IntArray(inputArray.size)

    for (i in rotationNumber until inputArray.size step 1) {
        result.set(counter, inputArray[i])
        counter++
    }

    for (i in 0 until rotationNumber step 1) {
        result.set(counter, inputArray[i])
        counter++
    }
    return result;
}
