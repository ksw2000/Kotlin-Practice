fun main(args: Array<String>) {
    /*
    * var is like general variable and it's known as a mutable variable
    * in kotlin and can be assigned multiple times.
    *
    * val is like Final variable and it's known as immutable in kotlin and can be initialized only single time
    * */

    // Numbers
    // Double   64
    // Float    32
    // Long     64
    // Int      32
    // Short    16
    // Byte     8

    // Char
    val letter: Char = 'A'
    println("$letter")

    // Boolean
    // var: a mutable variable
    var flag: Boolean = true
    println("$flag")
    flag = false

    // String
    val str: String = "さくらが命じる レリーズ"
    println(str)

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3)
    println("${numbers[0]}, ${numbers[1]}, ${numbers[2]}")

    // Collections
    val list: MutableList<Int> = mutableListOf(1,2,3)
    val readOnlyList: List<Int> = listOf(4,5,6)
    println("${list.first()}, ${list[1]}, ${list.last()}")
    println("${readOnlyList[0]}, ${readOnlyList[1]}, ${readOnlyList[2]}")

    val map = hashMapOf("foo" to 1, "bar" to 2)
    println(map["foo"])

    val set = hashSetOf("a", "b", "c")
    println(set)

    // Range
    // 0..2 means 0, 1, 2
    println("range demo:")
    for(i in 0..2){
        print("${numbers[i]}, ")
    }

    println()

    // when
    val x: Int = 5
    when(x){
        1 -> print("x == 1")
        2 -> print("x == 2")
        3, 4-> print("x == 3 || x == 4")
        else -> print("x != 1 && x != 2")
    }

    // foreach
    // use .withIndex() to get key and value
    println("\n\nnumbers:")
    for(value in numbers){
        print("$value, ")
    }

    println()
    for((key, value) in numbers.withIndex()){
        println("$key->$value")
    }

    // break, continue by using label
    println()
    val fooList: IntArray = intArrayOf(2, 4, 6, 8, 10, 12, 14)
    label1@ for(v in fooList){
        if(v > 10){
            break@label1
        }else{
            print("$v, ")
            continue@label1
        }
    }
    println()

    // class
    val r = Rectangle()
    r.setWidth(10)
    r.setLength(20)
    println("\narea:${r.area()}")

    // class with constructor
    val c = Circle(10.0)
    println("\narea:${c.area()}")

    //
}
