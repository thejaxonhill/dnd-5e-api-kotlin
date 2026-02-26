# 🐉 DnD 5e API Kotlin 🛡️

[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![GraphQL](https://img.shields.io/badge/GraphQL-E10098?style=for-the-badge&logo=graphql&logoColor=white)](https://graphql.org/)
[![MCP](https://img.shields.io/badge/MCP-Blue?style=for-the-badge&logo=ai&logoColor=white)](https://modelcontextprotocol.io/)

A high-performance Web API for the Dungeons & Dragons 5th Edition System Reference Document (SRD). This service provides programmatic access to D&D rules, entities, and mechanics, facilitating the development of character builders, virtual tabletops, and AI-integrated applications.

---

## 🚀 Delivery Methods

This project provides multiple interfaces for interacting with Dungeons & Dragons 5e data:

### 🌐 REST API
Industry-standard RESTful endpoints for all core entities.
- **Base URL:** `/api`
- **Swagger UI:** Accessible at `/swagger-ui/index.html` for comprehensive API documentation.

### 📊 GraphQL
An optimized data-fetching layer allowing clients to request specific data structures.
- **Endpoint:** `/graphql`
- **GraphiQL:** Integrated explorer available at `/graphiql` for interactive querying.

### 🤖 Model Context Protocol (MCP)
An AI-native integration protocol enabling Large Language Models (LLMs) to dynamically access D&D rules and entities as tools.
- **SSE Endpoint:** `/mcp/messages`

---

## 🛠️ Technologies & Frameworks

- **[Kotlin](https://kotlinlang.org/)**: A modern, concise, and safe programming language, ensuring high performance and developer productivity.
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**: A robust framework for building production-ready, enterprise-grade Java/Kotlin applications with minimal configuration.
- **[MongoDB](https://www.mongodb.com/)**: A high-performance, document-oriented NoSQL database, offering the flexibility required for complex D&D data structures.
- **[Spring AI MCP](https://github.com/spring-projects/spring-ai)**: Advanced integration for the Model Context Protocol, enabling seamless communication between the API and Large Language Models (LLMs).
- **[Spring GraphQL](https://spring.io/projects/spring-graphql)**: Provides a flexible and efficient data-fetching layer, reducing over-fetching and optimizing client-side performance.

---

## 📦 Prerequisites

1.  **Set up MongoDB**
    The API expects a MongoDB instance populated with the 5e SRD data.
    - Follow the steps in the [5e Bits 5e Database GitHub](https://github.com/5e-bits/5e-database) to run the database as a Docker container or initialize a local database.
    - Default connection: `mongodb://localhost:27017/5e-database` (configurable in `application.yml`).

---

## 🏃 Run Server

Start the application using the following Maven command:

```bash 
mvn spring-boot:run
```

Alternatively, the application can be launched directly within **IntelliJ IDEA** by executing the main class.

---

## 🗺️ Roadmap / Features
- ✅ Ability Scores, Alignments, Backgrounds
- ✅ Classes, Subclasses, Races, Subraces
- ✅ Spells, Magic Items, Equipment
- ✅ Monsters, Conditions, Damage Types
- ✅ Rules & Rule Sections
- ✅ Full MCP Tool support for AI Agents