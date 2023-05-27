(ns clj-polyglot.core
  (:import (bwawan.java Coffee Tea)
           (bwawan.kt Goodbye Hello)))

(defn kotlin-example []
  (println "----- Kotlin Examples -----")
  (println "Hello Companion:" (.greet Hello/Companion))
  (println "Hello Object:" (.greet (Hello.)))
  (println "Goodbye Companion:" (.farewell Goodbye/Companion))
  (println "Goodbye Object:" (.farewell (Goodbye.))))

(defn java-example []
  (println "----- Java Examples -----")
  (println "Coffee Static:" (Coffee/brew "Dark" 12))
  (let [coffee (Coffee.)]
    (set! (.-beans coffee) 5)
    (set! (.-roast coffee) "Light")
    (println "Coffee Object:" (.brew coffee)))
  (println "Tea Static:" (Tea/steep "Black" 3))
  (let [tea (Tea.)]
    (set! (.-leaves tea) 7)
    (set! (.-herb tea) "Green")
    (println "Tea Object:" (.steep tea))))

(defn -main
  [& _]
  (kotlin-example)
  (println)
  (java-example))
