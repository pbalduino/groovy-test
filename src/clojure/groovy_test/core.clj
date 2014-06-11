(ns groovy-test.core
  (:import [HelloGroovy]))

(defn -main [& args]
  (println "I'm running this code inside Clojure")
  (. (HelloGroovy.) run))
