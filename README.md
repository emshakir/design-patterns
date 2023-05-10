
# DESIGN PRINCIPLES

1. Identify the aspects of your application that vary and separate them from\
   what stays the same.
2. Program to an interface, not an implementation.
3. Favor composition over inheritance.
4. Strive for loosely coupled designs between objects that interact.

# DESIGN PATTERNS

## Strategy Pattern

> The **Strategy Pattern** defines a family of algorithms, encapsulates each
> one, and makes them interchangeable. Strategy lets the algorithm vary
> independently from clients that use it.

* Take what varies and **encapsulate** it so it won’t affect the rest of your code.
* Fewer unintended consequences from code changes and more flexibility in your
  systems.

In other words, if you’ve got some aspect of your code that is changing, say
with every new requirement, then you know you’ve got a behavior that needs
to be pulled out and separated from all the stuff that doesn’t change.

## Observer Pattern

### You know how newspaper or magazine subscriptions work:

1. A newspaper publisher goes into business and begins publishing
   newspapers.
2. You subscribe to a particular publisher, and every time there’s a new
   edition it gets delivered to you. As long as you remain a subscriber, you
   get new newspapers.   
3. You unsubscribe when you don’t want papers anymore, and they stop
   being delivered.
4. While the publisher remains in business, people, hotels, airlines, and
   other businesses constantly subscribe and unsubscribe to the newspaper.

> Publishers + Subscribers = Observer Pattern

When you’re trying to picture the Observer Pattern, a newspaper subscription
service with its publisher and subscribers is a good way to visualize the
pattern. 

> 
> The **Observer Pattern** defines a one-to-many dependency between objects 
> so that when one object changes state, all of its dependents 
> are notified and updated automatically.
> 

The subject and observers define the one-to-many relationship. The observers
are dependent on the subject such that when the subject’s state changes, the
observers get notified. Depending on the style of notification, the observer
may also be updated with new values.
