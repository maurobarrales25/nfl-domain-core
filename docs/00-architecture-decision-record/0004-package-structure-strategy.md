# ADR 004 - Package Structure Strategy

| **Title** |  Package by Feature and Domain Segregation.|
| :--- | :--- |
| **Context** | As the NFL domain grows, a layered structure (for example, `com.mauro.nfl.entities`) becomes cluttered and hard to navigate. I need a structure that reflects business modules and minimizes coupling between different domain concepts. |
| **Decision** |  Organize the project by Feature/Domain Module. Each package (for example, `player`, `team`) will contain all its internal domain logic (Entities, Value Objects). Introduce a `shared` package only for truly common patterns and Value Objects. | |
| **Status** | `Accepted` |
| **Consequences** | **High Cohesion:** Related classes stay together. **Low Coupling:** Changes in team are less likely to affect player. **Future Scalability:** The modular structure makes it easier to extend the project or split packages if more complex deployments (like microservices) are needed in the future, without changing the current desktop architecture.