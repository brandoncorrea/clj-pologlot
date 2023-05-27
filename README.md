# clj-polyglot

Proof of Concept for JVM-based language interop in Clojure.

## Languages So Far...

- Clojure
- Java
- Kotlin
- Scala

## Compile

    # Kotlin
    kotlinc src -d kt.jar

    # Scala
    scalac src/bwawan/scala/* -d scala.jar

## Test

    lein spec -a

## Run

    lein run
