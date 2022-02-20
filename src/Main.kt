fun main (){
  printName("Nyakuar")
  var result = GetReminder(3,2)
  println(result)
  var sum= sum(4,8,3,2)
  println(sum)
  printinterestingfactaboutme("swimming")

}







fun printName(name:String){
  println("Hello" + " " + name)
}
fun GetReminder(num1 : Int, num2: Int):Int{
  var modulus =num1 % num2
  return modulus

}
fun sum(a:Int,b:Int,c:Int,d:Int):Int{
  var sum =a+b+c+d
  return sum
}

fun printinterestingfactaboutme(fact:String){
  println("I love" + " " +fact)
}


















