<h2>Construindo um projeto com arquitetura baseada em microsserviços usando Spring Cloud.</h2>

Projeto em desenvolvimento para treinar criação de aplicação utilizando Spring Boot e arquitetura de microserviços. Base do projeto desenvolvida ensinada durante bootcamp da Digital Innovation One.

Atualmente o projeto encontra-se em fase de expansão de funcionalidades e melhorias no código sendo executado pelo criador deste repositório.

### Projeto em desenvolvimento com:

- Java 11
- Spring Boot
- Gradle
- IntelliJ IDEA Community Edition
- Controle de versão com GIT
- Armazenamento no Github
- Elasticsearch
- Redis database
- Windows PowerShell para simular requisições http


#### Para executar o projeto é necessário inicializar os microserviços na seguinte ordem:

1. config-server
2. server-discovery
3. gateway
4. product-catalog
5. shopping-cart


##### Comando para inicializar cada microserviço:
```shell script
gradle bootRun
```
