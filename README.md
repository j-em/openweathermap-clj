# openweathermap-clj
This is a simple clojure library that wraps the [OpenWeatherMap](http://openweathermap.org) service in Clojure. You will need an *api key* from [here](http://openweathermap.org/appid) to use this.

# How to use it
```clojure
(ns my.namespace
  (:require [openweathermap-clj.core :as weather]))

;; Get the current weather in London
(weather/current "myapikey" "London")
  ```
