# Temporal.java

Pure Java implementation of [ECMA Temporal](), with light 1-1 wrappers for compile-to-js JVM languages, 
such as Kotlin, Scala and Clojure.

# Rationale

* Use your preferred JVM language on the server and its equivalent in JS
* Write cross-platform code involving dates and times
* Use the Temporal API since it is smaller than java.time and browser environments are payload-sensitive
* Map the temporal API to Java once and leverage that from any JVM language

# Goals

* Leverage native date api on the client - minimal wrapper functions required
* zero garbage overhead on the jvm - use platform java.time entities and work with those via static methods

# Status 

## Milestones

| Milestone | Status |
|-----------|--------|
| API       | Started |
| Tests (auto-conversion from js) | Not Started |
| Java Implementation | Not Started |
| Clojure Wrapper | Not Started |
| Scala Wrapper | Not Started |
| Kotlin Wrapper | Not Started |

## Entities

| Temporal Entity    | Java Implementation ? |
|---------------------|-------------|
|  Absolute | No        |
| TimeZone | No        |
| DateTime | No        |
| Date | No        |
| Time | No        |
| YearMonth | No        |
 | MonthDay        | No        |
| Duration  | No        |
 | ZonedDateTime    | No        |
|Temporal.now | No        |

# Usage

## From Java 

```java

import com.widdindustries.Temporal;
import java.time.LocalDateTime;

//...

LocalDateTime foo = Temporal.DateTime.from("2018-07-25T08:08:44.026");

```

## From Clojure(Script)

```clojure

(require '[com.widdindustries.temporal :as temporal])

(temporal/date-time-from "2018-07-25T08:08:44.026")

```

## Code Generation Steps

## Translate TS definitions to data

cd dev/ts-to-java

npx shadow-cljs node-repl

start nrepl  - use standard port file

in repl:

(shadow/repl :node-repl) 

## Data -> API

## JS tests -> Java tests


## License

Licensed under the Apache 2.0 License

Copyright © 2020 Widd Industries Ltd

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
