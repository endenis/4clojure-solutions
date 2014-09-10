(fn my-reduce
  ([f coll]
    (my-reduce f (first coll) (rest coll)))
  ([f val coll]
    (if (empty? coll)
      val
      (cons val
        (lazy-seq
          (my-reduce f
            (f val (first coll))
            (rest coll)))))))
