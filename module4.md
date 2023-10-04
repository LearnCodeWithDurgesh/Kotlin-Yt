## Object Oriented Programming

OOPs is programming methodology of programming.

## Classes and Object

### Class

Class is blueprint for creating objects.
Class can have properties and behaviours.

### Object

Object is instance of class has properties and behaviors.
We can create multiple objects for class.

```kotlin
class className {      // class header
   // property
   // member function
}
```

```kotlin

class Car(
    var name: String,
    var model: String,
    var color: String
) {


    fun getInformations() {
        println("name : $name , model $model , color $color")
    }
}



```

Creating objecdt

```kotlin

fun main()
{
val car = Car("Tata Nexon", "EV0121", "Dark")
car.getInformations()
}

```

### Constructors

Constructors are like member functions that are called when object of the class is created , they initilize the data members for objects

### Primary Construtors

The primary constructor is initialized in the class header

```kotlin
class Add constructor(val a: Int, val b: Int) {
     // code
}
```

### Primary Constructor with Initializer Block

```kotlin
class Demo constructor(var x: Int, var y: Int) {
    init {
        println("This is init block")
    }
}
```

#### Default values

```kotlin
class Demo constructor(var x: Int=70, var y: Int=90) {
    init {
        println("This is init block x: $x , y:$y")
    }
}

```

### Secondary Constructor

Kotlin may have one or more secondary constructors. Secondary constructors allow initialization of variables and allow to provide some logic to the class as well. They are prefixed with the constructor keyword.

```kotlin
// class with one secondary constructor
class Add
{
    constructor(a: Int, b:Int)
    {
        var c = a + b
        println("The sum of numbers 5 and 6 is: ${c}")
    }
}

```

Kotlin program of two secondary constructors in a class:

```kotlin
class employee {
      constructor (emp_id : Int, emp_name: String ) {
          var id: Int = emp_id
          var name: String = emp_name
          print("Employee id is: $id, ")
          println("Employee name: $name")
          println()
      }

       constructor (emp_id : Int, emp_name: String ,emp_salary : Double) {
           var id: Int = emp_id
           var name: String = emp_name
           var salary : Double = emp_salary
           print("Employee id is: $id, ")
           print("Employee name: $name, ")
           println("Employee name: $salary")
       }
}




```

### Setters and Getters

In Kotlin, setter is used to set the value of any variable and getter is used to get the value.

Getters and Setters are auto-generated in the code.

we can create own implementation of getter and setters

```kotlin
  var name: String = "default value"
        get() = field
        set(value) {
            field = value
        }

```

### Kotlin Visibility Modifiers

In Kotlin, visibility modifiers are used to control the visibility of a class, its members (properties, functions, and nested classes), and its constructors.

- public: The public modifier makes a member visible to any code. This is the default visibility for members in Kotlin.

- private: The private modifier restricts the visibility of a member to the containing class only. A private member cannot be accessed from outside the class.

- internal: The internal modifier restricts the visibility of a member to the same module. A module is a set of Kotlin files compiled together.

- protected: The protected modifier restricts the visibility of a member to the containing class and its subclasses.

# Inheritance

When one class takes(aquire) the properties and behaviours of another class then this is called Inheritance.

The class that provides the properties and behaviours is **Parent class/Base class/Super class**

The class that takes the properties and behaviours is **Child Class/Derived Class/Sub Class**

```kotlin
open class Parent {

}

class Child() : Parent() {

}
```

**_All properteis and methods are inherited we can use on child class obejcts_**

### Overriding Member functions and properties:

If the base class and derived class contain a member function with the same name, then we can override the base member function in the derived class using the override keyword and also need to mark the member function of the base class with open keyword.

```kotlin
// base class
open class Animal {
    open fun run() {
        println("Animals can run")
    }
}
// derived class
class Tiger: Animal() {
    override fun run() {       // overrides the run method of base class
        println("Tiger can run very fast")
    }
}s
```

Overriding properties

```kotlin
// base class
open class Animal {
    open var name: String = "Dog"
    open var speed = "40 km/hr"

}
// derived class
class Tiger: Animal() {
    override var name = "Tiger"
    override var speed = "100 km/hr"
}

```

---

### Kotlin Interfaces:

In Kotlin, an interface is a collection of abstract methods and properties that define a common contract for classes that implement the interface.

An interface is similar to an abstract class, but it can be implemented by multiple classes, and it cannot have state.

```kotlin

interface MyInter {

    val x: Int
    fun test()

}

class MyInterImpl : MyInter {
    override val x: Int=30

    override fun test() {
        println("this is overriding testing methods")
    }
}

```

---

## Data class

data classes are the class that holds data, In this class some functions are already defined

```kotlin
data class Student(val name: String, val phone: String)
```

The compiler automatically derives the following functions :

```kotlin

equals()
hashCode()
toString()
copy()

```

Rules

- The primary constructor needs to have at least one parameter.
- All primary constructor parameters need to be marked as val or var.
- Data classes cannot be abstract, open, sealed or inner.
- Data classes may only implement interfaces.

### Sealed Classes

Sealed class is a class which restricts the class hierarchy.

- All subclasses of a sealed class must be declared in the same file where sealed class is declared.
- A sealed class is abstract by itself, and you cannot instantiate objects from it.
- You cannot create non-private constructors of a sealed class; their constructors are private by default.

```kotlin
class Expr
class Const(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            is Const -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }

```
