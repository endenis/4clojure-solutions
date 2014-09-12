;; #102 intoCamelCase - http://www.4clojure.com/problem/102

(fn [input]
  (let [words (clojure.string/split input #"-")]
    (apply str
      (cons (first words)
        (map clojure.string/capitalize (rest words))))))
