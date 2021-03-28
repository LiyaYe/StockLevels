(ns stock-levels.prod
  (:require [stock-levels.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
