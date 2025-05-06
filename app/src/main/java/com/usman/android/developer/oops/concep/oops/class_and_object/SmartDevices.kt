package com.usman.android.developer.oops.concep.oops.class_and_object

/**
this is the class which we are going to create in kotlin which is a blueprint of an object .
It consists of state and behaviour of an object.We use class keyword to create a class in kotlin.
We create class with name SmartDevices Which is in PasCal case which we should use in kotlin.
We can use any name for classes except the keywords Like class,open,object,fun,etc.
 **/
class SmartDevices {

    //Properties of the class
    /**
    While methods or function define the actions that a class can perform,
    the properties define the class's characteristics or data attributes. For example, a smart device has these properties:

    Name. Name of the device.
    Category. Type of smart device, such as entertainment, utility, or cooking.
    Device status. Whether the device is on, off, online, or offline.
    The device is considered online when it's connected to the internet. Otherwise, it's considered offline.
     */


    /*val and var are used to declare variables,
     but they behave differently in terms of whether the value of the variable can be changed (mutability).

    val: Once a value is assigned to a val variable, it cannot be changed (i.e., the variable is immutable).

    val myNumber = 5  // Read-only variable, value is 5

    * Trying to change the value will result in an error
     myNumber = 10  // Error: Val cannot be reassigned

    myNumber is a read-only variable because it's declared with val, meaning you can't change its value once assigned.
    If you try to reassign myNumber, you'll get a compilation error.

     var : A variable declared with var can be reassigned any number of times.

    var myAge = 25  // Mutable variable, value is 25
    myAge = 30      // Valid: you can change the value of myAge

    myAge is a mutable variable, so you can change its value as many times as you want.

    If you reassign myAge, it works without any errors.
      */

//here name ,category and deviceStatus are the properties of the class. can not be assigned bcz it is val variable.
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"


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
    similar to how you define a variable. We use the val keyword to create an immutable variable like constant and
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
     calling the properties here
     */
    println("this is property of the class")

    println("Device name is: ${smartDevices.name}")
    println("Device category is: ${smartDevices.category}")
    println("Device status is: ${smartDevices.deviceStatus}")
    /**
    calling the function here to execute the code.
     */

    println("this is Functions of the class")
    smartDevices.turnOnSmartDevice()
    smartDevices.turnOffSmartDevice()


}