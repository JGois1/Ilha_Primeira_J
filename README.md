📱 AMIP Census App – Ilha Primeira

A native Android application developed in Kotlin to support the census process of the Associação de Moradores da Ilha Primeira (AMIP), located in Barra da Tijuca, Rio de Janeiro – Brazil.

The purpose of this application is to digitalize and streamline the collection of demographic, socioeconomic, and infrastructure data from residents, replacing manual surveys with a structured and efficient mobile solution.

👥 Team
João Gois
Caio Monteiro
🚀 Key Features
🔐 User Authentication

The application begins with an authentication flow where users can:

Log in with an existing account
Register a new account to participate in the census

After authentication, users are redirected to the home screen, where the purpose of the census and instructions for completing the questionnaire are presented.

📝 Multi-Step Census Form

To improve usability and prevent user overload, the questionnaire is divided into 12 sequential screens.

Users navigate through the census using “Previous” and “Next” buttons, allowing them to review and edit previously entered information.

The census collects data about:

Household identification and housing characteristics
Employment and income
Education
Health conditions (including disabilities and autism)
Civil registration
Marital status
Religion
✅ Data Submission

Once all steps are completed, the application displays a confirmation screen, informing the user that the information has been successfully recorded and submitted.

🏗 Project Structure

The project follows the standard Android application architecture, separating application logic, user interface layouts, and application resources.

Directory Overview
Directory	Description
java/com/example/projeto_ilha_primeira	Kotlin Activity classes responsible for application logic
res/layout	XML files defining the user interface of each screen
res/drawable	Images, icons, and graphical assets used in the application
res/values	Application resources such as colors, styles, and themes
AndroidManifest.xml	Main configuration file declaring activities and app settings
Folder Structure
app/
 └── src/main/

      ├── java/com/example/projeto_ilha_primeira/
      │     └── Activities written in Kotlin
      │
      ├── res/
      │     ├── layout/
      │     │     └── Screen UI definitions (XML)
      │     │
      │     ├── drawable/
      │     │     └── Images and graphical assets
      │     │
      │     └── values/
      │           └── Colors, styles and themes
      │
      └── AndroidManifest.xml
            └── Application configuration and activity declarations
🛠 Technologies
Programming Language
Kotlin
Development Platform
Android Native Development
User Interface
Android XML Layouts
UI Components
ScrollView
LinearLayout
RadioGroup
Spinner
EditText
Button
Build & Dependency Management
Gradle (Kotlin DSL – .kts)
🎯 Project Objective

This project aims to provide a digital census tool for community organizations, helping to:

Improve data organization
Reduce manual data collection errors
Facilitate demographic and socioeconomic analysis
Support community planning and decision-making
