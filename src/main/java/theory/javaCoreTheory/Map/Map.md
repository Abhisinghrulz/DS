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

