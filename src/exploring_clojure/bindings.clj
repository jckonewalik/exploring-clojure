(ns exploring-clojure.bindings)

(comment

  (def foo 10)
  foo

  (defn triple [number]
    (* 3 number))

  (triple 10)

  (let [nome "Joao"
        conta-string (fn [string] (count string))]
    (conta-string (str "Ola " nome)))

  nome
  foo

  (def pessoa {:nome "Joao" :idade 33})

  (defn revela-idade [pessoa]
    (:idade pessoa))

  (revela-idade pessoa)

  (defn revela-idade [{batata :idade}]
    batata)

  (defn revela-idade [{:keys [idade]}]
    idade)

  (def coordenadas [20 30 50 100])

  (defn revela-2-coords [coordenadas]
    [(first coordenadas) (second coordenadas)])

  (revela-2-coords coordenadas)

  (defn revela-2-coords [[_ _ z]]
    [z])

  )