# Distributed Healthcare Microservices Platform

A distributed healthcare backend system built using **Spring Boot microservices** that demonstrates how independent services can collaborate through **REST APIs, gRPC communication, and event-driven messaging**.

The system is designed around common healthcare workflows such as **patient management, billing, authentication, and analytics**, with each capability implemented as an independent microservice. Services communicate synchronously using REST/gRPC and asynchronously through **Kafka-based event streaming**, allowing the system to remain loosely coupled and scalable.

This project focuses on demonstrating **production-style backend architecture patterns** including API gateway routing, service isolation, asynchronous communication, and containerized deployment.

---

# Architecture Overview

The platform follows a **microservices architecture** where each service owns its data and business logic.

Client
│
▼
API Gateway
│
├── Auth Service
│ Handles authentication and authorization
│
├── Patient Service
│ Manages patient records and registration
│
├── Billing Service
│ Handles billing workflows and payment processing
│
└── Analytics Service

Consumes events and generates insights



---

# Communication Patterns

The system uses multiple communication mechanisms depending on the use case.

### 1. REST APIs
- Used for client-facing endpoints
- Handles CRUD operations

### 2. gRPC
- Used for efficient service-to-service communication
- Useful for performance-sensitive operations

### 3. Kafka (Event Streaming)
- Enables asynchronous communication
- Allows services to publish and consume events independently

---

# Key Features

### Patient Management
- Register and manage patient profiles
- Store demographic and medical details
- Maintain patient records in a dedicated database

### Billing Workflow
- Trigger billing when a patient event occurs
- Use gRPC for fast inter-service communication

### Authentication Service
- Centralized authentication for system access
- Ensures secure communication across services

### Analytics Service
- Consumes Kafka events
- Generates aggregated insights for monitoring and reporting

---

# Technology Stack

## Backend
- Java
- Spring Boot
- Spring Data JPA

## Databases
- PostgreSQL

## Microservices Communication
- REST APIs
- gRPC

## Event Streaming
- Apache Kafka

## Infrastructure
- Docker
- Docker Compose

---

# Project Structure

java-spring-microservices
│
├── api-gateway
│
├── auth-service
│
├── patient-service
│
├── billing-service
│
├── analytics-service
│
├── api-requests
│
└── integration-tests



Each service follows a typical Spring Boot layered architecture.

controller
service
repository
entity
dto
config


---

# Event Driven Flow Example

1. A new patient is registered through the **Patient Service**
2. The service publishes a **PatientCreated event to Kafka**
3. The **Billing Service** consumes the event and generates billing records
4. The **Analytics Service** processes the event stream to update analytics data

This approach keeps services **loosely coupled and scalable**.

---
