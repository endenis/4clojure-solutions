;; #92 Read Roman numerals - http://www.4clojure.com/problem/92

;; TODO: implement a more elegant solution

(fn [roman]
  (let [numbers {\I 1, \V 5, \X 10, \L 50, \C 100, \D 500, \M 1000}]
    (first
      (reduce
        (fn [pair1 pair2]
          (list
            (+ (first pair1) (* (second pair1) (first pair2)))
            (second pair2)))
        (list 0 1)
        (map
          (fn [pair]
            (if (< (first pair) (second pair))
              (list (- (second pair) (first pair)) 0)
              (list (first pair) 1)))
          (let [sequence (partition 2 1 (map #(get numbers %) roman))]
            (concat sequence [(list (second (last sequence)) 1)])))))))
