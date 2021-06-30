// data classes in kotlin
// This type of class can be used to hold the basic data apart
// Other than this. it does not provide any other functionality

data class Date(val year: Int, val month: Int, val day:Int)
data class Person(val name: String, val birthDayYear: Date)