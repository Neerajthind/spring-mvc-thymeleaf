# Member Registration Form Demonstration

This project is a **simple demonstration** of a **member registration form** built using **Spring Boot** and **Thymeleaf**. The form collects and validates member details, including contact preferences, subscription plans, and fitness goals.

## Features

- **Member Registration Form**:
  - First Name, Last Name, Email
  - Preferred Contact Method (Email, Phone, TextMessage)
  - Subscription Plan (Basic, Standard, Premium)
  - Fitness Goals (Lose Weight, Build Muscle, Increase Stamina, General)

- **Form Validation**:
  - Validates required fields such as name and email.
  - Ensures valid selection of contact method, subscription plan, and fitness goals.

- **Member Confirmation**:
  - After form submission, a confirmation page displays the member’s details, including the selected preferences.

## Technologies Used

- **Spring Boot**: Backend framework for form handling and validation.
- **Thymeleaf**: Template engine for rendering HTML forms.
- **Bootstrap**: (Optional) For styling the front-end forms.

## Project Structure

- **DemoApplication.java**: Main Spring Boot application entry point.
- **Member.java**: Entity representing a member with fields for personal details, contact methods, and fitness goals.
- **MemberController.java**: Handles form submission and redirects to the confirmation page.
- **Templates**:
  - `member-form.html`: Member registration form.
  - `member-confirmation.html`: Displays confirmation of member details after submission.

## Setup Instructions

### Prerequisites

1. **Java 11 or later** installed on your system.
2. **Maven** installed to manage dependencies.

### Steps to Run

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Neerajthind/member-registration-demo.git
