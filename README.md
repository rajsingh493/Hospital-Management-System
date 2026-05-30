# 🏥 Hospital Management System

A modern, full-stack desktop application built using **Java Swing** and **MySQL Database** to streamline hospital administration, patient registrations, staff management, and room allocations.

---

## ✨ Features
* **Secure Login Panel:** Multi-user authentication with a sleek, dark-themed user interface.
* **Patient Management:** Easy registration and real-time tracking of new and discharged patients.
* **Staff & Employee Directory:** Complete database management for doctors, nurses, and administrative staff.
* **Room Availability:** Live monitoring of available, occupied, or dirty hospital rooms/ICU beds.
* **Modern UI Aesthetics:** Upgraded from classic teal to a premium dark-mode blue layout with custom flat buttons.

---

## 🛠️ Tech Stack & Libraries Used
* **Frontend:** Java Swing (AWT, Core Graphics)
* **Backend:** MySQL Database
* **Libraries (`lib/`):**
  * `mysql-connector-j-8.0.33.jar` (Database Connectivity)
  * `ResultSet2xml.jar` (Dynamically mapping SQL tables to UI JTables)

---

## 🚀 How to Setup and Run

### 1. Database Configuration
1. Open **MySQL Workbench** or MySQL Command Line.
2. Open and execute the script inside the `database_backup.sql` file provided in this repository.
3. This will automatically create the database `hospital_management_system` and its required tables (`login`, `employee`, `room`).

### 2. Project Execution
1. Open this project folder in **VS Code** or **IntelliJ IDEA**.
2. Make sure the `.jar` files inside the `lib/` folder are added to your Java Referenced Libraries project path.
3. Navigate to `src/hospital/management/system/Login.java`.
4. Right-click and click **Run Java** to start the application.

### 🔑 Default Credentials
* **Username:** `admin`
* **Password:** `admin123`
