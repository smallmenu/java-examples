#!/bin/bash

# Java 11 可以直接使用 `java` 运行单个 `.java` 文件
java HelloWorld.java
## Hello World

# `Javac` 可以将 `.java` 源码编译成 `.class` 字节码
javac HelloWorld.java
ls
## HelloWorld.class HelloWorld.java

# `java` 可以运行一个已编译的 Java 程序，因为我们源码中使用了包 `package`
# 所以需要到源码根目录，使用完整的 `包名路径` 来运行
# `java` 会自动查找 `.class` 文件并执行
cd ../../
pwd
## ~/java-examples/src

java example.helloworld.HelloWorld
## Hello World

