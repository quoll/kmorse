(ns ^{:doc "Provides functions for converting strings, keywords and symbols to and from morse code"
      :author "Paula Gearon"}
    remorse.morse
    (:require [clojure.string :as _···]
              #?(:clj
                 [remorse.bootstrap :refer [-··_·_··-·_--_·-_-·-·_·-·_---
                                            -··_·_··-·
                                            _··-·_-·
                                            _··_··-·
                                            _·-··_·_- -··_·_··-·_-·]]))
    #?(:cljs
       (:require-macros [remorse.bootstrap :refer [-··_·_··-·_--_·-_-·-·_·-·_---
                                                   -··_·_··-·
                                                   _··-·_-·
                                                   _··_··-·
                                                   _·-··_·_-
                                                   -··_·_··-·_-·]])))

(-··_·_··-· _···_·--·_·-··_··_- _···/split)
(-··_·_··-· _·-·_·_·--·_·-··_·-_-·-·_· _···/replace)
(-··_·_··-· _·-··_---_·--_·_·-·_-····-_-·-·_·-_···_· _···/lower-case)
(-··_·_··-· _·---_---_··_-· _···/join)
(-··_·_··-· _·-_·--·_·--·_·-··_-·-- apply)
(-··_·_··-· _···_-_·-· str)
(-··_·_··-· -·_·-_--_·_···_·--·_·-_-·-·_· namespace)
(-··_·_··-· -·_·-_--_· name)
(-··_·_··-· _···_-·--_--_-···_---_·-·· symbol)
(-··_·_··-· -·-_·_-·--_·--_---_·-·_-·· keyword)
(-··_·_··-· --_·-_·--· map)
(-··_·_··-· _··_-·_-_--- into)
(-··_·_··-· _·-·_·_-··_··-_-·-·_· reduce)
(-··_·_··-· -·-·_---_-·_·--- conj)

(-··_·_··-· -·-·_-····-_>_--_---_·-·_···_·
  {\a ".-" \b "-..." \c "-.-." \d "-.." \e "." \f "..-." \g "--." \h "...." \i ".." \j ".---"
   \k "-.-" \l ".-.." \m "--" \n "-." \o "---" \p ".--." \q "--.-" \r ".-." \s "..." \t "-"
   \u "..-" \v "...-" \w ".--" \x "-..-" \y "-.--" \z "--.." \1 ".----" \2 "..---" \3 "...--"
   \4 "....-" \5 "....." \6 "-...." \7 "--..." \8 "---.." \9 "----." \0 "-----" \- "-....-"
   \+ ".-.-." \_ "..--.-" \! "..--." \? "..--.." \/ "-..-." \. ".-.-.-" \, "--..--" \" ".-..-."
   \' ".----." \: "---..." \; "-.-.-." \@ ".--.-." \% ".--.." \( "-.--." \) "-.--.-" \space ""})

(_·-··_·_- [[--_-·-· -·-·_-·· -··_-·-·]
           (_·-·_·_-··_··-_-·-·_·
             (_··-·_-· [[-- -·-· -··] [-·- _···-]]
               (_·-··_·_- [-··_···- (_·-·_·_·--·_·-··_·-_-·-·_· _···- \. \·)]
                 [(-·-·_---_-·_·--- -- [_···- -·-])
                  (-·-·_---_-·_·--- -·-· [-·- -··_···-])
                  (-·-·_---_-·_·--- -·· [-··_···- -·-])]))
             [{} {} {}] -·-·_-····-_>_--_---_·-·_···_·)]
  (-··_·_··-· --_---_·-·_···_·_-····-_>_-·-· --_-·-·)
  (-··_·_··-· -·-·_-····-_>_-··_--_---_·-·_···_· -·-·_-··)
  (-··_·_··-· -··_--_---_·-·_···_·_-····-_>_-·-· -··_-·-·))

(-··_·_··-·_-· _···_-_·-·_··_-·_--·_-····-_>_--_---_·-·_···_·  ;; string->morse
  ([_···] (_···_-_·-·_··_-·_--·_-····-_>_--_---_·-·_···_· -·-·_-····-_>_--_---_·-·_···_· _···))
  ([-- _···]
   (->> (_·-··_---_·--_·_·-·_-····-_-·-·_·-_···_· _···)
        (--_·-_·--· #(-- % %))
        (_·---_---_··_-· "_")
        ((_··-·_-· [_···] (_·-··_·_- [[-·-·] _···] (_··_··-· (= \· -·-·) (_···_-_·-· \_ _···) _···)))))))

(-··_·_··-·_-· --_---_·-·_···_·_-····-_>_···_-_·-·_··_-·_--·
  ([_···] (--_---_·-·_···_·_-····-_>_···_-_·-·_··_-·_--· --_---_·-·_···_·_-····-_>_-·-· _···))
  ([-- _···]
   (->> (_···_·--·_·-··_··_- _··· #"_")
        ((_··-·_-· [_···] (_·-··_·_- [[-·-· & -] _···] (_··_··-· (= "" -·-·) - _···))))
        (--_·-_·--· #(-- % %))
        (_·-_·--·_·--·_·-··_-·-- _···_-_·-·))))

(-··_·_··-·_-· -·-·_---_-·_···-_·_·-·_-
  [- _··-· _···-]
  (- (-·_·-_--_·_···_·--·_·-_-·-·_· _···-) (_··-· (-·_·-_--_· _···-))))

(-··_·_··-·_-· -·-_·_-·--_·--_---_·-·_-··_-····-_>_--_---_·-·_···_·
  [-·-]
  (-·-·_---_-·_···-_·_·-·_- -·-_·_-·--_·--_---_·-·_-·· _···_-_·-·_··_-·_--·_-····-_>_--_---_·-·_···_· -·-))

(-··_·_··-·_-· --_---_·-·_···_·_-····-_>_-·-_·_-·--_·--_---_·-·_-··
  [-·-]
  (-·-·_---_-·_···-_·_·-·_- -·-_·_-·--_·--_---_·-·_-·· --_---_·-·_···_·_-····-_>_···_-_·-·_··_-·_--· -·-))

(-··_·_··-·_-· _···_-·--_--_-···_---_·-··_-····-_>_--_---_·-·_···_·
  [_···]
  (-·-·_---_-·_···-_·_·-·_-
   _···_-·--_--_-···_---_·-··
   #(_···_-_·-·_··_-·_--·_-····-_>_--_---_·-·_···_· -·-·_-····-_>_-··_--_---_·-·_···_· %)
   _···))

(-··_·_··-·_-· --_---_·-·_···_·_-····-_>_···_-·--_--_-···_---_·-··
  [_···]
  (-·-·_---_-·_···-_·_·-·_-
   _···_-·--_--_-···_---_·-··
   #(--_---_·-·_···_·_-····-_>_···_-_·-·_··_-·_--· -··_--_---_·-·_···_·_-····-_>_-·-· %)
   _···))

