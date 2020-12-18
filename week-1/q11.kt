fun main() {
    print("Enter a number: ")
    var a: Int = Integer.parseInt(readLine())
    var b: Int = a
    var n: Int = 0
    for(i in 1..3){
      n += (a%10)*(a%10)*(a%10)
      a /= 10
    }
    if(n == b){
      println("$b is an armstrong number")
    }
    else{
      println("$b is not an armstrong number")
    }
}