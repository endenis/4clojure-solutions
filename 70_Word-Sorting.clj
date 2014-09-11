;; #70 Word Sorting - http://www.4clojure.com/problem/70

(fn [input]
  (sort-by
    #(clojure.string/lower-case %)
    (re-seq #"\w+" input)))
