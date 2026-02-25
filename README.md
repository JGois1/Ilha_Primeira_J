# Projeto Recenseamento AMIP (Ilha Primeira)

Aplicativo Android nativo desenvolvido em **Kotlin** para atuar como ferramenta de recenseamento da Associação de Moradores da Ilha Primeira (AMIP), localizada na Barra da Tijuca, Rio de Janeiro. O objetivo é digitalizar e facilitar a coleta de dados demográficos, socioeconômicos e de infraestrutura dos moradores da região.

## Principais Funcionalidades

O aplicativo guia o usuário através de um fluxo intuitivo e bem estruturado:

**Controle de Acesso**
O sistema inicia com opções de autenticação, direcionando o usuário para o login de contas existentes ou para a tela de cadastro de novos recenseadores/moradores. Após a autenticação, a tela inicial contextualiza o propósito da coleta de dados.

**Formulário em Etapas**
Para não sobrecarregar o usuário, o censo é dividido em 12 telas sequenciais, navegáveis através de botões "Anterior" e "Próximo". A coleta abrange temas essenciais como:
* Características do Domicílio e Identificação
* Trabalho, Rendimento e Educação
* Saúde (incluindo PCD e Autismo)
* Registro Civil, Nupcialidade e Religião

**Conclusão**
Ao finalizar o preenchimento, uma tela de confirmação é exibida para garantir ao usuário que os dados foram registrados e enviados com sucesso.

---

## Estrutura do Projeto

O projeto segue a estrutura padrão de um aplicativo Android:

* `app/src/main/java/com/example/projeto_ilha_primeira/`: Contém todas as classes de `Activity` (em Kotlin) que controlam a lógica de cada tela.
* `app/src/main/res/layout/`: Contém todos os arquivos de layout (XML) que definem a interface de usuário de cada `Activity`.
* `app/src/main/res/drawable/`: Armazena os assets visuais do projeto, como o logo da AMIP (`imagem1.png`), ícones de numeração das perguntas e outros elementos gráficos.
* `app/src/main/AndroidManifest.xml`: Arquivo de manifesto que declara todas as `Activities` e a configuração geral do aplicativo.

---

## Tecnologias e Ferramentas

**Linguagem:** Kotlin  
**Plataforma:** Android Nativo  
**Interface:** Android XML (utilizando `ScrollView`, `LinearLayout`, `RadioGroup`, `Spinner`, `EditText` e `Button`)  
**Build System:** Gradle (Kotlin DSL / scripts `.kts`)
