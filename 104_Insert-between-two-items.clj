;; #104 Insert between two items - http://www.4clojure.com/problem/104

(defn insert-between-two-items [pred marker col]
  (if (empty? col)
    []
    (lazy-cat
      [(first col)]
      (flatten
        (map
          (fn [pair]
            (lazy-cat
              (if (pred (first pair) (last pair))
                [marker]
                [])
              [(last pair)]))
          (partition 2 1 col))))))
