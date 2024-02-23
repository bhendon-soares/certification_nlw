# Certification NLW

Este projeto foi desenvolvido como parte do evento Next Level Week (NLW) da Rocketseat, uma iniciativa que visa proporcionar uma experiência intensiva de aprendizado em tecnologias específicas.

## Descrição

O projeto `certification_nlw` é uma aplicação web que permite aos usuários obterem certificações em diversas tecnologias, como Java, respondendo a perguntas relacionadas à área escolhida. A aplicação foi construída utilizando Java, Spring Boot e Postgresql, proporcionando uma experiência interativa e educativa.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para o desenvolvimento de aplicações Java.
- **Postgresql**: Banco de dados relacional para armazenar as informações dos usuários e certificações.

## Funcionalidades

- Cadastro de usuários.
- Escolha da tecnologia desejada para certificação (por exemplo, Java).
- Resposta a perguntas específicas da tecnologia escolhida.
- Recebimento de uma nota com base nas respostas fornecidas.
- Visualização e impressão de certificados obtidos.

## Instalação

Siga as instruções abaixo para executar o projeto localmente:

1. Clone o repositório: `git clone https://github.com/bhendon-soares/certification_nlw.git`
2. Navegue até o diretório do projeto: `cd certification_nlw`
3. Configure o arquivo `application.properties` com as informações do seu banco de dados PostgreSQL.
4. Execute a aplicação: `mvn spring-boot:run`