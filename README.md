# Java threads Review
It is likely that from now on, most of the increase in computing power will come from adding additional processors to computers rather than from increasing the speed of individual processor.

## Pinpoints
* The purpose of a java.lang.Thread object is to execute a single method and execute it just once.
* When the execution of thread's method is finished, either because the method terminates normally or because of an uncaught exception, the thread stops running. Once it happens, there is no way to restart the thread or to use the same Thread object to start another thread.


### Two ways to program a thread
1. to create a subclass of Thread and to define the public void run() in the subclass.
   * This run() method defines the task that will be performed by the thread; that is, when the thread is started, it is the run() method that will be executed in the thread.
   * Example: [Child class of Thread](src/NamedThread.java) 
2. to define a class that implements the interface java.lang.Runnable.
   * To use this version of the class, we would create a NamedRunnable object and use that object to create an object of type Thread. 
   * Example:[Interface implementation](src/NamedRunnable.java)
   * Advantage:
     * any object can implement the Runnable interface and can contain a run() method, which can then be executed in a separate thread. 
     * The run() method has access to everything in that class, including private variables and methods. 
   * Disadvantage:
     * Not very object-oriented: it violates the principle that each object should have a single, clearly-defined responsibility.

### Operations on Threads
[Threads operations](src/ThreadsOps.java)

* Runtime
  * allows a Java program to get information about the environment in which it is running. 
* Others:
  * obj.isAlive() returns boolean.
  * Thread.sleep(milliseconds)
    * the thread is still alive. 
    * InterruptedException can happen. 
  * obj.interrupt() 
  * Thread.interrupted()
    * static method
    * A thread can check whether it has been interrupted.
  * obj.join()
    * one thread waits for another thread to die. 
  * obj.join(Nbr)
    * A call to obj.join(Nbr) will wait until either obj has terminated or until Nbr milliseconds has elapsed or until the waiting thread is interrupted.
* Two thread properties:
  1. a daemon status
  2. a priority
     * Every thread has a priority, specified as an integer. 
     * A thread with greater priority value will be run in preference to a thread with a smaller priority. 

### Mutual exclusion
To avoid race condition, synchronized methods/statements is used for mutual exclusion of shared resources.
* A method is declared to be synchronized by adding the reserved word "synchronized" as a modifier to the definition of the method.
  * e.g. synchronized public void increment { ... }
* Putting code into a "synchronized" statement. 
  * e.g. synchronized(<object>) { <statements> }
* Synchronization lock might lead to deadlock.
* synchronization is fairly expensive computationally, and excessive use of it should be avoided.

### Volatile variable
    private volatile int count;
If a variable is declared to be volatile, no thread will keep a copy of that variable in its cache. Instead, the thread will always use the official, main copy of the variable.
* Access to volatile variables is less efficient than access to non-volatile variables, but more efficient than using synchronization.
* Race condition is not solved.

### Atomic variable
* An atomic operation is something that cannot be interrupted. It's an all-or-nothing affair.
* Using an atomic variable does not automatically solve all race conditions involving that variable.

