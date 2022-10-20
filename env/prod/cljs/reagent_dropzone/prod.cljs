(ns reagent-dropzone.prod
  (:require [reagent-dropzone.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
