# 📱 Aplicativo de Censo AMIP – Ilha Primeira

### Aplicativo Android para Coleta de Dados Comunitários

Um aplicativo Android nativo desenvolvido em **Kotlin** para apoiar o processo de censo da **Associação de Moradores da Ilha Primeira (AMIP)**, localizada na **Barra da Tijuca, Rio de Janeiro – Brasil**.

O objetivo deste aplicativo é **digitalizar e otimizar a coleta de dados demográficos, socioeconômicos e de infraestrutura** dos moradores, substituindo pesquisas manuais por uma solução mobile estruturada e eficiente.

---

## 👥 Equipe

- João Gois  
- Caio Monteiro
- Vanessa Nascimento
- Douglas Silva
- Marcus Vinícius

---

## 🚀 Principais Funcionalidades

### 🔐 Autenticação de Usuário

O aplicativo inicia com um fluxo de autenticação onde os usuários podem:

- Fazer login com uma conta existente  
- Criar uma nova conta para participar do censo  

Após a autenticação, os usuários são redirecionados para a **tela inicial**, onde são apresentadas a finalidade do censo e as instruções para o preenchimento do questionário.

---

## 📝 Formulário de Censo em Múltiplas Etapas

Para melhorar a usabilidade e evitar sobrecarga ao usuário, o questionário foi dividido em 12 telas sequenciais.

Os usuários navegam pelo censo utilizando os botões “Anterior” e “Próximo”, permitindo revisar e editar informações previamente preenchidas.

O censo coleta dados sobre:

- Identificação familiar e características da moradia  
- Emprego e renda  
- Educação  
- Condições de saúde (incluindo deficiências e autismo)  
- Registro civil  
- Estado civil  
- Religião  

---

## ✅ Envio de Dados

Após a conclusão de todas as etapas, o aplicativo exibe uma tela de confirmação informando que os dados foram registrados e enviados com sucesso.

---

# 🏗 Estrutura do Projeto

O projeto segue a arquitetura padrão de aplicações Android, separando a lógica da aplicação, layouts da interface do usuário e recursos do aplicativo.

## 📂 Visão Geral dos Diretórios

| Diretório | Descrição |
|---|---|
| `java/com/example/projeto_ilha_primeira` | Classes Activity em Kotlin responsáveis pela lógica da aplicação |
| `res/layout` | Arquivos XML que definem a interface de cada tela |
| `res/drawable` | Imagens, ícones e recursos gráficos utilizados no aplicativo |
| `res/values` | Recursos da aplicação como cores, estilos e temas |
| `AndroidManifest.xml` | Arquivo principal de configuração com atividades e definições do app |

---

## 📁 Estrutura de Pastas

```txt
app/
 └── src/main/

      ├── java/com/example/projeto_ilha_primeira/
      │     └── Activities desenvolvidas em Kotlin
      │
      ├── res/
      │     ├── layout/
      │     │     └── Definições de interface das telas (XML)
      │     │
      │     ├── drawable/
      │     │     └── Imagens e recursos gráficos
      │     │
      │     └── values/
      │           └── Cores, estilos e temas
      │
      └── AndroidManifest.xml
            └── Configurações da aplicação e declaração das Activities
