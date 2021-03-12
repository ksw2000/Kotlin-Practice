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
