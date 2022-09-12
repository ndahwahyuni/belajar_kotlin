
fun main() {
    println("masukkan nilai uts anda  ")
    val uts: Int= readLine()!!.toInt()

    println("masukkan nilai uas anda  ")
    val uas: Int=  readLine()!!.toInt()

    val na:Double=(0.4*uts) +(0.6*uas)
    print(na)
    if ( na >80) {
        println("naik semeter.")

    } else {
        println(" cuti bersama kita hahahahah.")
    }
}
