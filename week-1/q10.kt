fun main() {
    print("Enter a number: ")
    var a: Int = Integer.parseInt(readLine())
    println("")
    for(i in 1..a){
      for(j in 1..i){
        print("#")
      }
      println("")
    }
}  