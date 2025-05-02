package com.usman.android.developer.oops.concep.oops.class_and_object

/**
 this is the class which we are going to create in kotlin which is a blueprint of an object .
 It consists of state and behaviour of an object.We use class keyword to create a class in kotlin.
 We create class with name SmartDevices Which is in PasCal case which we should use in kotlin.
 We can use any name for classes except the keywords Like class,open,object,fun,etc.
 **/
class SmartDevices {

    /**
     now we want to call the function which uses fun keyword followed by a set of parentheses and a set of curly braces.
     The curly braces contain code, which are the instructions needed to execute a task.
     The calling of a function causes the code contained in that function to execute.
     function name will be written in camelCase for better understanding.
     **/
    fun turnOnSmartDevice() {
        /**
        turnOnSmartDevice is the name of the function which we are going to create.
         in { here we write code to execute or run.}

         **/


        println("Smart device is turned on.")
    }
    fun turnOffSmartDevice() {
        println("Smart device is turned off.")
    }

}

/**
In Kotlin, the fun main() function is the entry point of the program. It is where the program starts execution.
fun: This keyword is used to define a function in Kotlin.
main(): The function name main is special because it is recognized as the entry point for the program when it is executed.
{}:It is body where we write our code to execute or run.
Click on the play button > on the left side with the main function to run code
*/
fun main() {
    /**
To use an object, we create the object and assign it to a variable,
similar to how you define a variable. We use the val keyword to create an immutable variable and
the var keyword for a mutable variable. The val or var keyword is followed by the name of the variable,
 then an = assignment operator, then the instantiation of the class object.
we us camelCase for object name and PasCalCase for class name.

      val nameOfObject = ClassName()

To call a class method outside of the class, start with the class object followed by the . operator,
the name of the function, and a set of parentheses. If applicable, the parentheses contain arguments required by the method.
     nameOfObject.functionName(here we pass arguments if any)

    */

// smartDevices  is the object of SmartDevices class
    val smartDevices = SmartDevices()
    /**
     calling the function here to execute the code.
     */
    smartDevices.turnOnSmartDevice()
    smartDevices.turnOffSmartDevice()




}