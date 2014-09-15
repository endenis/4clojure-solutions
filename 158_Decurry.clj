;; #158 Decurry - http://www.4clojure.com/problem/158

(fn decurry [f]
  (fn [arg & args]
    (reduce #(%1 %2) (f arg) args)))
