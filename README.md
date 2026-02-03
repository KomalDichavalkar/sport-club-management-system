# 🏆 Sports Club Management System
> Full-Stack Web Application | React.js · Spring Boot · JWT · MySQL

A full-stack web application designed to digitize sports club operations, including **member management, activities, achievements, and nutrition consultation workflows**.  
Built using modern frontend and backend technologies with a focus on **security, scalability, and clean architecture**.

---

## 🚀 Project Overview

- Developed a full-stack web application to manage sports club operations efficiently  
- Implemented **JWT-based stateless authentication** with **role-based access control**  
- Built **secure RESTful APIs** using Spring Boot and integrated them with a React.js frontend  
- Designed **relational database schemas** in MySQL to ensure data integrity and scalability  
- Followed **clean architecture principles** with clear separation of frontend and backend  

---

## 🏗️ System Architecture

### High-Level Flow
- **Client (React.js)**
  - Secure API Calls (JWT)
- **Spring Boot REST APIs**
- **MySQL Database**

  

### Architecture Highlights
- Stateless authentication using JWT
- RESTful APIs for frontend–backend communication
- Layered backend architecture:
  - Controller
  - Service
  - Repository

---

## 🔐 Security Model

- JWT-based authentication
- Stateless session handling
- Role-based access control:
  - **Admin** – system & member management
  - **Member** – activities & requests
  - **Nutritionist / Trainer** – consultation handling
- Secure API endpoints with token validation using Spring Security

---

## 🚀 Tech Stack

### Frontend
- React.js
- HTML5, CSS3
- JavaScript (ES6+)
- Axios
- React Router

### Backend
- Java
- Spring Boot
- Spring Security
- REST APIs

### Database
- MySQL

### Authentication
- JWT (JSON Web Token)
- Role-based access (Admin, Member, Nutritionist, Trainer)

---


## ✨ Key Features
- Secure user authentication & authorization
- Role-based dashboards
- Member management and activity tracking
- Club achievements management
- Nutrition consultation request workflow
- REST API integration between frontend and backend
- Clean separation of concerns for scalability

---

## 🧪 What This Project Demonstrates
- Full-stack system design thinking
- Secure backend development with Spring Boot
- Frontend–backend API integration
- Real-world authentication and authorization patterns
- Production-ready project structuring
- Strong fundamentals in Java, SQL, and web architecture


## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/KomalDichavalkar/sport-club-management-system.git
cd sport-club-management-system

###2️⃣ Frontend Setup (React)
cd sport-club-main
npm install
npm start

###3️⃣ Backend Setup (Spring Boot)
cd sports-club
mvn clean install
mvn spring-boot:run

---

