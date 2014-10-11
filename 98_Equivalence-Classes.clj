;; #98 Equivalence Classes - http://www.4clojure.com/problem/98

(fn equivalence-classes [func coll]
  (reduce conj #{}
    (map
      #(set (second %))
      (group-by func coll))))
