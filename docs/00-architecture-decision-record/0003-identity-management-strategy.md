# ADR 0003 - Identity Management Strategy

| **Title** |  Use of Strongly Typed UUIDs for Entity Identification.|
| :--- | :--- |
| **Context** | Entities like `Person` or `Team` need unique identifiers. Using primitive types (like String or Long) leads to bugs where different IDs can be accidentally swapped. |
| **Decision** | I will use UUID v4 encapsulated in Strongly Typed Value Objects (for example, `PersonId`). These classes will be final and immutable, using a Private Constructor and a Static Factory Method. |
| **Status** | `Accepted` |
| **Consequences** | Compile-time type safety prevents ID swapping. Increases code expressiveness and aligns with Domain-Driven Design (DDD). Supports serialization to JSON or other formats for cross-platform integration. |
