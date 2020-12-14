1) **Serializable vs Externalizable**

    Externalizable has two extra methods readExternal and writeExternal

2) **The enums are type-safe** means that an enum has its own namespace, we can't assign any other value other than specified in enum constants.

3) 
````
ACID is a set of properties that you would like to apply when modifying a database.

Atomicity
Consistency
Isolation
Durability
A transaction is a set of related changes which is used to achieve some of the ACID properties. Transactions are tools to achieve the ACID properties.

Atomicity means that you can guarantee that all of a transaction happens, or none of it does; you can do complex operations as one single unit, all or nothing, and a crash, power failure, error, or anything else won't allow you to be in a state in which only some of the related changes have happened.

Consistency means that you guarantee that your data will be consistent; none of the constraints you have on related data will ever be violated.

Isolation means that one transaction cannot read data from another transaction that is not yet completed. If two transactions are executing concurrently, each one will see the world as if they were executing sequentially, and if one needs to read data that is written by another, it will have to wait until the other is finished.

Durability means that once a transaction is complete, it is guaranteed that all of the changes have been recorded to a durable medium (such as a hard disk), and the fact that the transaction has been completed is likewise recorded.

So, transactions are a mechanism for guaranteeing these properties; they are a way of grouping related actions together such that as a whole, a group of operations can be atomic, produce consistent results, be isolated from other operations, and be durably recorded.
````
4) SOLID
````
   S : SINGLE RESPONSIBILITY PRINCIPLE : A class should have one only one responsibility
   O : OPEN/CLOSED PRINCIPLE : A class should be open for extension not modification
   L : LISKOV SUBSTITUTION PRINCIPLE : The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application. That requires the objects of your subclasses to behave in the same way as the objects of your superclass
   I : INTERFACE SEGREGATION PRINCIPLE :
   D : DEPENDENCY INVERSION PRINCIPLE :
   Based on this idea, Robert C. Martin’s definition of the Dependency Inversion Principle consists of two parts:

   High-level modules should not depend on low-level modules. Both should depend on abstractions.
   Abstractions should not depend on details. Details should depend on abstractions
````

