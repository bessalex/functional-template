(ns exercise3)

(defn fibonacci
  "Resuelve la serie de Fibonacci"
  [x]
  (if (= x 0)
      0
      (if (= x 1)
          1
          (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
      )
  )
)
