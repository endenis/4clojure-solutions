;; #56 Find Distinct Items - http://www.4clojure.com/problem/56

(fn [coll]
  (loop [result [] collection coll]
    (cond
      (empty? collection) result
      (some #(= (first collection) %) result) (recur result (rest collection))
      :else (recur (conj result (first collection)) (rest collection)))))
