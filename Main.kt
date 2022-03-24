fun main() {
   val pt1 = Point(24, 6)
   val pt2 = Point(8, 2)
   println(pt1==pt2)

   pt1.invertSomePoints()

   var audi = VehicleFactory().createCar("Audi")
   println(audi?.drive())
  
   var boeing = VehicleFactory().createAircraft("Boeing737")
   println(boeing?.fly())
}



data class Point(var x: Int, var y: Int) {
    fun invertSomePoints() {
        this.x = -this.x
        this.y = -this.y
    }

    override fun toString(): String {
        return "x: " + this.x.toString() + "  y: " + this.y.toString()
    }

    fun equals(pt: Point): Boolean {
        return this.x == pt.x && this.y == pt.y
    }
}

