fun factorial(n: Int): Int{
  if(n == 1){
    return 1
  }
  return n*factorial(n-1)
}
fun main() {
    print("Enter a number: ")
    var a: Int = Integer.parseInt(readLine())
    var sum: Int = 0
    for(i in 1..a){
      sum += factorial(i)
    }
    println("Sum of factorials till $a = $sum")
}