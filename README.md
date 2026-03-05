# Platzi Product API

API REST desenvolvida com **Spring Boot** para consulta de produtos a partir de uma API externa, com implementação de **cache utilizando Redis** para melhorar a performance e reduzir chamadas repetidas ao serviço externo.

## 📌 Sobre o Projeto

Este projeto foi desenvolvido com foco em demonstrar boas práticas no desenvolvimento de APIs backend, incluindo integração com serviços externos, tratamento adequado de respostas HTTP e uso de cache para otimização de desempenho.

A aplicação consome dados de produtos de uma **API pública externa** e disponibiliza endpoints próprios para consulta desses dados, utilizando **Redis como camada de cache** para evitar chamadas desnecessárias à API externa.

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Redis
- Spring Cache
- Maven / Gradle

## ⚙️ Funcionalidades

- Consulta de produtos por ID
- Integração com API externa utilizando **Feign Client**
- Cache de respostas utilizando **Redis**
- Tratamento de erros e respostas HTTP adequadas
- Estrutura organizada seguindo boas práticas de arquitetura em camadas

## 🎯 Objetivo do Projeto

O objetivo deste projeto é demonstrar conceitos importantes utilizados em aplicações backend modernas:

- Consumo de APIs externas
- Uso de **cache distribuído**
- Estruturação de APIs REST
- Separação de responsabilidades entre **Controller, Service e Client**
