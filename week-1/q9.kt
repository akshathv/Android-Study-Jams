fun main() {
    print("Enter a number: ")
    var a: Int = Integer.parseInt(readLine())
    var sum: Int = 0
    for(i in 2..a step 2){
      sum += i
    }
    println("Sum of even numbers smaller than $a = $sum")
}