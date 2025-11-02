#  Sweet Shop Management System
--------------------------------

A full-stack web application to manage a sweet shop’s products, orders, and inventory.  
Built with **React (Frontend)** and **Spring Boot (Backend)** — this project demonstrates a complete end-to-end solution integrating a responsive UI with a secure backend API.

---

##  Project Overview
------------------------

The **Sweet Shop Management System** allows shop owners to manage sweets, track inventory, and process updates easily.  
This project was developed as part of an academic assignment and demonstrates the full software development workflow including backend, frontend, and database integration.

---

##  Tech Stack
--------------

###  Backend
- **Java 24**  
- **Spring Boot 3.4.11**  
- **Maven**  
- **PostgreSQL**  
- RESTful APIs  
- JPA/Hibernate ORM  

###  Frontend
- **React 18**  
- **JavaScript (ES6)**  
- **HTML5 / CSS3**  
- **Axios** (for API calls)  
- **Bootstrap / Material UI** (optional styling)



##  Project Structure
-------------------------

SweetShopProject/
│
├── backend/ # Spring Boot application
│ ├── src/main/java # Java source code
│ ├── src/main/resources # Application properties
│ └── pom.xml # Maven build file
│
├── frontend/ # React frontend
│ ├── src/ # React components
│ ├── public/ # Static assets
│ └── package.json # NPM dependencies
│
└── README.md # Project documentation





##  How to Run the Project
-------------------------

### 1️ Clone the Repository
---------------------------
```bash
git clone https://github.com/BhoomikaR2610/SweetShopProject.git
cd SweetShopProject


2️ Run the Backend (Spring Boot)
cd backend
mvn spring-boot:run


The backend will start on: http://localhost:8080

3️ Run the Frontend (React)

Open a new terminal:

cd frontend
npm install
npm start


The frontend will start on: http://localhost:3000

 Connecting Frontend and Backend

To ensure both work together:

In your React app (e.g., inside src/api.js), set the API base URL as:

export const API_URL = "http://localhost:8080";


Use Axios to fetch data:

axios.get(`${API_URL}/api/sweets`)
     .then(res => console.log(res.data));
```
## Features
------------

✅ Add, Update, Delete sweets

✅ Manage quantity and pricing

✅ Fetch sweet list dynamically

✅ Fully responsive UI

✅ Integrated backend using REST API



 ## Future Enhancements
 ----------------------

* Add order management module

* Add authentication for admin and staff

* Include sales analytics dashboard

 Developed By
 -------------

Bhoomika R
🎓 MCA – III Semester
💡 Subject: Machine Learning / Software Engineering
📅 Year: 2025

 Conclusion
 -----------

This project showcases a complete full-stack development workflow using modern technologies.
It emphasizes modular design, REST API development, and React-based user interface integration.


