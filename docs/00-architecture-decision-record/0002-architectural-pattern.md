# ADR 0002 - Architectural Pattern

| **Title** |  Adoption of Domain-Driven Design (DDD).|
| :--- | :--- |
| **Context** | The NFL domain involves entities like players, teams, coaches, etc. Without a clear structure, the domain model could become messy and hard to maintain. |
| **Decision** | Follow DDD principles by keeping the Core Domain isolated from UI and persistence concerns. The Core Domain will contain only Entities, Value Objects, and relationships between them. UI or persistence logic will remain outside the Core Domain. |
| **Status** | `Accepted` |
| **Consequences** | The Core Domain provides a clear representation of the NFL domain, making the code easier to understand and maintain. Even in a desktop-only app, this separation ensures that the model can evolve independently and remain portable if I expand to web or online versions. |