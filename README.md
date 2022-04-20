# Java threads Review
It is likely that from now on, most of the increase in computing power will come from adding additional processors to computers rather than from increasing the speed of individual processor.

## Pinpoints
* The purpose of a java.lang.Thread object is to execute a single method and execute it just once.
* When the execution of thread's method is finished, either because the method terminates normally or because of an uncaught exception, the thread stops running. Once it happens, there is no way to restart the thread or to use the same Thread object to start another thread.

### Two ways to program a thread
1. to create a subclass of Thread and to define the public void run() in the subclass.
   ..* This run() method defines the task that will be performed by the thread; that is, when the thread is started, it is the run() method that will be executed in the thread.
2. 
