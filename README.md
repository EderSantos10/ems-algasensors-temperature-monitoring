# 🌡️ EMS - Temperature Monitoring

Microsserviço responsável por **simular a coleta de dados de temperatura** e publicar essas leituras em uma fila RabbitMQ para processamento posterior.

---

## ⚙️ Tecnologias

- Java 21  
- Spring Boot 3  
- RabbitMQ (Publisher)  
- Gradle  
- Lombok  

---

## 🧠 Funcionalidades

- Simulação periódica de leituras de temperatura.  
- Envio das mensagens para uma **exchange** do RabbitMQ.  
- Controle de intervalos de publicação e logs.

---

## 💡 Habilidades Demonstradas

- Implementação de mensageria com RabbitTemplate.  
- Criação de tarefas agendadas (Spring Scheduling).  
- Configuração YAML e injeção de dependências.  
- Princípios de Clean Code e resiliência na publicação.

---

## ▶️ Execução Local

``bash
./gradlew bootRun


Ou via Docker:

docker-compose up -d temperature-monitoring


---
