fun abs(a: Int): Int{
  if(a<0){
    return -a
  }
  else{
    return a
  }
}

fun main() {
    print("Enter a number: ")
    var a = Integer.parseInt(readLine())
    var ab = abs(a)
    println("Absolute value of $a is $ab")
}