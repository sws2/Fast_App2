package Kotlin

// 25. 상속
//부모로 부터 설명서를 물려 받는다.
//두번까지는 봐준다
//두번 이상이 넘어가면 리펙토링 해라


fun main(array:Array<String>){
    val superCar100 : SuperCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()
    println(superCar100.drive())
//    val bus100: Bus100 = Bus100()
//    bus100.drive()
}
//부모 : Car 100
//자식 : SuperCar100 , Bus100
/*private 생략*/ open class Car100(){
    /*(private 생략)*/open fun  drive():String{
        return "달린다"
 //       println("달린다")
    }
    fun stop(){

    }
}
class SuperCar100() : Car100(){
    override fun drive():String{
//        println("빨리 달린다.")
        val run = super.drive()
        return "빨리 $run"
    }
}
class Bus100() : Car100(){

}