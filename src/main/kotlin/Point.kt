import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

class Point(private var x: Double, private var y: Double) {
    override fun toString(): String {
        return "($x , $y)";
    }

    fun equals(other: Point): Boolean {
        return this.x == other.x && this.y == other.y
    }

    fun symmetricToO(){
        this.x *= -1
        this.y *= -1
    }

    fun distanceBetweenPoints(other: Point): Double {
        var first = (other.x - this.x).pow(2)
        var second = (other.y - this.y).pow(2)
        return sqrt(first + second)
    }
}