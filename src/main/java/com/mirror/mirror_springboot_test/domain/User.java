package com.mirror.mirror_springboot_test.domain;

import lombok.Data;

/**
 * Lombok项目是一个Java库，它会自动插入编辑器和构建工具中，Lombok提供了一组有用的注释，
 * 用来消除Java类中的大量样板代码。仅五个字符(@Data)就可以替换数百行代码从而产生干净，简洁且易于维护的Java类。
 *
 * “Boilerplate”是一个术语，用于描述在应用程序的许多部分中很少改动就重复的代码。对Java语言最常见的批评就是在大多数项目中都可以找到这种类型的代码，由于语言本身的局限性而更加严重。龙目岛计划（Project Lombok）旨在通过用简单的注释集代替众多的代码。
 * Lombok也存在一定风险，在一些开发工具商店中没有Project Lombok支持选择。 IDE和JDK升级存在破裂的风险，并且围绕项目的目标和实施存在争议。
 * 常用注解：
 * @Setter ：注解在类或字段，注解在类时为所有字段生成setter方法，注解在字段上时只为该字段生成setter方法。
 * @Getter ：使用方法同上，区别在于生成的是getter方法。
 * @ToString ：注解在类，添加toString方法。
 * @EqualsAndHashCode： 注解在类，生成hashCode和equals方法。
 * @NoArgsConstructor： 注解在类，生成无参的构造方法。
 * @RequiredArgsConstructor： 注解在类，为类中需要特殊处理的字段生成构造方法，比如final和被@NonNull注解的字段。
 * @AllArgsConstructor： 注解在类，生成包含类中所有字段的构造方法。
 * @Data： 注解在类，生成setter/getter、equals、canEqual、hashCode、toString方法，如为final属性，则不会为该属性生成setter方法。
 * @Slf4j： 注解在类，生成log变量，严格意义来说是常量。
 */
@Data
public class User {

    private Integer uid;
    private String username;
    private String password;
    private Integer age;
    private String sex;
}
