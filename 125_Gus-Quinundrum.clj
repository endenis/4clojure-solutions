;; #125 Gus' Quinundrum - http://www.4clojure.com/problem/125

(fn []
  ((fn [input]
     (clojure.string/join (concat (first input) [input] (last input))))
   ["(fn [] ((fn [input] (clojure.string/join (concat (first input) [input] (last input)))) " "))"]))
