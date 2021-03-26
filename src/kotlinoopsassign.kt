fun main(){
 var sharon=human("jane",18,5.6F)
    sharon.eat(9.4F)
    sharon.weight
sharon.speak("Go to class!")
sharon.birthday(18)
    var getty=user("constance","kavaya","kavayaconstance@gmail.com",714451127,"Instagram")
    println(getty)
    println(getty.email)

}

class human(var name:String,var age:Int,var weight:Float){
    fun eat(foodWeight:Float){
println("I am eating 5.6kgs of food")
        fun add(weight:Float){
            var weight=foodWeight+weight
            println(5.6)
        }
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(humanage:Int){
        age=age+1
        println(age)

    }

}
data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:Long,var passWord:String){

}