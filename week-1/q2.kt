fun main() {
    println("Enter 3 numbers: ")
    var a = Integer.parseInt(readLine())
    var b = Integer.parseInt(readLine())
    var c = Integer.parseInt(readLine())
    if(a>b){
      if(a>c){
        println("The max is $a")
      }
      else{
        println("The max is $c")
      }
    }
    else{
      if(b>c){
        println("The max is $b")
      }
      else{
        println("The max is $c")
      }
    }
}