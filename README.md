# design-questions
Object-Oriented and System Design Question Analysis and Implementation.

This repo to give analysis and detailed implementations for some of the sample design questions in Java.

## Steps

From my experience, the steps to follow when you are asked a design question are:

1. Ask questions to clarify about the requirements. The few things that you probably want to be clear about are:

- What are the use cases that are suppported?
- How many users the system is going to support? (especially for system design question)
- Definitions and terms that are clear

2. Come up with list of entities

The rule of thumbs to remember is that trying to map to real-life objects as much as possible. For this steps, just list down the entities first without the properties and methods. Make this step quick.

3. Add properties and methods to entitites

To save time, you probably want to ignore trivial like contructors or getters and setters. Also try to to come up correct relationships betweem entities, either one-to-one, one-to-many or many-to-many. Many-to-Many relationship is normally modeled with an immediate entity class. Again make this step quick.

4. Refine the design with abstraction, interface or design patterns.

Make sure that you know the differences between abstract class and interface and also know when you make use of common design patterns like Factory, Singleton, Builder, Strategy. Remember to clarify why you use abstract class, interface or a design pattern.

5. Scaling

Now this is when you apply your knowlege about cache, load balancer, database replication, partitioning and sharding to make sure that the system can handle 
high traffic. That's why the question about the number of users at the beginning.
Draw the diagram on the paper, board or on the page. Do not forget to mention about the pros and cons of your design.



