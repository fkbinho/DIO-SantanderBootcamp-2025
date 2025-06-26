# 📬 Messaging API

A RESTful API built with **Spring Boot** that allows sending messages via **Email**, **SMS**, and **WhatsApp**, applying key design patterns like **Strategy**, **Factory**, and **Facade**. The API also supports full **CRUD** operations and is documented using **Swagger (OpenAPI)**.

# 🇧🇷 API de Mensagens
Uma API RESTful desenvolvida com **Spring Boot** que permite o envio de mensagens via **Email**, **SMS** e **WhatsApp**, aplicando os padrões de projeto **Strategy**, **Factory** e **Facade**. A API também possui operações completas de **CRUD** e está documentada com **Swagger (OpenAPI)**.

---

## 🇧🇷 Funcionalidades

- ✅ Envio de mensagens por Email, SMS e WhatsApp
- 🧩 Aplicação dos padrões Strategy, Factory e Facade
- 🔁 Operações CRUD completas
- 📄 Interface Swagger para documentação e testes
- 💾 Banco de dados em memória (H2)

---

## 🇺🇸 Features

- ✅ Send messages using Email, SMS, or WhatsApp
- 🧩 Implements Strategy, Factory, and Facade patterns
- 🔁 Full CRUD for message records
- 📄 Swagger UI for API documentation and testing
- 💾 In-memory database using H2 (for development)

---

## 🛠️ Technologies Used / Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI (Swagger)

---

## 📁 Project Structure / Estrutura do Projeto

```
com.example.messaging
├── config              # Configuração do Swagger
├── controller          # Endpoints REST
├── dto                 # Objetos de entrada/saída
├── model               # Entidade JPA
├── repository          # Interface JPA
├── service
│   ├── factory         # Fábrica de estratégias
│   └── strategy        # Estratégias para Email, SMS, WhatsApp
```

---

## 🔍 Swagger

Acesse a documentação da API via navegador:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 📬 Exemplo de Requisição / Request Example

**POST /messages**

```json
{
  "recipient": "john@example.com",
  "message": "Olá! Esta é uma mensagem de teste.",
  "type": "EMAIL"
}
```

---