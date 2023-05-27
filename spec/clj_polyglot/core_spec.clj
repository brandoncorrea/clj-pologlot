(ns clj-polyglot.core-spec
  (:require [clj-polyglot.core :refer :all]
            [speclj.core :refer :all])
  (:import (bwawan.java Coffee Tea)
           (bwawan.kt Goodbye Hello)
           (bwawan.scala Dragon Dragon$ Lizard Lizard$) ; Static classes require the $ suffix
           ))

(describe "a test"

  (context "Kotlin"
    (it "Greets from 'static' companion object"
      (should= "Static Greeting!" (.greet Hello/Companion)))
    (it "Greets from instantiated object"
      (should= "Howdy!" (.greet (Hello.))))
    (it "Goodbye from 'static' companion object"
      (should= "Static Farewell!" (.farewell Goodbye/Companion)))
    (it "Goodbye from instantiated object"
      (should= "Adios!" (.farewell (Goodbye.)))))

  (context "Java"
    (it "Brews Static Coffee"
      (should= "Brewing 12 Beans of Dark Roast Coffee" (Coffee/brew "Dark" 12)))
    (it "Brews coffee from Object"
      (let [coffee (Coffee.)]
        (set! (.-beans coffee) 15)
        (set! (.-roast coffee) "Light")
        (should= "Brewing coffee by object..." (.brew coffee))))
    (it "Steeps Static Tea"
      (should= "Steeping 4 leaves of Green Tea statically." (Tea/steep "Green Tea" 4)))
    (it "Steeps Tea from Object"
      (let [tea (Tea.)]
        (set! (.-leaves tea) 7)
        (set! (.-herb tea) "Black")
        (should= "Steeping 7 leaves of this Black tea" (.steep tea)))))

  (context "Scala"
    (it "Dragon Objects have scales"
      (should= "This dragon object has scales" (.scales (Dragon.))))
    (it "Static dragons with scales"
      (should= "Static dragons have scales" (.scales Dragon$/MODULE$)))
    (it "Lizard Objects can leap"
      (should= "The lizard object jumps over the moon" (.leap (Lizard.))))
    (it "Static lizards leap"
      (should= "The static lizard jumps over the moon" (.leap Lizard$/MODULE$))))
  )
