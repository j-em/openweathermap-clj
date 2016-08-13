(ns openweathermap-clj.core
  (:require [clj-http.client :as client]
            [cemerick.url :as url]
            [clojure.data.json :as json]
            [clojure.walk :as walk]))

(def api-link "http://api.openweathermap.org/data/2.5/")

(defn current [key id]
  (-> (url/url api-link "weather")
      str
      (client/get {:query-params {"q" id "appid" key} :as :json})
      :body
      json/read-str
      walk/keywordize-keys))


