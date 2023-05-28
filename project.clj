(defproject clj-polyglot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :main clj-polyglot.core
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :resource-paths [
                   "golo.jar" ; Required for Golo
                   "kt.jar" ; Required for Kotlin
                   "scala.jar" ; Required for Scala
                   ]
  :java-source-paths ["src"] ; Required for Java
  :profiles {:dev {:dependencies [[speclj "3.4.3"]]}}
  :plugins [[speclj "3.4.3"]]
  :test-paths ["spec"])
