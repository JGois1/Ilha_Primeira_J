# Projeto Recenseamento AMIP (Ilha Primeira)

## 1. Visão Geral

Este é um aplicativo Android nativo, desenvolvido em Kotlin, que funciona como uma ferramenta de recenseamento (censo) para a **Associação de Moradores da Ilha Primeira (AMIP)**, localizada na Barra da Tijuca, Rio de Janeiro.

O objetivo principal do projeto é digitalizar e facilitar a coleta de dados demográficos, socioeconômicos e de infraestrutura dos moradores da região.

## 2. Principais Funcionalidades

O aplicativo guia o usuário (recenseador ou morador) através de um fluxo de telas bem definido:

* **Autenticação:** O app inicia com uma tela de `MainActivity` que direciona para:
    * `LoginActivity`: Permite o login de usuários já cadastrados.
    * `CadastroActivity`: Permite o cadastro de novos usuários.
* **Tela Inicial do Censo:** Após o login, a `Telainicial` apresenta o propósito do recenseamento.
* **Formulário Multi-Etapas:** O censo é dividido em 12 seções (Activities `Perguntas1` a `Perguntas12`), cobrindo tópicos como:
    * Identificação e Características do Domicílio
    * Informações sobre os Moradores
    * Registro Civil e Nupcialidade
    * Trabalho, Rendimento e Educação
    * Saúde (Pessoas com deficiência, Autismo)
    * Religião
* **Navegação:** Cada tela de pergunta possui botões "Anterior" e "Próximo" para facilitar a navegação pelo formulário.
* **Tela de Conclusão:** Ao final do questionário, a `ConclusaoActivity` exibe uma mensagem de sucesso, confirmando o envio dos dados.

## 3. Estrutura do Projeto

O projeto segue a estrutura padrão de um aplicativo Android:

* `app/src/main/java/com/example/projeto_ilha_primeira/`: Contém todas as classes de `Activity` (em Kotlin) que controlam a lógica de cada tela.
* `app/src/main/res/layout/`: Contém todos os arquivos de layout (XML) que definem a interface de usuário de cada `Activity`.
* `app/src/main/res/drawable/`: Armazena os assets visuais do projeto, como o logo da AMIP (`imagem1.png`), ícones de numeração das perguntas e outros elementos gráficos.
* `app/src/main/AndroidManifest.xml`: Arquivo de manifesto que declara todas as `Activities` e a configuração geral do aplicativo.

## 4. Tecnologias Utilizadas

* **Linguagem:** Kotlin
* **Plataforma:** Android Nativo
* **UI (Interface):** Android XML
* **Componentes de UI:** `ScrollView`, `LinearLayout`, `RadioGroup`, `Spinner`, `EditText`, `Button`.
* **Build System:** Gradle (com scripts `.kts`)
