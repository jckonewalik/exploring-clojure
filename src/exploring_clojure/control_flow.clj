(ns exploring-clojure.control-flow)

(def pessoa {:nome "Joao" :idade 33})
(def pessoa-menor {:nome "Maria" :idade 17})

(if (>= (:idade pessoa-menor) 18)
  "Maior de idade"
  "Menor de idade")

(if (>= (:idade pessoa) 18)
  (do
    (println (:nome pessoa))
    "Maior de idade")
  "Menor de idade")
