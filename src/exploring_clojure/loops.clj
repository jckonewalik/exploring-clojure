(ns exploring-clojure.loops)

(loop [resultado [] x 5]
  (if (zero? x)
    resultado
    (recur (conj resultado x) (dec x))))