jdk8-experiments
================

Personal repository for experimentation with the new JDK 8 features.

```bash
ant clean compile dist
```

I got pretty excited with Java 8, long before they even reached general availability. 
I tought myself [how to build the the JDK](https://stackoverflow.com/a/12975452/697630) 
and started playing with their new features. I was psyqued about functional programming
back then and I just couldn't wait to get may hands on their latest build. In those days
there weren't such frequent builds as they do today.

Interesting Stackoverflow Answers
---------------------------------

Since I was following the project so close back then, I managed to answer a few very interesting question in Stackoverlow.

* [Why There's Interface Pollution in Java 8](https://stackoverflow.com/a/22919112/697630)
* [Should I use Java8/Guava Optional for every method that may return null?](https://stackoverflow.com/a/18699418/697630)
* [Why are Java 8 lambdas invoked using invokedynamic?](https://stackoverflow.com/a/30002771/697630)
* [Remove Elements from a Collection while Iterating](https://stackoverflow.com/a/10432084/697630)
* [Lambdas, multiple forEach with casting](https://stackoverflow.com/a/25439912/697630)
* [How to specify function types for void (not Void) methods in Java8?](https://stackoverflow.com/a/14338333/697630)
* [Adding two Java 8 streams, or an extra element to a stream](https://stackoverflow.com/a/22741520/697630)
* [How do I use the new computeIfAbsent function?](https://stackoverflow.com/a/19283210/697630)
* [CompletableFuture in loop: How to collect all responses and handle errors](https://stackoverflow.com/a/51141370/697630)
* [Is polymorphism possible without inheritance?](https://stackoverflow.com/a/11732581/697630)
* [Why is “final” not allowed in Java 8 interface methods?](https://stackoverflow.com/a/23458190/697630)
* [Java 8: Mandatory checked exceptions handling in lambda expressions. Why mandatory, not optional?](https://stackoverflow.com/a/22689869/697630)
* [Why does Iterable<T> not provide stream() and parallelStream() methods?](https://stackoverflow.com/a/23114500/697630)
* [Java Lambdas and Closures](https://stackoverflow.com/a/11404360/697630)
* [Why doesn't Java 8's ToIntFunction<T> extend Function<T, Integer>](https://stackoverflow.com/a/22691618/697630)
* [Parallelism in Java 8](https://stackoverflow.com/a/12240520/697630)
* [Java 8 default method readability](https://stackoverflow.com/a/28138026/697630)
* [Java 8 dancing around functions as first class citizens?](https://stackoverflow.com/a/22667201/697630)
* [Why does Guava's Optional use abstract classes when Java 8's uses nulls?](https://stackoverflow.com/a/22997374/697630)
* [Why an Anonymous class can't implement multiple interfaces directly?](https://stackoverflow.com/a/15367380/697630)

And many more...

Reference Material
-----------------

During this time I put up a list of interesting links and reference material which I also contributed in the [java-8](https://stackoverflow.com/edit-tag-wiki/69385) tag in Stackoverflow.

 * [What's New in JDK 8](http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html)
 * [Java 8 Launch](http://www.oracle.com/events/us/en/java8/index.html)
 * **Project Lambda**
   * [Official Site](http://openjdk.java.net/projects/lambda/)
   * [State of Lambda](http://cr.openjdk.java.net/~briangoetz/lambda/lambda-state-final.html)
   * [State of Lambda: Libraries Edition](http://cr.openjdk.java.net/~briangoetz/lambda/lambda-libraries-final.html)
   * [Translation of Lambda Expressions](http://cr.openjdk.java.net/~briangoetz/lambda/lambda-translation.html)
   * [From Lambdas to Bytecode](http://medianetwork.oracle.com/video/player/1113272510001)
   * [Lambda: A Peek Under the Hood](http://www.infoq.com/presentations/lambda-invokedynamic?utm_campaign=infoq_content&utm_source=infoq&utm_medium=feed&utm_term=global)
   * [Evolving Java](http://www.infoq.com/presentations/java8-evolution?utm_campaign=infoq_content&utm_source=infoq&utm_medium=feed&utm_term=global)
   * [Maurice Naftalin's Lambda FAQ](http://www.lambdafaq.org/)
   * [Java Tutorials](http://docs.oracle.com/javase/8/docs/technotes/guides/language/enhancements.html#javase8)
   * [JSR 335: Lambda Expressions for Java Programming Language](https://jcp.org/aboutJava/communityprocess/edr/jsr335/index3.html)
   * [JLS: Lambda Expressions](http://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.27)
   * **Historic References**
     * [Lambda Straw-Man Proposal](http://cr.openjdk.java.net/~mr/lambda/straw-man/)
     * [Closures for Java](https://blogs.oracle.com/mr/entry/closures)
     * [Closures Q&A](http://mreinhold.org/blog/closures-qa)
     * [A Discussion With Neal Gafter on the Future of Java](http://www.infoq.com/articles/neal-gafter-on-java)
 * **Date/Time API**
   * [JSR 310: Date and Time API](https://jcp.org/en/jsr/detail?id=310)
   * [ThreeTen Home Page](http://www.threeten.org/index.html)
   * [ThreeTen at Github](https://github.com/ThreeTen/threeten)
   * [Articles and Videos](http://www.threeten.org/links.html)
   * [Why JSR-310 isn't Joda Time](http://blog.joda.org/2009/11/why-jsr-310-isn-joda-time_4941.html)
   * [Stephen Colebourne's Blog Posts on JSR-310](http://blog.joda.org/search/label/jsr310)
   * [Java Tutorial on Date/Time API](http://docs.oracle.com/javase/tutorial/datetime/index.html)
 * **Nashorn**
   * [Nashorn User's Guide](http://docs.oracle.com/javase/8/docs/technotes/guides/scripting/nashorn/)
   * [Oracle Nashorn Blog](https://blogs.oracle.com/nashorn/)
   * [JVMLS 2013: Fitting Nashorn on the JVM](http://medianetwork.oracle.com/video/player/2623645004001)
   * [JVMLS 2013: Nashorn War Stories](http://medianetwork.oracle.com/video/player/2630340183001)
   * [Nashorn Tutorial](http://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/)
   * [Running Node.js Applications on the JVM with Nashorn](http://blog.jonasbandi.net/2014/03/running-nodejs-applications-on-jvm-with.html)
   * [Project Avatar](https://avatar.java.net/index.html)
 * **Others**
   * [Curated List of Blog Posts on Java 8](http://www.baeldung.com/java8)
 * **Books**
   * [Java 8 in Action](http://www.manning.com/urma/)
   * [Java 8 Lambdas](http://shop.oreilly.com/product/0636920030713.do)
   * [Functional Programming in Java: Harnessing the Power of Java 8 Lambda Expressions](https://pragprog.com/book/vsjava8/functional-programming-in-java)


