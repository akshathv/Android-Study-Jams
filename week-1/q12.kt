fun pow(a: Int, e: Int): Int{
  var f: Int = 1
  for(i in 1..e){
    f *= a
  }

  return f
}
fun main() {
    print("Enter a number: ")
    var a: Int = Integer.parseInt(readLine())
    var b: Int = a
    var n: Int = 0
    var d: Int = 0
    while(a>0){
      d++
      a /= 10
    }
    a = b
    while(a>0){
      n += pow(a%10, d)
      a /= 10
    }
    if(n == b){
      println("$b is an armstrong number")
    }
    else{
      println("$b is not an armstrong number")
    }
}    