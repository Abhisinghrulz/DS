https://blog.couchbase.com/saga-pattern-implement-business-transactions-using-microservices-part/

https://blog.couchbase.com/saga-pattern-implement-business-transactions-using-microservices-part-2/

The saga design pattern is a way to manage data consistency across microservices in distributed transaction scenarios. A saga is a sequence of transactions that updates each service and publishes a message or event to trigger the next transaction step.

**SAGA**

A sequence of local transactions

In Saga Pattern
* Each Transaction to a particular service is treated as local transaction. So, we have sequences of local transactions.
* Each Local Transaction (Saga) updates data within a single service
* Transactions could be sequential or parallel
* This design pattern preferred for long-running transactions.

There are a couple of different ways to implement a saga transaction, but the two most popular are:

a) Events/Choreography: When there is no central coordination, each service produces and listen to other service’s events and decides if an action should be taken or not.

b) Command/Orchestration: when a coordinator service is responsible for centralizing the saga’s decision making and sequencing business logic

Choreography :

Advantages :

It is simple, easy to understand, does not require much effort to build, and all participants are loosely coupled as they don’t have direct knowledge of each other.

Disadvantages :

However, this approach can rapidly become confusing if you keep adding extra steps in your transaction as it is difficult to track which services listen to which events.
Chances of cyclic dependencies

Orchestration

Advantages

Avoid cyclic dependencies
Centralize the orchestration of the distributed transaction
Easier to be implemented and tested


Disadvantages

However, this approach still has some drawbacks, one of them is the risk of concentrating too much logic in the orchestrator and ending up with an architecture where the smart orchestrator tells dumb services what to do.



Disadvantages


