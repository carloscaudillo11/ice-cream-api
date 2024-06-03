# 🚀 Proyecto REST API con Spring Boot, Java 21, MongoDB y Docker

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

Este proyecto es una REST API construida con Spring Boot, Java 21, MongoDB y Docker. La API permite gestionar recursos y ofrece endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

## 🌟 Tecnologías Utilizadas

- ☕ **Java 21**
- 🌱 **Spring Boot**
- 🍃 **Spring Data MongoDB**
- 🐳 **Docker**
- 📦 **Maven**

## 📋 Requisitos Previos

Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

- [Java 21 JDK](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/get-started)

## 🛠️ Instalación y Ejecución

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu-usuario/tu-proyecto.git
    cd tu-proyecto
    ```

2. Construye la imagen de Docker:

    ```bash
    docker build -t nombre-de-tu-imagen .
    ```

3. Ejecuta los contenedores usando Docker Compose:

    ```bash
    docker-compose up
    ```

4. La API estará disponible en `http://localhost:8080`.

## 🔗 Endpoints

### ➕ Crear un recurso

- **URL:** `/api/recursos`
- **Método:** `POST`
- **Cuerpo de la Solicitud:** JSON
- **Respuesta Exitosa:** `201 Created`

### 📜 Obtener todos los recursos

- **URL:** `/api/recursos`
- **Método:** `GET`
- **Respuesta Exitosa:** `200 OK`

### 🔍 Obtener un recurso por ID

- **URL:** `/api/recursos/{id}`
- **Método:** `GET`
- **Respuesta Exitosa:** `200 OK`
- **Respuesta de No Encontrado:** `404 Not Found`

### ✏️ Actualizar un recurso por ID

- **URL:** `/api/recursos/{id}`
- **Método:** `PUT`
- **Cuerpo de la Solicitud:** JSON
- **Respuesta Exitosa:** `200 OK`
- **Respuesta de No Encontrado:** `404 Not Found`

### ❌ Eliminar un recurso por ID

- **URL:** `/api/recursos/{id}`
- **Método:** `DELETE`
- **Respuesta Exitosa:** `204 No Content`
- **Respuesta de No Encontrado:** `404 Not Found`

## 🐳 Configuración de Docker

Este proyecto incluye un `Dockerfile` y un `docker-compose.yml` para facilitar la creación y despliegue de los contenedores.

### Dockerfile

El `Dockerfile` construye la imagen de Docker para la aplicación Spring Boot.

### Docker Compose

El archivo `docker-compose.yml` configura los servicios de la aplicación y MongoDB.

```yaml
version: '3.8'
services:
  app:
    image: nombre-de-tu-imagen
    ports:
      - "8080:8080"
    depends_on:
      - mongodb
  mongodb:
    image: mongo:latest
    ports:
      - "27017:27017"
    volumes:
      - mongo-data:/data/db

volumes:
  mongo-data:
