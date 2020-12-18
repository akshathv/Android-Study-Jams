fun main() {
    print("Enter a number: ")
    var a = Integer.parseInt(readLine())
    if(a%55 == 0){
      println("$a is divisible by 5 and 11")
    }
    else{
      println("$a is not divisible by 5 and 11")
    }
}