## workflow

```mermaid
sequenceDiagram
    participant Browser
    participant Server
    Browser->>Server: Get request
    Server->>Filter: 
    Filter->>Controller: 
    Controller-->>Controller: validate
    Controller-->>Controller: business logic
    Controller-->>Controller: render
    Controller-->>Browser: 
```