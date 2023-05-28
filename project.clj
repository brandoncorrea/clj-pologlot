(defproject clj-polyglot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :main clj-polyglot.core
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :resource-paths [
                   "build/golo.jar" ; Required for Golo
                   "build/kt.jar" ; Required for Kotlin
                   "build/scala.jar" ; Required for Scala
                   "build/yeti.jar" ; Required for Yeti
                   "bin/yeti.jar" ; Required for Yeti (core libraries)
                   ]
  :java-source-paths ["src"] ; Required for Java
  :profiles {:dev {:dependencies [[speclj "3.4.3"]]}}
  :plugins [[speclj "3.4.3"]]
  :test-paths ["spec"])
