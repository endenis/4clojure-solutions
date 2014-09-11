;; #60 Sequence Reductions - http://www.4clojure.com/problem/60

(fn my-reduce
  ([f coll]
    (my-reduce f (first coll) (rest coll)))
  ([f val coll]
    (if (empty? coll)
      (list val)
      (lazy-seq
        (cons val
          (my-reduce f
            (f val (first coll))
            (rest coll)))))))
