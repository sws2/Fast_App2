package Kotlin

//01 변수 선언
//->상자
//변수 선언하는 방법
// 내 맘대로 원하는것을 넣을수 없는 상자->variable
//한번 넣으면 바꿀수 없는 상자->Value
//var/val 변수명 (상자) = 값(넣고 싶은 것)
//Variable==var/value==val
var num:Int = 10
var hello:String = "hello"
var point:Double = 3.4;
val fix:Int = 20
fun main(args:Array<String>){
    println(num)
    println(hello)
    println(point)
    println(fix)

    num =100
    hello="Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)
    //fix = 500//val = 상수 - 다시는 값 바꿀수 없음

}