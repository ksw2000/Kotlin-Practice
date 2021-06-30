interface Base{
    fun print()
}

// a class implement Base
class BaseImpl(val x: Int):Base{
    override fun print(){
        print(x)
    }
}

// a class use another implemented method
class Derived(b: Base): Base by b

/*
* val b = BaseImpl(10)
* Derived(b).print()
* */