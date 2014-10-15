;; #78 Reimplement Trampoline - http://www.4clojure.com/problem/78

(fn my-trampoline [func & params]
  (loop [result (apply func params)]
    (if (fn? result)
      (recur (result))
      result)))
