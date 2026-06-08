# Spring Core Repository Documentation

This documentation explains the purpose, structure, and usage of the Spring Core practice repository.

## Purpose

This repository is a learning workspace for Spring Framework core concepts. It contains small, focused Maven projects that demonstrate how Spring manages beans, dependency injection, lifecycle, configuration styles, and wiring patterns.

The code is intended to help you:

- Learn Spring Core fundamentals through practice.
- Compare XML configuration with annotation-based configuration.
- Understand bean scopes and lifecycle callbacks.
- Practice dependency injection patterns with simple examples.
- Prepare for more advanced Spring modules such as Spring Boot, Spring MVC, Spring Security, Spring AOP, Spring JDBC, and Spring ORM.

## Understanding XML vs Annotation Configuration

Spring supports two primary configuration styles used in this repository:

- XML configuration:
  - Defines beans and dependencies in XML files such as `Test.xml`, `FirstBean.xml`, and `Config.xml`.
  - Good for clearly separating configuration from Java code.
  - Useful for learning how Spring resolves bean references, property injection, collections, maps, constructor arguments, and lifecycle callbacks.

- Annotation-based configuration:
  - Uses Java annotations like `@Configuration`, `@Bean`, `@Autowired`, and `@Lookup`.
  - Keeps configuration closer to the code and simplifies setup.
  - Useful for modern Spring applications and Spring Boot projects.

This repository includes examples of both styles so you can compare their structure, readability, and usage.

## Repository Structure

Each folder in the repository is an independent Maven project. The main modules are:

- `SpringSetup/`
  - Basic Spring application setup.
  - XML configuration file: `Test.xml`.
  - Good starting point to learn how a Spring context is created and loaded.

- `BeanConfigApplication/`
  - Demonstrates bean declaration using XML.
  - Shows how to load beans from `FirstBean.xml`.

- `ObjectDependencies/`
  - Demonstrates object dependency injection.
  - Uses XML-based bean wiring to wire dependent objects.

- `Constructor-Dependecies-Application/`
  - Demonstrates constructor injection.
  - Shows how Spring injects required dependencies through constructors.

- `CollectionDependecies/`
  - Demonstrates collection injection.
  - Uses lists, sets, and other collection types in bean properties.

- `MapDependecies/`
  - Demonstrates map injection.
  - Shows how Spring can inject map values into beans.

- `AutowireDepenedcies/`
  - Demonstrates autowiring using `byName` and `byType`.
  - Contains examples for automatic dependency resolution.

- `AnnotationBeanConfiguration/`
  - Demonstrates annotation-driven configuration.
  - Uses `@Configuration` and `@Bean` to define beans in Java.

- `BeanScope/`
  - Demonstrates Spring bean scopes such as singleton and prototype.
  - Shows how different scopes affect bean lifecycle and instance creation.

- `BeanLifeCycle/`
  - Demonstrates Spring bean lifecycle callbacks.
  - Includes examples using XML callbacks, `InitializingBean`/`DisposableBean`, and annotation-based lifecycle methods.

- `LookupAnnotation/`
  - Demonstrates method injection and lookup method replacement.
  - Uses `@Lookup` to inject prototype beans into singleton-scoped objects.

## How to Use the Projects

### From the command line

From the root folder, run a module with Maven:

```bash
cd "d:/Tech Hub/Spring Core/<module>"
mvn clean compile
```

If the module includes a start class and `exec-maven-plugin` configuration, you can also run:

```bash
mvn exec:java
```

### In an IDE

Import the folder as a Maven project in your IDE (Eclipse, IntelliJ IDEA, VS Code with Maven support). Then run the main class from the `src/main/java` package.

## Recommended Learning Flow

1. Start with `SpringSetup/` to understand Spring container initialization.
2. Move to `BeanConfigApplication/` for basic XML bean configuration.
3. Practice dependency injection patterns in:
   - `ObjectDependencies/`
   - `Constructor-Dependecies-Application/`
   - `CollectionDependecies/`
   - `MapDependecies/`
4. Study autowiring in `AutowireDepenedcies/`.
5. Learn annotation-based configuration in `AnnotationBeanConfiguration/`.
6. Explore bean scoping in `BeanScope/`.
7. Understand lifecycle hooks in `BeanLifeCycle/`.
8. Review method injection in `LookupAnnotation/`.

## Applying This Knowledge in Projects

Use these core concepts when building Spring applications:

- Define beans and dependencies clearly, using XML or annotations consistently.
- Prefer constructor injection for required dependencies.
- Use setter or field injection when values are optional.
- Choose the correct scope: singleton for shared services, prototype for stateful objects.
- Leverage lifecycle callbacks for initialization and cleanup.
- Use autowiring when it makes the configuration simpler and still readable.

## Next Topics to Learn

After mastering Spring Core, continue with:

- **Spring Boot** - simplifies configuration and dependency management.
- **Spring MVC** - builds web applications and REST APIs.
- **Spring Security** - secures applications with authentication and authorization.
- **Spring AOP** - separates cross-cutting concerns like logging and transactions.
- **Spring JDBC** - simplifies database access.
- **Spring ORM** - integrates JPA/Hibernate with Spring.

## Notes

This repository is designed as a practice guide for Spring Core fundamentals. It does not yet contain advanced Spring Boot or Spring web framework modules, but the patterns here provide the foundation for those next steps.
