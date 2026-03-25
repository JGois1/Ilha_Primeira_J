📱 AMIP Census App – Ilha Primeira

Android application developed in Kotlin to support the census process of the Associação de Moradores da Ilha Primeira (AMIP), located in Barra da Tijuca, Rio de Janeiro – Brazil.

The main objective of this project is to digitalize and simplify the collection of demographic, socioeconomic, and infrastructure data from residents of Ilha Primeira, replacing manual data collection with a structured digital system.

👥 Team
João Gois
Caio Monteiro
🚀 Features

The application provides a guided and structured census workflow, allowing users to collect and submit information efficiently.

🔐 User Authentication

The app starts with an authentication system where users can:

Log in with an existing account
Register as a new census taker or resident

After authentication, the home screen presents the purpose of the census and instructions for the data collection process.

📝 Multi-Step Census Form

To improve usability and prevent cognitive overload, the census questionnaire is divided into 12 sequential screens.

Navigation is handled through "Previous" and "Next" buttons, allowing users to review or edit previously entered information.

The questionnaire includes the following sections:

Household Identification and Housing Characteristics
Employment and Income
Education
Health Information (including disabilities and autism)
Civil Registration
Marital Status
Religion
✅ Submission Confirmation

After completing all steps, the application displays a confirmation screen, informing the user that the data has been successfully submitted and recorded.

🏗 Project Structure

The project follows the standard Android application architecture.

app
 ├── src
 │   ├── main
 │   │   ├── java/com/example/projeto_ilha_primeira/
 │   │   │   └── Activity classes (Kotlin)
 │   │   │
 │   │   ├── res
 │   │   │   ├── layout/
 │   │   │   │   └── XML files defining each screen UI
 │   │   │   │
 │   │   │   ├── drawable/
 │   │   │   │   └── Images, icons, and visual assets
 │   │   │
 │   │   └── AndroidManifest.xml
🛠 Technologies
Language: Kotlin
Platform: Native Android
UI: Android XML
UI Components:
ScrollView
LinearLayout
RadioGroup
Spinner
EditText
Button
Build System: Gradle (Kotlin DSL – .kts)
🎯 Purpose of the Project

This application was developed to:

Improve data organization and accessibility
Reduce manual census errors
Provide a structured digital tool for community data collection
Support data-driven decision making for the AMIP community.
