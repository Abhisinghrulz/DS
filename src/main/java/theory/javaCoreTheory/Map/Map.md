HashMap will store null key at 0th location
=> The HashMap doesn't call hashCode() on the null key because it will throw NullPointerException,

Rehashing – How it’s done?
````
Steps for Rehashing as follows:

For every new entry into the map, check the load factor.
If the load factor is greater than its threshold value (default 0.75 for HashMap), then start Rehash.
For Rehashing, initialize a new array of double the size of the previous one.
Copy all elements into a new array and make it the new bucket array.
````

What is Load factor in HashMap?
````
The load factor in HashMap is basically a measure that decides when exactly to increase the size of the HashMap to maintain the same time complexity of O(1).
````

In MultiThreaded applications we should use Concurrent HashMap.

````
HashMap have high performance but are not thread safe
HashTable are thread safe but have low performance

Concurrent HashMap provides better performance by replacing hashmap
wide range lock to segment level lock.
Concurrent HashMap has good features of both
Concurrent HashMap doesn't allow null keys and values

ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(200, 0.75f, 10);

200 is the initialCapacity that means it would be able to add 200 key
value pairs

0.75f is the load factor that means when 0.75 * 200 when that element is added 
rehashing needs to be done

10 is the concurrency level that means at any given point of time
there would be 10 threads hence the default capacity of the segmemt should be 
greater than 10 i.e. 2^4 = 16

Different Operations

Read Operation
Same Segment / Different Segment : Yes

Write Operation
Different Segment : Yes
Same Segment : No

Read/Write Operation
Same/Different Segment : Yes
````