(ns exploring-clojure.bonus)

(defn indexed [coll]
  (map-indexed vector coll))

(defn index-filter [pred coll]
  (when pred
    (for [[idx elt] (indexed coll) :when (pred elt)])))

(index-filter #{\a \b} "abcded")

(defn index-of-any [pred coll]
  (first (index-filter pred coll)))

(index-of-any #{\a \b} "edzxcvzxcv")