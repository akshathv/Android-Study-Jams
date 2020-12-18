fun factorial(n: Int): Int{
  if(n == 1){
    return 1
  }
  return n*factorial(n-1)
}
fun main() {
    print("Enter a number: ")
    var a: Int = Integer.parseInt(readLine())
    var f: Int = factorial(a)
    println("$a! = $f")
}