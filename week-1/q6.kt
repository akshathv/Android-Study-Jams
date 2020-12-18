fun main() {
    print("Enter a character: ")
    var a: Char = readLine()!![0]
    
    if(a in 'a'..'z' || a in 'A'..'Z'){
      println("$a is an alphabet")
    }
    else{
      println("$a is not an alphabet")
    }
}