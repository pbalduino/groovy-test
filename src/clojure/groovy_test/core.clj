(ns groovy-test.core
  (:import [HelloGroovy]
  		   [HelloJava]))

(defn- hello-clojure []
  (println "I'm running this code inside Clojure"))

(defn hello-groovy []
  (.run (HelloGroovy.)))

(defn- hello-java []
  (.run (HelloJava.)))

(defn -main [& args]
  (hello-clojure)
  (hello-groovy)
  (hello-java))