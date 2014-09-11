;; #44 Rotate Sequence - http://www.4clojure.com/problem/44

(fn [length input]
  (let [n (mod length (count input))]
    (concat (drop n input) (take n input))))
