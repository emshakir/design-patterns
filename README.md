
# SYSTEM DESIGN PRINCIPLES

1. Identify the aspects of your application that vary and separate them from\
   what stays the same.
2. Program to an interface, not an implementation.

## Strategy Pattern

* Take what varies and **encapsulate** it so it won’t affect the rest of your code.
* Fewer unintended consequences from code changes and more flexibility in your
  systems.

In other words, if you’ve got some aspect of your code that is changing, say
with every new requirement, then you know you’ve got a behavior that needs
to be pulled out and separated from all the stuff that doesn’t change.
