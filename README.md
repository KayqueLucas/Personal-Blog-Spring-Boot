# Personal Blog – Spring Boot

Projeto de blog pessoal desenvolvido em Java com Spring Boot, com foco em backend e arquitetura MVC. O objetivo principal é praticar conceitos fundamentais de desenvolvimento backend, organização de código, persistência de dados e renderização server-side, sem utilização de banco de dados.

Este projeto faz parte do meu portfólio como desenvolvedor backend júnior e está em desenvolvimento.

O sistema é dividido em duas seções principais. A área pública permite a listagem dos artigos publicados e a visualização do conteúdo completo de cada artigo. A área administrativa permite a criação, edição e remoção de artigos, além de contar com uma autenticação simples para controle de acesso.

Os artigos são armazenados como arquivos JSON diretamente no filesystem, priorizando simplicidade e aprendizado de manipulação de arquivos, serialização e organização de dados. A aplicação segue o padrão MVC (Model-View-Controller), onde os Controllers recebem as requisições HTTP, os Services concentram a lógica de negócio e o acesso aos dados, e o Model representa a entidade de domínio do sistema.

Tecnologias utilizadas no projeto: Java 17, Spring Boot, Spring MVC, Thymeleaf, Jackson (JSON), HTML5 e CSS3.

Status atual do projeto:
- Criação do projeto Spring Boot concluída
- Estrutura inicial organizada em Model, Service e Controllers
- Implementação da área pública pendente
- Implementação da área administrativa pendente
- Autenticação pendente
- Documentação final pendente

Para executar o projeto localmente, utilize o comando:

./mvnw spring-boot:run

A aplicação será iniciada em http://localhost:8080.

O objetivo deste projeto é consolidar fundamentos de backend com Spring Boot, demonstrando organização, clareza de código e evolução gradual, sem overengineering.
