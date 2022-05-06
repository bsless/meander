(ns meander.primitive.sequence.zeta
  (:refer-clojure :exclude [concat
                            cons
                            empty]))

(defrecord SequenceEmpty [])

(defrecord SequenceCons [head tail])

(defrecord SequenceConcat [a b])

(defrecord SequenceSeqCast [a])

(defrecord SequenceVectorCast [a])

(def empty
  #'->SequenceEmpty)

(def cons
  #'->SequenceCons)

(def concat
  #'->SequenceConcat)

(def seq-cast
  #'->SequenceSeqCast)

(def vector-cast
  #'->SequenceVectorCast)
