package com.usman.android.developer.oops.concep.oops.class_and_object

class Car(val model:String,val color:String) {
    fun start(){
        println("$model is Starting")
    }
    fun stop(){
        println("$model is Stopping")
    }
    fun color(){
        println("$model is $color")
    }
}

fun main(){
    val myCar= Car("Toyota","Red")

    myCar.start()
    myCar.stop()
    myCar.color()

}