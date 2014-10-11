;; #80 Perfect Numbers - http://www.4clojure.com/problem/80

(fn perfect-number? [n]
  (= n
    (apply +
      (filter
        #(= (mod n %) 0)
        (range 1 n)))))
