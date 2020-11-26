```Difference Between ClassNotFoundException & NoClassDefFoundError```

Both of these errors are related to missing classes in the classpath, however the main difference lies how it originate.

ClassNotFoundException occurs when you try to load a class at runtime by using Class.forName() or loadClass() and requested class is not present in classpath. It is thrown when an application tries to load in a class through its name, but no definition for the class with the specified name could be found.

NoClassDefFoundError is encountered when the class was available at compile time but not during runtime.


```What are the Object class methods?```

protected Object clone() throws CloneNotSupportedException
Creates and returns a copy of this object.

public boolean equals(Object obj)
Indicates whether some other object is "equal to" this one.

protected void finalize() throws Throwable
Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.

public final Class getClass()
Returns the runtime class of an object.

public int hashCode()
Returns a hash code value for the object.

public String toString()
Returns a string representation of the object.

The notify, notifyAll, and wait methods of Object all play a part in synchronizing the activities of independently running threads in a program. There are 5 of these methods:
public final void notify() public final void notifyAll() public final void wait() public final void wait(long timeout) public final void wait(long timeout, int nanos)
````
What is transient variable in Java?
````
Transient variable cannot be serialized.

For example if a variable is declared as transient in a class implementing Serializable interface and the class is persisted to an ObjectStream, the value of the variable is ignoerd and not written to the stream. When the class is retrieved from the ObjectStream the value of the variable becomes null.

```What is shadowing in Java?```

Shadowing refers to the practice of using two variables with the same name within scopes that overlap. When shadowed, the variable with the higher-level scope is hidden because the variable with lower-level scope overrides it. The higher-level variable is then shadowed.

```Is local variable thread safe in java?```

Yes. All local variables defined in your program will be allocated memory in the stack.

```What is a static block?```

A static block, is a block of code inside a Java class that will be executed when a class is first loaded into the JVM.

````strictfp````
 strictfp restricts floating-point calculations and ensuring same result on every platform while performing operations in the floating-point variable.
 
 ```Explain the native keyword in Java?```
 The native keyword is applied to a Java method to indicate that the method is implemented in native code using JNI (Java Native Interface).
 
 