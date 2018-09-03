# Java8 Tutorials  
 
  
## Default Method (Defender methods)  
  
References,  [DZone](https://dzone.com/articles/interface-default-methods-java), [Journaldev](https://www.journaldev.com/2752/java-8-interface-changes-static-method-default-method), 

- _Default methods_ have introduced as a mechanism to extending `interfaces` in a backward `compatible` way.
- _Default methods_ can be provided to an _interface_ without affecting implementing `classes` as it includes an implementation
-  Java interface default methods will help us in extending interfaces without having the fear of breaking implementation classes.
- Java interface default methods has bridge down the differences between interfaces and abstract classes.
- Java 8 interface default methods will help us in avoiding utility classes, such as all the Collections class method can be provided in the interfaces itself.
- Java interface default methods will help us in removing base implementation classes, we can provide default implementation and the implementation classes can chose which one to override.
- One of the major reason for introducing default methods in interfaces is to enhance the Collections API in Java 8 to support lambda expressions.
- If any class in the hierarchy has a method with same signature, then default methods become irrelevant. A default method cannot override a method from `java.lang.Object`. The reasoning is very simple, it’s because Object is the base class for all the java classes. So even if we have Object class methods defined as default methods in interfaces, it will be useless because Object class method will always be used. That’s why to avoid confusion, we can’t have default methods that are overriding Object class methods.
- Java interface default methods are also referred to as Defender Methods or Virtual extension methods.

### Abstract classes versus interfaces in Java 8
`Abstract class` can define `constructor`. They are more structured and can have a state associated with them. While in contrast, _default method_ can be implemented only in the terms of invoking other `interface methods`, with no reference to a particular implementation's state. Hence, both are used for different purposes and choosing between two really depends on the scenario context.

### Difference Between Default Method and Regular Method

_Default Method_ is different from the regular _method_ in the sense that _default method_ comes with _default modifier_. Additionally, `methods` in `classes` can use and modify `method` `arguments` as well as the `fields` of their `class` but _default method,_ on the other hand, can only access its `arguments` as `interfaces` do not have any state.

In summary, Default methods enable to add new functionality to existing interfaces without breaking older implementation of these interfaces.

When we extend an interface that contains a default method, we can perform following,

-   Not override the default method and will inherit the default method.
-   Override the default method similar to other methods we override in subclass..
-   Redeclare default method as abstract, which force subclass to override it.

## Static Interface Method
Since _static_ methods don’t belong to a particular object, they are not part of the API of the classes implementing the interface, and they have to be **called by using the interface name preceding the method name**.
- Java interface static method is part of interface, we can’t use it for implementation class objects.
- Java interface static methods are good for providing utility methods, for example null check, collection sorting etc.
- Java interface static method helps us in providing security by not allowing implementation classes to override them.
- We can’t define interface static method for Object class methods, we will get compiler error as “This static method cannot hide the instance method from Object”. This is because it’s not allowed in java, since Object is the base class for all the classes and we can’t have one class level static method and another instance method with same signature.
- We can use java interface static methods to remove utility classes such as Collections and move all of it’s static methods to the corresponding interface, that would be easy to find and use.