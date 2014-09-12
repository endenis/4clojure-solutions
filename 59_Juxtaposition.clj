;; #59 Juxtaposition - http://www.4clojure.com/problem/59

(fn my-juxt [& functions]
  (fn [& arguments]
    (map
      #(apply % arguments)
      functions)))
