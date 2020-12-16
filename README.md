# Temporal.java

Pure Java implementation of [ECMA Temporal](https://github.com/tc39/proposal-temporal/), with light 1-1 wrappers for compile-to-js JVM languages, 
such as Kotlin, Scala and Clojure.

# Rationale

* Use your preferred JVM language on the server and its equivalent where JS is required (browsers etc)
* Write cross-platform code involving dates and times (same API, same semantics, same tests etc)
* Use the Temporal API since it is smaller than java.time and browser environments are payload-sensitive
* Map the temporal API to Java once and leverage that from any JVM language

# Goals

* Leverage native date api on the client - minimal wrapper functions required
* zero garbage overhead on the jvm - use wrapper-free platform java.time entities and work with those via static methods

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
|  Instant | Not Started        |
| TimeZone | Not Started        |
| DateTime | Not Started        |
| Date | Not Started        |
| Time | Not Started        |
| YearMonth | Not Started        |
 | MonthDay        | Not Started        |
| Duration  | Not Started        |
 | ZonedDateTime    | Not Started        |
|Temporal.Now | Not Started        |

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

## From Kotlin(.js)

TBD

## From Scala(.js)

TBD

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

This program and the accompanying materials are made available under the
terms of the Apache 2.0 which is available at

Copyright © 2020 Widd Industries Ltd

