fun main() {
   val media = readLine()!!.toDouble();
   
   when {
       media < 5 -> println("REP")
       media in 5.0..7.0 ->println("REC")
       else -> println("APR")
   }
}