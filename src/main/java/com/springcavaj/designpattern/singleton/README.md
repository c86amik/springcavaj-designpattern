# springcavaj-designpattern

# Singleton - Creational Design Pattern

## A good understanding of the usage of Singleton Design Pattern

### Steps to run the application
* After successfully importing the application.
* Right click on the class named as SingletonMasterclassApplication.java.
* Select the <strong>Run As</strong> option and <strong>Java Application</strong>.
* Application will run successfully and will produce the desired output as provided below.

### Console output
#### Eager Initialization Singleton
INFO com.springcavaj.designpattern.singleton.SingletonMasterclassApplication - Eager Initialization Singleton : 2047329716
#### Lazy Initialization Singleton (Not Thread-safe)
INFO com.springcavaj.designpattern.singleton.SingletonMasterclassApplication - Lazy Initialization Singleton (Not Thread-safe): 96639997
#### Thread-safe Singleton (Using Synchronized Method)
INFO com.springcavaj.designpattern.singleton.SingletonMasterclassApplication - Thread-safe Singleton (Using synchronized method): 128893786
#### Lazy Initialization Singleton (Double Checking)
INFO com.springcavaj.designpattern.singleton.SingletonMasterclassApplication - Efficient Thread-safe Singleton (Double Checking): 1732398722
#### Bill Pugh Singleton
INFO com.springcavaj.designpattern.singleton.SingletonMasterclassApplication - Bill Pugh Singleton (Best Practice): 1108411398