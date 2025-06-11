# 🏥 Hospital Appointment Management System (Backend Only)

## Overview
The **Hospital Appointment Management System** is a backend-only Java Spring Boot application designed to handle hospital operations such as patient data management, doctor scheduling, and appointment booking. This project focuses on building robust RESTful APIs, database integration, and real-world business logic for hospital workflows.

---

## 🛠️ Tech Stack

- **Backend Framework:** Java (Spring Boot)
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **API Style:** RESTful
- **Tools:** Postman (for API testing), Eclipse/IntelliJ

---

## 🚀 Key Features

- 🗓️ **Appointment Management:** Book and manage appointments with doctors  
- 👨‍⚕️ **Doctor Module:** Add/update doctor details with specialization and availability  
- 🧑‍⚕️ **Patient Module:** Store and retrieve patient records and contact details  
- 🔐 **Authentication (Optional):** Add endpoints for role-based access control (admin/patient)  
- 🔄 **CRUD Operations:** Fully implemented for doctors, patients, and appointments  
- 🧾 **MySQL Integration:** All data stored securely in relational tables

> ⚠️ *Note: This project does not include any frontend interface or payment gateway.*

---

## 📂 Project Structure

```bash
hospital-backend/
│
├── controller/         # REST API controllers
├── service/            # Business logic
├── repository/         # JPA repositories
├── model/              # Entity classes
└── application/        # Main Spring Boot entry point
🧪 How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/hospital-backend.git
Open in Eclipse or IntelliJ

Configure your application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/hospitalmng
spring.datasource.username=root
spring.datasource.password=root123
spring.jpa.hibernate.ddl-auto=update
Start the Spring Boot Application

Use Postman or any REST client to test the APIs

📘 Example APIs
POST /api/doctors – Add doctor

GET /api/patients/{id} – Get patient by ID

POST /api/appointments – Book appointment

GET /api/appointments – Get all appointments

🙋‍♂️ Author
Nagesh Raghunath Salunkhe
📧 salunkhenagesh575@gmail.com
🔗 LinkedIn
🔗 GitHub

