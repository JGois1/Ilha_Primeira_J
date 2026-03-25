AMIP Census Project (Ilha Primeira)
Team Members: João Gois, Caio Monteiro

A native Android application developed in Kotlin to serve as a census tool for the Associação de Moradores da Ilha Primeira (AMIP), located in Barra da Tijuca, Rio de Janeiro. The goal is to digitalize and streamline the collection of demographic, socioeconomic, and infrastructure data from residents in the region.

Main Features

The application guides the user through an intuitive and well-structured workflow:

Access Control

The system starts with authentication options, directing the user to either log in to an existing account or register as a new census taker/resident. After authentication, the home screen provides context about the purpose of the data collection.

Multi-Step Form

To avoid overwhelming the user, the census is divided into 12 sequential screens, navigated using “Previous” and “Next” buttons.

The data collection covers essential topics such as:

Household Characteristics and Identification
Work, Income, and Education
Health (including Disabilities and Autism)
Civil Registration, Marital Status, and Religion
Completion

After completing the form, a confirmation screen is displayed to ensure the user that the information has been successfully recorded and submitted.

Project Structure

The project follows the standard Android application structure:

app/src/main/java/com/example/projeto_ilha_primeira/
Contains all Activity classes (written in Kotlin) responsible for controlling the logic of each screen.

app/src/main/res/layout/
Contains all XML layout files that define the user interface of each Activity.

app/src/main/res/drawable/
Stores the project's visual assets, such as the AMIP logo (imagem1.png), numbered question icons, and other graphical elements.

app/src/main/AndroidManifest.xml
The manifest file that declares all Activities and the general configuration of the application.

Technologies and Tools

Language: Kotlin
Platform: Native Android
Interface: Android XML (using ScrollView, LinearLayout, RadioGroup, Spinner, EditText, and Button)
Build System: Gradle (Kotlin DSL / .kts scripts)
