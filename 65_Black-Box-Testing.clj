;; #65 Black Box Testing - http://www.4clojure.com/problem/65

(fn [input]
  (cond
    (= input (conj input {})) :map
    (= (conj input :ololo) (conj (conj input :ololo) :ololo)) :set
    (= (first (conj (conj input :ololo) :ahaha)) :ahaha) :list
    (= (last  (conj (conj input :ololo) :ahaha)) :ahaha) :vector))
