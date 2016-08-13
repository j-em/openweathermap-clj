(set-env!
 :resource-paths #{"src"}
 :dependencies '[[clj-http "2.2.0"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/data.json "0.2.6"]])

(task-options!
 pom {:project 'openweathermap-clj
      :version "0.1.0"})

