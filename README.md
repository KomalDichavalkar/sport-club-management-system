🏆 Sports Club Management System

Full-Stack Project
React.js | Spring Boot | JWT | MySQL

Designed and developed a full-stack web application to digitize sports club operations, including member management, activities, and nutrition consultation workflows.
Implemented JWT-based stateless authentication with role-based access control (Admin, Member, Nutritionist) using Spring Security.
Built RESTful APIs in Spring Boot and integrated them with a React.js frontend using secure API communication.
Designed and managed relational database schemas in MySQL to ensure data integrity and scalability.
Followed clean architecture principles with separation of frontend and backend for maintainability and future scalability.


🏗️ System Architecture
High-level flow:

Client (React.js)
   ↓ Secure API Calls (JWT)
Spring Boot REST APIs
   ↓
MySQL Database

Stateless authentication using JWT
RESTful APIs for frontend–backend communication
Layered backend architecture (Controller → Service → Repository)


🔐 Security Model
JWT-based authentication
Stateless session handling
Role-based access control:
  Admin – system & member management
  Member – activities & requests
  Nutritionist / Trainer – consultation handling
Secure API endpoints with token validation



🚀 Tech Stack
Frontend
  React.js
  HTML5, CSS3
  JavaScript (ES6+)
  Axios
  React Router

Backend
  Java
  Spring Boot
  Spring Security
  REST APIs

Database
  MySQL
  
Authentication
JWT (JSON Web Token)
Role-based access (Admin, Member, Nutritionist, trainer)

📈 Engineering Highlights
Designed stateless authentication using JWT to improve scalability and reduce server-side session overhead
Implemented role-based authorization at API level using Spring Security
Structured backend using layered architecture (Controller, Service, Repository) for clean separation of concerns
Ensured secure frontend–backend communication using token-based authorization headers
Designed normalized relational schemas in MySQL to maintain data integrity and scalability


📂 Project Structure
sport-club-management-system/
│
├── sport-club-main/   # Frontend (React)
│   ├── src/
│   ├── public/
│   ├── package.json
│
├── sports-club/       # Backend (Spring Boot)
│   ├── src/
│   ├── pom.xml
│
├── .gitignore
└── README.md



⚙️ Setup Instructions

1️⃣ Clone the Repository
git clone https://github.com/KomalDichavalkar/sport-club-management-system.git
cd sport-club-management-system

2️⃣ Frontend Setup (React)
cd sport-club-main
npm install
npm start

📍 Runs on:
http://localhost:3000

3️⃣ Backend Setup (Spring Boot)
cd sports-club
mvn clean install
mvn spring-boot:run


Key Features
Secure user authentication & authorization
Role-based dashboards
Member management and activity tracking
Club achievements management
Nutrition consultation request workflow
REST API integration between frontend and backend
Clean separation of concerns for scalability


🧪 What This Project Demonstrates
Full-stack system design thinking
Secure backend development with Spring Boot
Frontend–backend API integration
Real-world authentication and authorization patterns
Production-ready project structuring
Strong fundamentals in Java, SQL, and web architecture












