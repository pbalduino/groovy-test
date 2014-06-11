(ns groovy-test.core
  (:import [HelloGroovy]
  		   [HelloJava]
  		   [org.dynjs Config]
         [org.dynjs.runtime DynJS]
  		   [org.dynjs.exception ThrowException]))

(defn- hello-clojure []
  (println "I'm running this code inside Clojure"))

(defn hello-groovy []
  (.run (HelloGroovy.)))

(defn- hello-java []
  (.run (HelloJava.)))

(defn- hello-javascript []
  (let [config (Config.)
        dynjs (DynJS. config)]
    (.evaluate dynjs "System = java.lang.System; System.out.println(\"I'm running this code inside JavaScript with DynJS\");")))

(defn -main [& args]
  (hello-clojure)
  (hello-groovy)
  (hello-java)
  (hello-javascript))