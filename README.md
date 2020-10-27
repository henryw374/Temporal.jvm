# Temporal.java

Pure Java implementation of proposal-temporal.

Can be used by compile-to-js jvm languages such as Kotlin, Scala and Clojure

## Need to answer first... 

Constructors?
Why have 

DateTime
DateTimeFields
DateTimeISOFields
DateTimeLike


## Usage

FIXME

## Build

generate json schema 

`typescript-json-schema "../../proposal-temporal/polyfill/*.ts" * -o ../../resources/temporal-schema.json`

echo '{:deps {  thheller/shadow-cljs {:mvn/version "2.11.5"} }}' > deps.edn
echo '{:deps {}}' > shadow-cljs.edn
echo '{}' > package.json


npx shadow-cljs node-repl

(shadow/repl :node-repl) 


## License

Copyright © 2020 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
