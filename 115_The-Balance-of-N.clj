;; #115 The Balance of N - http://www.4clojure.com/problem/115

(fn [input]
  (let [digits (str input) half (int (/ (count digits) 2))]
    (reduce =
      (map
        (fn [h]
          (reduce #(+ %1 (Character/getNumericValue %2)) 0 h))
        (list
          (take half digits),
          (take-last half digits))))))
