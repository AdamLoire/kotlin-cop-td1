import kotlin.random.Random

fun main() {
    print("Hello, World!\n")

    val rndList: MutableList<Int> = mutableListOf()

    val n = 10

    for (i in 0 until n) {
        rndList.add(Random.nextInt(20, 41))
    }
    println(rndList)

    val avg: Float = rndList.sumOf { it }.toFloat() / rndList.size
    println("Average: $avg")

    val listeEcartMoy: MutableList<Float> = mutableListOf()

    for (i in 0 until n) {
        listeEcartMoy.add(rndList[i] - avg)
    }

    var resultat: Float = 0f

    for (i in 0 until n) {
        resultat += (listeEcartMoy[i] * listeEcartMoy[i])
    }

    val variance = resultat / n
    println("Variance: $variance")

    val EcartType = Math.sqrt(variance.toDouble())
    println("Ecart Type: $EcartType")

}