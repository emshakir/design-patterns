
# BULLET POINTS

- The Observer Pattern defines a one-to-many relationship between objects.

- Subjects, or as we also know them, Observables, update Observers using 
  a common interface.

- Observers are loosely coupled in that the Observable knows nothing about them,  
  other than that they implement the Observer interface.

- You can push or pull data from the Observable when using the pattern 
  (pull is considered more “correct”).

- Don’t depend on a specific order of notification for your Observers.

- Java has several implementations of the Observer Pattern, including the
  general purposjava.util.Observable.

- Watch out for issues with the java.util.Observable implementation.

- Don’t be afraid to create your own Observable implementation if needed.

## The dark side of java.util.Observable

### java.util.Observable violate our OO design principle,

> Programming to interface not implementation

Observable is a class, not an interface,and worse, it doesn’t even implement 
an interface. Unfortunately, the java.util.Observable implementation has a 
number of problems that limit its usefulness and reuse. That’s not to say it 
doesn’t provide some utility, but there are some large potholes to watch out for.


- Observable is a class, you have to subclass it. That means you can’t add on 
  the Observable behavior to an existing class that already extends another 
  superclass.

- In Observable API, the setChanged() method is protected. So
  what? Well, this means you can’t call setChanged() unless you’ve subclassed
  Observable. This means you can’t even create an instance of the Observable
  class and compose it with your own objects, you have to subclass. The design
  violates a second design principle here...

> favor composition over inheritance