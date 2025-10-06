# 🛒 Akakce.com Automation Test Scenarios

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Language](https://img.shields.io/badge/Language-Java-red.svg)](https://www.java.com/)
[![Selenium](https://img.shields.io/badge/Automation-Selenium-blue.svg)](https://www.selenium.dev/)

This repository contains **automation test scenarios** for **Akakce.com**, focusing on **user account functionalities**. The tests cover **account creation, login/logout, order and message verification, and account deletion**, ensuring a secure and seamless shopping experience.

---

## 📌 User Stories Overview

| ID       | Title                        | Description                                                                 |
|----------|-------------------------------|-----------------------------------------------------------------------------|
| US_101   | User Account Creation         | Users can create an account to enjoy a personalized shopping experience.    |
| US_102   | Account Verification Check    | Users can see their name in the profile after successful login.            |
| US_103   | Logout                        | Users can securely log out of their account.                               |
| US_104   | Login                         | Users can log in to access their saved preferences.                        |
| US_105   | Order List Check              | Users can check their order list to avoid unauthorized purchases.          |
| US_106   | Message Box Check             | Users can check their message box to stay updated on campaigns/notifications. |
| US_107   | Account Deletion              | Users can delete their account to ensure personal data protection.         |

---

## 📝 Acceptance Criteria

### **US_101 – User Account Creation**
- Users can create an account by entering: **username, surname, email, password, gender, and date of birth**.
- Upon successful creation, users are redirected to the **account verification page**.
- **Preconditions:**  
  - Supported browser installed and launched (**Chrome**).  
  - Active internet connection.  
  - Password must be at least **8 characters** with uppercase, lowercase, and numeric characters.  

### **US_102 – Account Verification Check**
- After login, the user’s name appears in the **top-right profile section**.
- Name must exactly match the one provided during account creation.
- **Preconditions:** User must have an active account.

### **US_103 – Logout**
- Users can **log out** from their account.
- After logout, users are redirected to the **login page**.
- **Preconditions:** User must be logged in.

### **US_104 – Login**
- Users can **log in** using valid credentials.
- **Preconditions:** Account must be created and verified.

### **US_105 – Order List Check**
- Users can access their **order list** after login.
- If no orders exist, an appropriate **message** is displayed.
- **Preconditions:** Account must be created, verified, and logged in.

### **US_106 – Message Box Check**
- Users can access their **message box** after login.
- If empty, an appropriate **message** is displayed.
- **Preconditions:** Account must be created, verified, and logged in.

### **US_107 – Account Deletion**
- Users can **delete their account** while logged in.
- Account deletion succeeds only after entering the **correct password**.
- **Preconditions:** Account must be created, verified, and logged in.

---

## ⚙️ Global Preconditions
1. Supported browsers (**Chrome**) installed and launched.  
2. Internet connectivity is available.  
3. Valid user accounts exist for test execution.  

---

## 🚀 Test Execution Notes
- Ensure **manual preconditions** are met before automation execution.  
- Validate both **success and failure scenarios** (e.g., invalid login, empty order/message lists).  
- Capture **screenshots and logs** for reporting and debugging.  

---

## 🛠️ Technologies & Tools
- **Automation:** Selenium WebDriver (Java)  
- **Test Management:** Jira / Zephyr  
- **Browsers:** Chrome 
- **Version Control:** GitHub  

---

## 👥 Team
### 🧑‍💼 Team Lead
- **Ruya Tiras**
### 👤 Contributors
- **Efe Ersan**  
- **Arslan Taha DURAN**  
- **Aslihan Gulluoglu**  
- **Taner Ozcelik**

---

## 📄 License
This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.  

---

