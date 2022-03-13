
fun main(){
var x=product(arrayOf(2,3,4,10))
println(x)
var w=alotCharacters(arrayOf("mercy",2,5.6,7.12,4.1,true))
   println(w)
   var z=vowels(arrayOf('a','e','i','o','u'))
   println(z)
}
//function that takes in an array of integers and returns the product of all the elements.
fun product(num:Array<Int>):Int{
   var multiply=1
   num.forEach { y->
      if (y is Int){
         multiply*=y.toInt()
      }
   }
   return multiply
}

//a function that takes in an array of mixed types and returns the sum of all the decimal elements
fun alotCharacters(type:Array<Any>):Double {
   var mixed=0.0
   type.forEach { el->
      if (el is Int||el is Float||el is Double){
         mixed+=el.toString().toDouble()
      }
   }
   return mixed
}

//a function that takes ain an array of characters and returns the number of vowels in the array.
fun vowels(vol:Array<Char>):Int{
   var number=vol.count()
   return number
}