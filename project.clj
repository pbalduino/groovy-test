(defproject groovy-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths        ["src/clojure"]
  :groovy-source-paths ["src/groovy"]
  :java-source-paths   ["src/java"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [lein-groovyc        "0.3.0"]
                 [org.dynjs/dynjs     "0.2.2"]]
  :plugins      [[lein-groovyc "0.3.0"]]
  :aot  [groovy-test.core]
  :main groovy-test.core)
