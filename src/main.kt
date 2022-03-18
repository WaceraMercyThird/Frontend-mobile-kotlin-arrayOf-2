fun main(){
var result= arrayInteger(arrayOf(45,46,47))
    println(result)

    var add = arrayMixedTypes(arrayOf("Mary", 34,3.5,56,5.67F,true))
    println(add)

    var sum = arrayChar(arrayOf('i', 'r', 't', 'f', 'u'))
    println(sum)

}
//A function that takes in an array of integers and returns the product of
//all the elements
fun arrayInteger(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach {num->
        product *= num
    }
    return product
}

//A function that takes in an array of mixed types and returns the sum of
//all the decimal elements
fun arrayMixedTypes(elems:Array<Any>):Double{
    var sumTotal = 0.00

 elems.forEach { elem->
      if (elem is Double || elem is Float){
          sumTotal += elem.toString().toDouble()
      }
  }
    return sumTotal
}



//A function that takes in an array of characters and returns the number of
//vowels in the array
fun arrayChar(vowels:Array<Char>):Int{
var vowel = 0
    vowels.forEach { a->
      if (a == 'i' || a == 'u' ){
          vowel++

      }
    }
    return vowel
}
