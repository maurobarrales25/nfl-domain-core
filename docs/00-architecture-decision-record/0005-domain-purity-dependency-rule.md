# ADR 005: Domain Purity and Dependency Rule.

| **Title** |  Domain Purity and Zero External Dependencies.|
| :--- | :--- |
| **Context** | The Core Domain represents the heart of the business. If I leak framework code (like Hibernate/JPA annotations) or external libraries into Entities, the domain becomes coupled to technology that might change. |
| **Decision** | The `nfl-core-domain` will have zero dependencies on external frameworks and will use only Plain Old Java Objects (POJOs) and standard Java SE libraries. |
| **Status** | `Accepted` |
| **Consequences** | **Portability:** The Core Domain is portable and can be used in different environments. **Easier Testing:** Tests don't need a Spring Context or Database. **Clarity:** The model remains clear, focused only on representing the domain entities and relationships |