A simple test to understand the performance characteristics of Rust vs. Java for Adtech-related tasks. The test was done using commonly 
available servers and libraries. The goal of the analysis was not to prove the comparison under optimal conditions and with many 
optimizations but to understand what an amateur implementer might expect. 

## Summary
Two different implementations of a simple server (one in Rust and one in Java) were created. Each server takes in a request
that is approximately 2K and returns a simple request. The code looks for one value in the JSON request and returns a different
response depending on whether that was present (coppa). This use-case was chosen since it is most like a real-time adtech scenario, and 
since the values are actually used, there is little chance for internal optimizations. 

Each system logs approximately the same amount of information as the log. 

## Running the Java Server

```
cd java
mvn clean package
java -server -Xms4g -Xmx4g -XX:+UseG1GC -XX:+UseStringDeduplication -jar /Users/daviddandeneau/Projects/rust_perf/java/target/java-perf-1.0-SNAPSHOT.jar
```

## Running the Rust Server
```
cd rust
cargo build --releease
cargo run --release
```

## Running the load tests

```
drill --benchmark drill_java.yml --stats
drill --benchmark drill_rust.yml --stats
```

## Results
While running on a mackbook with 12 cores and running 6 samples, the rust server full load test takes 22% less time to run with individual requests being near 0ms. 
The rust server was also able to achieve 29.6% higher overall throughput (47.5K TPS). Clearly there is some tuning to be done which might improve. 
