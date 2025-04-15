fun main() {
    val square = Square(24)
    val circle = Circle(2.0)
    val rectangle = Rectangle(5, 7)

    println("Square Area: ${square.area()}")
    println("Circle Area: ${circle.area()}")
    println("Rectangle Area: ${rectangle.area()}")
}


open class Shape {
    open fun area(): Double {
        return 0.0
    }
}


class Square(private val side: Int) : Shape() {
    override fun area(): Double {
        return (side * side).toDouble()
    }
}


class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}


class Rectangle(private val a: Int, private val b: Int) : Shape() {
    override fun area(): Double {
        return (a * b).toDouble()
    }
}

