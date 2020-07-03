fun main(){
    val pangkat = pangkat(3, 2)

    println(pangkat)
}

fun pangkat(nilai:Int, pangkat:Int) : Int{
    if (pangkat == 1) return nilai else return nilai * pangkat(nilai,pangkat - 1)
}