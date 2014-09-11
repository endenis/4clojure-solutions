;; #54 Partition a Sequence - http://www.4clojure.com/problem/54

(fn [length coll]
  (loop [collection coll result []]
    (if (<= length (count collection))
      (recur (drop length collection) (conj result (take length collection)))
      result)))
