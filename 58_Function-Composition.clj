;; #58 Function Composition - http://www.4clojure.com/problem/58

((

(fn [& functions]
  (fn [& arguments]
    (reduce #(vector (apply %2 %1)) arguments (reverse functions))))

rest reverse) [1 2 3 4])
; (reverse functions)
