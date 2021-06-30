import kotlin.math.*

/*
* Once anything is declared as private, then it will
* be accessible within its immediate scope.
* 1. A private package can be accessible within
* that specific file.
* 2. A private class or interface can be
* accessible only by its data members, etc.
* */
class Rectangle {
    private var length: Int = 0
    private var width: Int = 0
    fun setLength(length: Int){
        this.length = length
    }

    fun setWidth(width: Int){
        this.width = width
    }

    fun area(): Int{
        return this.length * this.width
    }
}

/*
* reference:
* https://www.tutorialspoint.com/kotlin/kotlin_inheritance.htm
* Everything in Kotlin is by default "final",
* hence,
* 1. We need to use the keyword "open"
* in front of the class declaration to make
* it allowable to inherit.
* 2. If we want to override the method in the child class,
* then we need to use keyword "open" in front of the methods
* in the parent class
* */

open class Oval(val a: Double, val b: Double){
    open fun area(): Double{
        return a*b*PI;
    }
}

/*
* reference:
* https://www.tutorialspoint.com/kotlin/kotlin_constructors.htm
* Kotlin has two types of constructor
* one is primary constructor
* the other is the secondary constructor
*
* One Kotlin class can have one primary
* constructor, and one or more secondary
* constructor.
* */
class Circle (val radius: Double): Oval(radius, radius){
    // "val" means read-only
    override fun area(): Double{
        return this.radius*this.radius*PI
    }
}

/*
* Reference:
* https://www.tutorialspoint.com/kotlin/kotlin_extension.htm
* Function extension
* Kotlin allows to define a method outside the main class.
* */
fun Circle.perimeter(): Double{
    return 2*this.radius*3.14
}

class Triangle{
    /*
    * companion object is like static function in Java
    * we can just call the method which is in companion object
    * using the reference of the class name
    * e.g. Triangle.heron(3.0, 4.0, 5.0)
    * */
    companion object{
        fun heron(a: Double, b: Double, c: Double): Double{
            val s: Double = (a+b+c)/2
            return (s-a)*(s-b)*(s-c)
        }
    }
}

interface Geometry3D{
    var vertex: Int
    var edge: Int
    var faces: Int
    fun surface(): Double
    fun volume(): Double
}

class Cubic(val side: Double): Geometry3D{
    override var vertex: Int= 6
    override var edge: Int = 12
    override var faces: Int = 6

    override fun surface(): Double{
        return this.side*this.side*6
    }

    override fun volume(): Double{
        return this.side*this.side*this.side
    }
}

// function extension
// 有點類似 javascript 的 prototype chain
fun Cubic.orthogonalProjection():Double {
    return (this.edge*this.edge).toDouble()
}

/*
* visibility
* private, public, protected (same usage in Java)
* internal:
* If anything is marked as internal, then that specific field will be in
* the internal field. An "internal package" is visible only inside the module
* under which it is implemented.
* modelA:
* class Apple(){
*   fun appleLog(){
*       Log.i("debug=", "appleLog")
*   }
*   internal fun appleInternalLog(){
*       Log.i("debug=", "appleInternalLog")
*   }
* }
*
* modelB:
* Apple().appleLog()            // success
* Apple().appleInternalLog()    // error
* */