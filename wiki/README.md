# Problem

Design a wiki-like system.

# Analysis

The problem statement is very brief and generic so you should definitely ask questions to narrow down the constraints. This question is not only to test your object-oriented design skill but likely to test your system design knowledge to handle large-scale distributed system. 

1. Questions to ask

- What are the use cases? Add/view/edit/remove a post? Search for entries? View history of edit? Tagging of the post?
- What can users search by? Title, tags, author or date created?
- Do users need to login to create/edit posts?
- Who can edit the posts? Author and contributors?
- Who are the users? Admin, contributors, viewers? What can admin do?
- What media types do we support? Plain text, images, videos?
- How many users do we support?
- Do we store data in database?

2. Entities

- Entry (For a wiki post entry)
- User
- EntryManager Interface (for operations on wiki posts)


3. Implementation

Assuming that we need to support following use cases:
- Add a new wiki entry
- Edit an entry 
- View an entry
- Remove an entry
- Search for an entry by title and tags (case-insensitive) by exact match only

Also system should support all major media types (text, images, videos). The design should be flexible to allow switching between in-memory store and database store of the data. For database implementation, it should be scalable to support millions of views and thousands of add/update per day.

Our implementation is for in-memory store of the data. There are a few things to take note of:

- A wiki post body will be stored as html in a string field. It is worth mentioning that static resources like images, videos are kept in a separated folder (for example resources folder). The body only has the link to the resources.
- EntryManager is designed as an interface to ensure the flexibility of different implementations (in-memory or database or something else) of wiki post operations. The use of a Manager or Service interface is common for CRUD operations or if it does not make sense to encapsulate the methods in the data models.
- If the requirement requires other use cases, for example search posts by author, update post's tags, we may need to update EntryManager and its implementations.

4. Scaling

The challenge of this question can be in scaling the system to serve a lot of users.
In a real wiki system like wikipedia, millions of new posts are added per day and even more are viewed by public users. To create a high-resilient, high-performant system, we likely need to deploy multiple instances of the app behind load balancers. Assuming that data is stored to a database, then the same should be applied to database: multiple copies of the databases should be deployed behind load balancers. Since there are normally a lot more reads than writes, a master-slave replication can be set up with several masters for writing and many slaves for reading. To enhance data retrieval time even further, a cache like memcached or redis can be used in front of the database. Do not forget to mention about the potential issues of each component: load balancer, replication and cache as well as how to tackle them. Here are some examples.

Disadvantages of load balancers:
- Single point (or several points) of failure - Enhance with 2 or more load balancers
- Need to maintain data consistency between requests (Different requests need to hit the same server) - Tackle with session cookie in load balancers or server lookup scheme using client's IP addresss' hashes.
- Hardware solutions are costly, software solutions like nginx, haproxy needs skills to set up - Software solutions are better in general
- Imbalance of loads between servers - Round robin, Least load server lookup scheme on load balancers

Disadvantages of caching:
- Oudated data in the cache - Carefully set the time to expire to clear the cache or use write-through machenism
- Single point of failure - Use sophisticated and distributed caching system like memcached
- Take up memory so it is only limited in size - Distributed caching system

Disadvantages of replication:
- If only 1 master, there is a single point of failure - Can have 2 or more masters, or switch to master-master
- Hardware cost - Horizontal scaling can be cheaper
- Inconsistency between database instances - Implement replication failure detection, retry to make it consistent eventually
- Delay of data population - Early failure detection
- Network bandwidth required for replication - Set up number of database instances based on demand






