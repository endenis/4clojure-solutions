;; #67 Prime Numbers - http://www.4clojure.com/problem/67

(fn prime-numbers [x]
  (take x
    (filter
      (fn prime? [n]
        (.isProbablePrime (BigInteger/valueOf n) 10))
      (range 1 Integer/MAX_VALUE))))
