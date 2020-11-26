```
Memory leak in Java refers to a situation where some objects are not used by the application any more,
but GC fails to recognize them as unused. As a result, these objects remain in memory indefinitely, 
reducing the amount of memory available to the application.
```

````
Types of memory leaks in Java.
OutOfMemoryError is one of the symptom to be diagnosed as it could lead to memory leaks.

Application may crash without issuing OutOfMemoryError.
````

 ```
How do you diagonise memory leaks in Java?
Identify symptoms,
Enable verbose garbage collection using -verbosegc argument,
Enable profiling,
Analyze the trace.```