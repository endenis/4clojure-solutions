;; #74 Filter Perfect Squares - http://www.4clojure.com/problem/74

(fn [input]
  (clojure.string/join ","
    (filter
      (fn [n]
        (#(= 0.0 (- (int %) %))
          (Math/sqrt (Integer/parseInt n))))
      (clojure.string/split input #","))))
