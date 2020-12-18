fun main() {
    println("Enter the three sides of the triangle: ")
    var a = Integer.parseInt(readLine())
    var b = Integer.parseInt(readLine())
    var c = Integer.parseInt(readLine())
    if(a == b){
      if(b == c){
        println("Equilateral triangle")
      }
      else{
        println("Isoceles triangle")
      }
    }
    else{
      if(b == c || a == c){
        println("Isoceles triangle")
      }
      else{
        println("Scalene triangle")
      }
    }
}