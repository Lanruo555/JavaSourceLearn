## 一、阅读源码方法

**1、方法一：按需阅读**

如果对某个组件、语法或者特性感兴趣，或者遇到什么问题疑惑，可以有针对性地跟到底层源码按需查看，这也是一种比较高效，能快速树立信心的阅读方式。



**2、方法二：系统化阅读**

具体阅读内容和顺序建议下文详述。



**3、多调试**

如果仅仅靠眼睛看，然后脑补画面调试还是比较吃力的，最好还是借助IDE动手调试起来，走两步就知道了。



**4、总结做笔记、写注释**

看了多少不重要，重要的是能输出多少，多总结、归纳，写注释，记笔记





## 二、源码结构和阅读顺序

**1、`java.lang`**

这里面其实就是Java的基本语法，比如各种基本包装类型（`Integer`、`Long`、`Double`等）、基本类（`Object`，`Class`，`Enum`，`Exception`，`Thread`）等等...



**2、`java.lang.annotation`**

包含Java注解基本元素相关的源码



**3、`java.lang.reflect`**

包含Java反射基本元素相关的代码



**4、`java.util`**

这里面放的都是Java的基本工具，最典型和常用的就是各种容器和集合（`List`、`Map`、`Set`）



**5、`java.util.concurrent`**

大名鼎鼎的JUC包，里面包含了Java并发和多线程编程相关的代码



**6、`java.util.function` +`java.util.stream`**

包含Java函数式编程的常见接口和代码



**7、`java.io`**

包含Java传统I/O相关的源码，主要是面向字节和流的I/O



**8、`java.nio`**

包含Java非阻塞I/O相关的源码，主要是面向缓冲、通道以及选择器的I/O



**9、`java.time`**

包含Java新日期和期间相关的代码，最典型的当属`LocalDateTime`、`DateTimeFormatter`等



**10、`java.math`**

主要包含一些高精度运算的支持数据类



**11、`java.net`**

主要包含Java网络通信（典型的如：`Socket`通信）相关的源代码。
