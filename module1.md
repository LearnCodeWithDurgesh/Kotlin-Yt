# Kotlin Crash Course

### Module 1: Introduction to Kotlin

- What is Kotlin?

  - Kotlin is developed by **_Jetbrains_**. Offically relased in 2016

  - Kotlin is a statically-typed, general-purpose programming language. It is widely used to develop android applications.
  - It runs on **JVM** so it can be run anywhere java can runs.
  - Used to developed
    - Android Apps
    - Server Side Apps
    - and much more

- Why Kotlin?

  - Kotlin removes boilerplate codes from java.
  - It provides many features more than jvms based languages.
  - **Concise**
  - **Null Safty**
  - **Interportability**
  - **Toolfriendly**
  - And much more.

- Use playground:
  https://play.kotlinlang.org

- Setting up the development
  environment (IDE, SDK, etc.)

  - To run programs without IDE just install java and install kotlin compiler.
    Kolin Compiler Link: (img)[https://github.com/JetBrains/kotlin/releases/tag/v1.2.21]

  - Set the path
  - now write kotlin program and save the program with **.kt** file extension

```kotlin


fun main(){
    println("First program")
}

```

- Now compile and run kotlin program with given command

```kotlin
//compile
kotlinc filename.kt -include-runtime -d hello.jar
//run
java -jar hello.jar
```
