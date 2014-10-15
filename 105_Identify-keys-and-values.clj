;; #105 Identify keys and values - http://www.4clojure.com/problem/105

(fn identify-keys-and-values [col]
  (loop [c col k nil v [] result {}]
    (cond
      (empty? c) (dissoc (conj result {k v}) nil)
      (number? (first c))
        (recur (rest c) k (conj v (first c)) result)
      (keyword? (first col))
        (recur (rest c) (first c) [] (conj result {k v})))))
