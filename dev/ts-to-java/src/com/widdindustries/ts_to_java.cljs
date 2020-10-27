(ns com.widdindustries.ts-to-java)

;https://github.com/Microsoft/TypeScript/wiki/Using-the-Compiler-API

(def ts (js/require "typescript"))

(defn syntax-kind [node]
  (goog.object.get (.-SyntaxKind ts) (str (.-kind node))))

(defn node->data [n]
  ; (println (.getFullText n))
  (let [kind (syntax-kind n)]
    {:kind     kind
     :name     (some-> n (.-name) (.getText))
     :children (some->> n (.getChildren) (map node->data))
     :value    (when (#{"JSDocComment" "StringLiteral"} kind)
                 (.getText n))})
  #_(map (fn [k]
           (let [prop (goog.object/get n k)]
             (if (clojure.string/starts-with? k "get")
               [k (.call prop n)]
               [k prop]))
           ) (js-keys n))
  )



(comment
  
  (js "../../proposal-temporal/polyfill/index.d.ts")
  (.cwd js/process)
  

  (def program (.createProgram ts #js["../../proposal-temporal/polyfill/index.d.ts"]
                 #js{}
                 ;(.-CompilerOptions ts)
                 ))



  (let [data
        (->>
          (.createSourceFile ts
            "index.d.ts"
            (-> (.readFileSync (js/require "fs") "../../proposal-temporal/polyfill/index.d.ts")
              str)
            (.. ts -ScriptTarget -ES2015)
            true)
          ;(.-kind)
          ;(.forEachChild node->data)
          (.getChildren)
          ;first
          ;js-keys
          ;(.getChildren)
          ;first

          ;(.-name)
          ;js-keys
          ;(.getFullText)
          (map node->data)
          )]
    (.writeFile (js/require "fs") "../../resources/temporal.edn"
      (pr-str data) (fn []))
    
    )

  )
