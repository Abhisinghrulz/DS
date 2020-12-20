**Vertical scaling**

You scale by adding more power (CPU, RAM) to your existing machine.

**Horizontal scaling**

You scale by adding more machines into your pool of resources.

**Caching**

1) Application Caching
2) Database Caching
3) InMemoryCache

**Load balancing**

Public servers of a scalable web service are hidden behind a load balancer. This load balancer evenly distributes load (requests from your users) onto your group/cluster of application servers.

**Database replication**

Database replication is the frequent electronic copying data from a database in one computer or server to a database in another so that all users share the same level of information. The result is a distributed database in which users can access data relevant to their tasks without interfering with the work of others. The implementation of database replication for the purpose of eliminating data ambiguity or inconsistency among users is known as normalization.

**Database partitioning**
Partitioning of relational data usually refers to decomposing your tables either row-wise (horizontally) or column-wise (vertically).

More details for sharding is in partitioning.md

Bandwidth is a measure of how much data over time a communication link can handle, its capacity. This is typically measured as kbps (kilobits – thousands of bits per second), Mbps (megabits – millions of bits per second) or Gbps (gigabits – billions of bits per second).

Latency is the time it takes for a packet to get across the network, from source to destination. It is measured in units of time — ms (millisecond, or 1/1,000 of a second).

Throughput is the actual amount of data that is successfully sent/received over the communication link. Throughput is presented as kbps, Mbps or Gbps, and can differ from bandwidth due to a range of technical issues, including latency, packet loss, jitter and more.


```
IP - Internet Protocol
Think of this as the fundamental layer of protocols. It is the basic protocol that instructs us on how almost all communication across internet networks must be implemented.

Messages over IP are often communicated in "packets", which are small bundles of information (2^16 bytes). Each packet has an essential structure made up of two components: the Header and the Data.

The header contains "meta" data about the packet and its data. This metadata includes information such as the IP address of the source (where the packet comes from) and the destination IP address (destination of the packet). Clearly, this is fundamental to being able to send information from one point to another - you need the "from" and "to" addresses.  
```

```
TCP - Transmission Control Protocol
TCP is a utility built on top of IP. As you may know from reading my posts, I firmly believe you need to understand why something was invented in order to truly understand what it does.

TCP was created to solve a problem with IP. Data over IP is typically sent in multiple packets because each packet is fairly small (2^16 bytes). Multiple packets can result in (A) lost or dropped packets and (B) disordered packets, thus corrupting the transmitted data.  TCP solves both of these by guaranteeing transmission of packets in an ordered way.

Being built on top of IP, the packet has a header called the TCP header in addition to the IP header. This TCP header contains information about the ordering of packets, and the number of packets and so on.
```

````
HTTP - Hyper Text Transfer Protocol
HTTP is a protocol that is an abstraction built on top of TCP/IP. It introduces a very important pattern called the request-response pattern, specifically for client-server interactions.  
HTTP requests and responses can be thought of as messages with key-value pairs, very similar to objects in JavaScript and dictionaries in Python, but not the same.
HTTP methods are "GET", "POST", "PUT", "DELETE" and "PATCH".
````

````
HTTP is unsecured while HTTPS is secured. HTTP sends data over port 80 while HTTPS uses port 443. HTTP operates at application layer, while HTTPS operates at transport layer. No SSL certificates are required for HTTP, with HTTPS it is required that you have an SSL certificate and it is signed by a CA.
````

````
client <-> proxy <-> server
When client acts as proxy that is known as Forward Proxy
When server acts as proxy that is known as Reverse Proxy
````

