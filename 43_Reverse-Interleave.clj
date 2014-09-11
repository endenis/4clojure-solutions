;; #43 Reverse Interleave - http://www.4clojure.com/problem/43

(fn [coll n] (apply map list (partition n coll)))
