;; #77 Anagram Finder - http://www.4clojure.com/problem/77

(fn anagram-finder [words]
  (reduce conj #{}
    (map set
      (filter
        #(> (count %) 1)
        (vals (group-by sort words))))))
