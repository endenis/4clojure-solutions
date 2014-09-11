;; #58 Function Composition - http://www.4clojure.com/problem/58

(fn my-comp [& functions]
  (fn [& arguments]
    (first
      (reduce
        (fn [r f]
          (list (apply f r)))
        arguments
        (reverse functions)))))

