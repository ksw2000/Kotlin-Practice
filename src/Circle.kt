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
        return a*b*3.14;
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
        return this.radius*this.radius*3.14
    }
}