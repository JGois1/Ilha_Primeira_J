📱 AMIP Census App – Ilha Primeira

A native Android application developed in Kotlin designed to support the census process of the Associação de Moradores da Ilha Primeira (AMIP), located in Barra da Tijuca, Rio de Janeiro, Brazil.

The application aims to digitalize and streamline the collection of demographic, socioeconomic, and infrastructure data from residents, replacing manual data collection with a structured and efficient mobile solution.

👥 Team
João Gois
Caio Monteiro
🚀 Key Features
🔐 User Authentication

The application starts with an authentication flow that allows users to:

Log in with an existing account
Register a new account for census participation

After authentication, users are directed to the home screen with information about the purpose of the census and instructions for completing the questionnaire.

📝 Multi-Step Census Form

To improve usability, the census questionnaire is divided into 12 sequential screens, allowing users to complete the process gradually.

Navigation between screens is performed using "Previous" and "Next" buttons, enabling users to review or update previously entered information.

The census collects information on:

Household identification and housing characteristics
Employment and income
Education
Health conditions (including disabilities and autism)
Civil registration
Marital status
Religion
✅ Data Submission

After completing all steps, the application displays a confirmation screen indicating that the information has been successfully submitted and recorded.

🏗 Project Structure

The project follows the standard Android project structure.

app/
 ├── src/main/java/com/example/projeto_ilha_primeira/
 │    └── Kotlin Activity classes responsible for screen logic
 │
 ├── src/main/res/layout/
 │    └── XML layout files defining the user interface
 │
 ├── src/main/res/drawable/
 │    └── Images and graphical assets (AMIP logo, icons, etc.)
 │
 └── src/main/AndroidManifest.xml
      └── Application configuration and activity declarations
🛠 Technologies
Language: Kotlin
Platform: Android Native
User Interface: Android XML

UI Components used:

ScrollView
LinearLayout
RadioGroup
Spinner
EditText
Button

Build System: Gradle (Kotlin DSL – .kts)

🎯 Project Objective

The goal of this project is to provide a digital tool for structured community data collection, helping local organizations:

Improve data organization
Reduce manual collection errors
Facilitate demographic and social analysis
Support community planning and decision-making.
