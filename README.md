# Spring Core Practice Repository

This repository contains hands-on Spring Framework practice projects designed to help you learn and apply Spring Core concepts. Each module demonstrates a different part of Spring's dependency injection, bean configuration, lifecycle, and wiring mechanisms.

## Repository Overview

- `SpringSetup/` - Basic Spring project setup with XML configuration and a simple application structure.
- `BeanConfigApplication/` - Demonstrates bean definition using XML configuration and loading beans from `FirstBean.xml`.
- `ObjectDependencies/` - Shows object dependency injection using XML-based bean wiring.
- `Constructor-Dependecies-Application/` - Demonstrates constructor injection for required dependencies.
- `CollectionDependecies/` - Demonstrates collection-based dependency injection using lists and sets.
- `MapDependecies/` - Demonstrates map-based dependency injection with XML configuration.
- `AutowireDepenedcies/` - Demonstrates autowiring by type and by name using Spring's autowire support.
- `AnnotationBeanConfiguration/` - Demonstrates annotation-based bean configuration using `@Configuration` and `@Bean`.
- `BeanScope/` - Demonstrates bean scope concepts such as singleton and prototype.
- `BeanLifeCycle/` - Demonstrates Spring bean lifecycle callbacks using XML configuration, interfaces, and annotations.
- `LookupAnnotation/` - Demonstrates method injection and lookup method replacement using `@Lookup`.

## Learning Goals

This repository is intended to help you:

- Understand the core principles of the Spring Framework.
- Learn how Spring manages bean creation and dependency injection.
- Compare XML-based configuration with annotation-based configuration.
- Explore bean scopes and lifecycle callbacks.
- Practice common Spring wiring patterns used in real-world applications.

## Understanding XML vs Annotation Configuration

Spring supports two main configuration approaches used by the projects in this repository:

- XML configuration
  - Beans and dependencies are declared in XML files such as `Test.xml`, `FirstBean.xml`, and `Config.xml`.
  - This style is helpful for learning how Spring resolves bean references and handles injection using `<bean>`, `<property>`, `<constructor-arg>`, and collection elements.

- Annotation-based configuration
  - Uses annotations like `@Configuration`, `@Bean`, `@Autowired`, and `@Lookup` inside Java classes.
  - This approach is more common in modern Spring applications and makes the configuration more concise.

Use the XML projects to learn the classic Spring setup, then compare them with annotation-based examples to understand how Spring configuration evolved.

## Recommended Learning Path

1. Start with `SpringSetup/` to understand how a Spring application is configured and bootstrapped.
2. Explore `BeanConfigApplication/` to learn basic XML bean definitions.
3. Practice dependency injection through:
   - `ObjectDependencies/`
   - `Constructor-Dependecies-Application/`
   - `CollectionDependecies/`
   - `MapDependecies/`
4. Study autowiring with `AutowireDepenedcies/`.
5. Learn annotation-driven configuration in `AnnotationBeanConfiguration/`.
6. Explore bean lifecycle and scope with `BeanLifeCycle/` and `BeanScope/`.
7. Understand method injection patterns in `LookupAnnotation/`.

## Documentation

Detailed documentation for this repository is available in `docs/README.md`.

## How to Run the Projects

Each project is a Maven module. From the project folder, use:

```bash
mvn clean compile exec:java
```

If the project does not include an `exec` configuration, you can use your IDE to run the main application class directly.

## Applying These Concepts in Your Projects

The concepts practiced here are the foundation for building larger Spring applications:

- Use XML or annotation configuration to define beans and dependencies.
- Apply constructor injection for required collaborators and setter injection for optional values.
- Choose bean scopes carefully: singleton for shared services, prototype for stateful objects.
- Use lifecycle callbacks to initialize or clean up resources.
- Use autowiring or explicit wiring depending on clarity and maintainability.

## Next Topics to Learn

Once you are comfortable with Spring Core, continue your learning with these Spring technologies:

- **Spring Boot** - Rapid application development, auto-configuration, and embedded servers.
- **Spring JDBC** - Simplified JDBC access using `JdbcTemplate` and database interaction.
- **Spring AOP** - Aspect-oriented programming for cross-cutting concerns like logging, transactions, and security.
- **Spring Security** - Authentication, authorization, and securing web and method access.
- **Spring ORM** - Integration with JPA/Hibernate for object-relational mapping.
- **Spring MVC** - Building web applications with controllers, views, and REST APIs.

## Tips for Progress

- Keep practicing by converting XML configurations to annotation-based configuration.
- Build small sample projects focused on one feature at a time.
- Read official Spring documentation for each module once you understand the basics.
- Combine Spring Core knowledge with Spring Boot to simplify configuration and deployment.

## Notes

This repository is focused on Spring Core fundamentals. The advanced modules listed above are not implemented here yet, but the core patterns learned in these projects will make it easier to understand them later.
