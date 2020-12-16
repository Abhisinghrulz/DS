References
1) Strong Reference
2) Soft Reference
3) Weak Reference
4) Phantom Reference


https://www.javacodegeeks.com/2014/03/difference-between-weakreference-vs-softreference-vs-phantomreference-vs-strong-reference-in-java.html

WeakReference :
````
Counter counter = new Counter(); // strong reference - line 1
WeakReference<Counter> weakCounter = new WeakReference<Counter>(counter); //weak reference
counter = null; // now Counter object is eligible for garbage co
````
Object eagerly available for gc

Soft Reference
````
Counter prime = new Counter();  // prime holds a strong reference - line 2
SoftReference<Counter> soft = new SoftReference<Counter>(prime) ; //soft reference variable has SoftReference to Counter Object created at line 2
 
prime = null;  // now Counter object is eligible for garbage collection but only be collected when JVM absolutely needs memory
````
Object lazily available for gc

PhantomReference
````
DigitalCounter digit = new DigitalCounter(); // digit reference variable has strong reference - line 3
PhantomReference<DigitalCounter> phantom = new PhantomReference<DigitalCounter>(digit); // phantom reference to object created at line 3
 
digit = null;
````

Object immediately eligible for gc