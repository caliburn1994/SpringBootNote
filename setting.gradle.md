

## 文档

1. [gradle 文档](https://docs.gradle.org/current/dsl/org.gradle.api.initialization.Settings.html)
2. 源代码

## 简介

> Declares the configuration required to instantiate and configure the hierarchy of [`Project`](https://docs.gradle.org/current/dsl/org.gradle.api.Project.html) instances which are to participate in a build.
>
> There is a one-to-one correspondence between a `Settings` instance and a `settings.gradle` settings file. Before Gradle assembles the projects for a build, it creates a `Settings` instance and executes the settings file against it.

告诉 configuration 需要去初始化并配置 [`Project`](https://docs.gradle.org/current/dsl/org.gradle.api.Project.html) 结构层次实例，并让这些实例参与到<u>构建</u><sup>build</sup>中。

`Settings` 实例和 `settings.gradle` 是一一对应的。在 Gradle 组合起用于构建的所有项目之前，Gradle 会先创建  `Settings` 实例，紧跟其后就是执行这些设置文件。

## Assembling a Multi-Project Build

> One of the purposes of the `Settings` object is to allow you to declare the projects which are to be included in the build. You add projects to the build using the [`Settings.include(java.lang.String[])`](https://docs.gradle.org/current/dsl/org.gradle.api.initialization.Settings.html#org.gradle.api.initialization.Settings:include(java.lang.String[])) method. There is always a root project included in a build. It is added automatically when the `Settings` object is created. The root project's name defaults to the name of the directory containing the settings file. The root project's project directory defaults to the directory containing the settings file.

`Settings` 对象的一个目的，是让你可以声明构建<u>所需要</u><sup> included</sup>的项目。通过

```groovy
Settings.include(java.lang.String[])
```

方法对所需要的项目进行添加。当创建 `Settings` 对象时，所添加的项目将自动被添加进来。根项目的项目目录默认为包含 settings file 的目录。

> When a project is included in the build, a [`ProjectDescriptor`](https://docs.gradle.org/current/javadoc/org/gradle/api/initialization/ProjectDescriptor.html) is created. You can use this descriptor to change the default values for several properties of the project.

当一个项目被添加进构建时，一个 [`ProjectDescriptor`](https://docs.gradle.org/current/javadoc/org/gradle/api/initialization/ProjectDescriptor.html) 将会被创建。你可以使用这个 descriptor 去修改这个项目中的默认值。

## Using Settings in a Settings File

### Dynamic Properties

> In addition to the properties of this interface, the `Settings` object makes some additional read-only properties available to the settings script. This includes properties from the following sources:
>
> - Defined in the `gradle.properties` file located in the settings directory of the build.
> - Defined the `gradle.properties` file located in the user's `.gradle` directory.
> - Provided on the command-line using the -P option.

除了接口的属性值以外， `Settings` 对象中还有一些值是对于 settings script <u>仅可读</u>，包含以下来源：

- settings directory of the build 里的  `gradle.properties`
- user's `.gradle` directory 的  `gradle.properties`
- 命令行的  -P 选项



