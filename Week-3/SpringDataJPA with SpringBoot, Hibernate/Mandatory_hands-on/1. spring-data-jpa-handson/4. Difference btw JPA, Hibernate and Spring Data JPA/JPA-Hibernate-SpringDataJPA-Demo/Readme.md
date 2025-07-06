#  Difference between JPA, Hibernate, and Spring Data JPA

This document outlines the differences between **JPA**, **Hibernate**, and **Spring Data JPA**, which are key components in Java's persistence layer when building Spring Boot applications.

---

## Comparison Table

| Feature / Aspect          | **JPA**                                               | **Hibernate**                                         | **Spring Data JPA**                                       |
|---------------------------|--------------------------------------------------------|--------------------------------------------------------|------------------------------------------------------------|
| **Type**                  | Specification                                          | Implementation of JPA                                  | Abstraction layer over JPA                                 |
| **Developed By**          | Oracle (Java EE / Jakarta EE)                         | Red Hat                                                | Spring Framework Team                                      |
| **Purpose**               | Defines ORM standard APIs                             | Provides actual ORM functionality                      | Simplifies data access using repositories                  |
| **Boilerplate Code**      | Requires manual implementation                        | Requires configuration and setup                       | Reduces boilerplate using `JpaRepository`, etc.            |
| **Query Language**        | JPQL (Java Persistence Query Language)                | HQL + JPQL + Criteria API                              | Derived queries, JPQL, Native SQL                          |
| **Configuration**         | Needs JPA provider setup                              | Requires Hibernate-specific config                     | Minimal config with Spring Boot                            |
| **Features**              | Only standard annotations                             | Caching, Lazy loading, Dirty checking, etc.            | Auto-generated queries, paging, sorting, auditing          |
| **Ease of Use**           | Basic ORM layer                                       | Intermediate                                           | Very developer-friendly, minimal code                      |

---

## Summary

- **JPA** is the standard/specification for object-relational mapping in Java.
- **Hibernate** is a widely used implementation of the JPA specification.
- **Spring Data JPA** builds on JPA and Hibernate to offer powerful repository-based data access with minimal coding.

---

> 📁 Location:  
> `SpringDataJPA_with_SpringBoot_Hibernate/1. spring-data-jpa-handson/4. Difference btw JPA, Hibernate and Spring Data JPA`

