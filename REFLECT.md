# Reflect

Below is my own (strongly opinionated) reflection on the language integrations thus far.

I recommend you try each of these out for yourself
and see what best fits _your_ workflow.

## Ranking

1. Java
2. Kotlin
3. Scala
4. Yeti
5. Golo

## Overall

These examples exist not only to integrate your favorite language
with Clojure, but also to inject Clojure into an existing codebase
that you wish to replace with Clojure.

For example, you may be working in a Golo codebase–a deprecated language!
You can't replace _all_ the code at once, but you can at least absorb it
and gradually replace it with Clojure.


## Java

Java code has the best and most seamless interface with Clojure so far.

````clojure
(Foo/bar "baz") ; From static class invocations...
(.bar (Foo.) "baz") ; ...to object instantiation
````

Clojure promotes the use of Java with `project.clj`'s `:java-source-paths` option.

````clojure
(defproject foo "1.0.0"
  :java-source-paths ["src"]
  )
````

...however, Java requires a lot more code than other languages to do simple tasks.


## Kotlin

Kotlin is a good runner up to Java's interface.
The only thing bringing it down is the need for `Companion` references for "static" function calls.

````clojure
(.bar Foo/Companion "baz") ; This is less ideal than Java's interface
(.bar (Foo.) "baz") ; Object instantiation remains the same
````

I like Kotlin better than Java as a language.
The only thing I can see holding it back as an interop 
preference is the need for `Companion` object references.


## Scala

Next is Scala, which has an even less desirable interface for static functions than Kotlin.

````clojure
(.bar Foo$/MODULE$ "baz") ; Just... ew
(.bar (Foo.) "baz") ; Object instantiation remains the same
````

Not only do you have the `$MODULE$` reference for static functions,
but these are also kept in a completely different class: `Foo$` vs `Foo`.
It's just a confusing interface overall.

With Scala being a functional language like Clojure, I wouldn't opt for this
sharing of code. The interface is ugly and there is no benefit from
adopting a language under the same paradigm.


## Golo

A deprecated language, but a language nonetheless.
There is almost no community for this language,
so getting things moving was a bit difficult at first.

Unfortunately, with my limited knowledge and the small community surrounding the language,
I have yet to find a way to instantiate and invoke class-level methods.

I think I'm missing the `golo.lang` library... maybe I'll look for it at some point
and add an object example.

````clojure
(Foo/bar "baz") ; Static methods remain the same <3
````

While the language may be deprecated, its developers did a good job conforming the static 
methods to Java's static method interface.

With this language no longer being supported, I would only integrate it with Clojure if
I were working in a Golo codebase.

## Yeti

I don't know if Golo or Yeti has a smaller Community... I wanna say Yeti.

The interface for static methods from Yeti to Clojure is horrendous.
First you need to invoke one method to get a `Fun` object, then you
invoke the `apply` method on that `Fun` object with your arguments. _Why???_

Maybe there's a cleaner way to do this in Yeti and I'm just a big noob.
There probably is... let's just blame me for now.

````clojure
(.apply (foo/bar) "baz") ; "Static" method...? 🤢
````

Simply due to the lack of community for the language,
I wouldn't actively pursue integration with Yeti and Clojure
until I can at least `brew install yeti`.

## IntelliJ

This is something I thought was worth noting,
since _my_ preferred IDE for Clojure is Intellij.

As of writing this, the `.golo` and `.yeti` extensions are not recognized by the IDE,
and the intellisense does not kick in for these file types.

I don't anticipate support for Golo coming any time soon, but if Yeti starts gaining
traction, I can see someone creating IDE support for this in IntelliJ.

Namespaces in Java, Kotlin, and Scala files are all recognized in the Clojure source code,
which I find to be quite nice.
