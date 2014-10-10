;; #69 Merge with a Function - http://www.4clojure.com/problem/69

(fn merge-with-a-function [func & maps]
  (reduce
    (fn [m1 m2]
      (loop [acc m1 add m2]
        (if (empty? add)
          acc
          (recur
            (let [k (key (first add))
                  v (val (first add))]
              (if (contains? acc k)
                (assoc acc k (func (get acc k) v))
                (assoc acc k v)))
            (rest add)))))
    {}
    maps))
