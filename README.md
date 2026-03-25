📱 AMIP Census App – Ilha Primeira

A native Android application developed in Kotlin designed to support the census process of the Associação de Moradores da Ilha Primeira (AMIP), located in Barra da Tijuca, Rio de Janeiro – Brazil.

The application aims to digitalize and streamline the collection of demographic, socioeconomic, and infrastructure data from residents, replacing manual surveys with a structured and efficient mobile solution.

👥 Team
João Gois
Caio Monteiro
🚀 Key Features
🔐 User Authentication

The application begins with an authentication flow where users can:

Log in with an existing account
Register a new account to participate in the census

After authentication, users are directed to the home screen, which provides instructions and context for the data collection process.

📝 Multi-Step Census Form

To improve usability and avoid overwhelming the user, the census questionnaire is divided into 12 sequential screens.

Users navigate through the form using “Previous” and “Next” buttons, allowing them to review or edit previously entered information.

The census collects information about:

Household identification and housing characteristics
Employment and income
Education
Health conditions (including disabilities and autism)
Civil registration
Marital status
Religion
✅ Data Submission

After completing all steps, the application displays a confirmation screen, informing the user that the data has been successfully recorded and submitted.

🏗 Project Structure

The project follows the standard Android project architecture, organized as follows:

app/
│
├── src/
│   └── main/
│       │
│       ├── java/com/example/projeto_ilha_primeira/
│       │   └── Kotlin Activity classes responsible for application logic
│       │
│       ├── res/
│       │   │
│       │   ├── layout/
│       │   │   └── XML files defining the user interface of each screen
│       │   │
│       │   ├── drawable/
│       │   │   └── Images, icons, and graphical assets (e.g., AMIP logo)
│       │
│       └── AndroidManifest.xml
│           └── Application configuration and Activity declarations
🛠 Technologies

Language

Kotlin

Platform

Android Native Development

User Interface

Android XML Layouts

UI Components Used

ScrollView
LinearLayout
RadioGroup
Spinner
EditText
Button

Build System

Gradle (Kotlin DSL – .kts)
🎯 Project Objective

The goal of this project is to provide a digital tool for structured community data collection, helping local organizations:

Improve data organization
Reduce manual data collection errors
Facilitate demographic and socioeconomic analysis
Support community planning and decision-making
