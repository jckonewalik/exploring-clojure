(ns exploring-clojure.functions)

(comment

  (str "hello" " " "world")
  ;string?
  ;nil?

  (defn greeting [name]
    (str "hello" " " name))

  (defn greeting
    "Retorna uma string de saudação baseado no nome do argumento"
    [name]
    (str "Ola " name))

  (clojure.repl/doc greeting)

  (greeting "Joao")

  (greeting)

  (defn greeting
    "Retorna uma string de saudação baseado no nome do argumento"
    ([]
     (greeting "Mundo"))
    ([name]
     (str "Ola " name)))



  )