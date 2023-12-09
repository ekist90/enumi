import java.lang.NullPointerException

//enum class Directions{
//    NORTH,
//    EAST,
//    SOUTH,
//    WEST;
//
//    fun  turnLeft(side:Directions):Directions {
//
//        return when(side) {
//            NORTH->WEST
//            EAST -> NORTH
//            SOUTH -> EAST
//            WEST -> SOUTH
//        }
//
//    }
//
//    fun turnRight(side: Directions):Directions{
//
//        return when(side) {
//            NORTH->EAST
//            EAST -> SOUTH
//            SOUTH -> WEST
//            WEST -> NORTH
//        }
//
//    }
//
//
//}

enum class Calculator{
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;



}



fun main(){

    print("Unesi prvi broj:")
    val prviBroj= readln().toDoubleOrNull()
    print("Unesi drugi broj:")
    val drugiBroj= readln().toDoubleOrNull()
    if (prviBroj == null || drugiBroj == null) {
       println("Nevažeći unos")
        return
    }

    println("Unesite broj za odabir operacije:")
    println("1. ADD")
    println("2. SUBTRACT")
    println("3. MULTIPLY")
    println("4. DIVIDE")
    print("Unos operacije (1-4): ")

    val unosOperacije = readln().toIntOrNull()
    val operacija=when(unosOperacije){
        1->Calculator.ADD
        2->Calculator.SUBTRACT
        3->Calculator.MULTIPLY
        4->Calculator.DIVIDE
        else -> return //ako ne izaberemo od 1-4 završava

    }

    val rezultat=when(operacija) {
        Calculator.ADD -> prviBroj?.plus(drugiBroj)
        Calculator.SUBTRACT -> prviBroj?.minus(drugiBroj)
        Calculator.MULTIPLY -> prviBroj * drugiBroj
        Calculator.DIVIDE -> if (drugiBroj != 0.0) {
            prviBroj / drugiBroj
        } else {
            println("Nemoguće deljenje sa nulom.")
            return
        }

        null -> println("Nevažeći unos")
    }

    println("Rezultat je: $rezultat")



//    var smjer:Directions=Directions.EAST
//    println("Trenutni smjer je: $smjer")
//    smjer=smjer.turnRight(smjer)
//    println("Nakon pomjeranja udesno :$smjer")
//    smjer=smjer.turnLeft(smjer)
//    println("Nakon pomjeranja ulijevo :$smjer")

    }