;; Happy numbers - http://www.4clojure.com/problem/86

(fn happy-number? [number]
  (loop [n number seen #{}]
    (cond
      (= n 1) true
      (contains? seen n) false
      :else
        (let [digits (map #(Character/getNumericValue %) (str n))]
          (recur
            (reduce + (map #(* % %) digits))
            (conj seen n))))))
