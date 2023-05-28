# clj-polyglot

Proof of Concept for JVM-based language interop in Clojure.

## Languages So Far...

- Clojure
- Golo (You might ask, _why?!_ I say, _why not?!_)
- Java
- Kotlin
- Scala

## Pending Languages...

- Ballerina/jBallerina
- Ceylon
- Concurnas
- Fantom
  - How can I create a .jar from .fan
- Frege
- Go/JGo
- Golo
  - Pending Objects/Structs
- Groovy
- Jython
- JRuby
- Xtend
- Yeti
- Haskell?
- C/C++ ???
  - JNI
- .NET !?!?!?
  - JNI/PInvoke or JNBridge

## Compile

    # Kotlin
    kotlinc src -d kt.jar

    # Scala
    scalac src/bwawan/scala/* -d scala.jar

    # Golo
    golo compile src/bwawan/golo
    jar cf golo.jar bwawan/golo

## Test

    lein spec -a

## Run

    lein run
