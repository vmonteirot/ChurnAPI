# Churn Prediction API

API Java para predição de churn usando Spring Boot, Maven e banco de dados Oracle. Este projeto inclui operações CRUD para `Empresa`, `Cliente`, `Transacao` e `ChurnPrediction`.

* Membros:
   * CARLOS GABRIEL DE FREITAS FLORES FERREIRA - RM97528 - 2TDSPX
   * HEMILY NARA DA SILVA - RM550889 - 2TDSPX
   * KAIQUE GABRIEL TOSCHI - RM551165 - 2TDSPX
   * MACIRANDER SOUZA DE MIRANDA FILHO - RM551416 - 2TDSPF
   * VINICIUS ARIEL MONTEIRO TEIXEIRA - RM98839 - 2TDSPX
 

## Pré-requisitos

- Java JDK 17
- Maven 3.x
- Banco de dados Oracle
- Conta na Azure com App Service configurado
- Repositório no GitHub com Actions para CI/CD

## Como Configurar e Executar Localmente

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/vmonteirot/ChurnAPI.git
   cd ChurnAPI

2. **Configurar o Banco de Dados Oracle**:
Altere o arquivo application.properties com os dados da sua conexão Oracle:

      spring.datasource.url=jdbc:oracle:thin:@//<HOST>:<PORT>/<DB_NAME>
      
      spring.datasource.username=<DB_USERNAME>
    
      spring.datasource.password=<DB_PASSWORD>
      
      spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

3. **Build e execução**:
   Use Maven para criar o .jar
    mvn clean package

   Execute o .jar:
    java -jar target/churn-<version>.jar

4. **Deploy na Azure**:
  Configurar o GitHub Secrets no repositório:
  
    AZURE_CLIENT_ID
   
    AZURE_TENANT_ID
   
    AZURE_SUBSCRIPTION_ID
   
    AZURE_CLIENT_SECRET

   
    Deploy com GitHub Actions:
      O workflow em .github/workflows/main_churnanalytics.yml realiza o deploy automático na Azure após o push para a branch main.


## Script DDL:
O arquivo script.sql contém os comandos SQL para criar as tabelas necessárias no banco Oracle:

## Fluxo de Deploy e CI/CD
    CI/CD: O projeto está configurado para usar GitHub Actions para automação de build e deploy.
    Deploy automático: Após cada push para a branch main, o GitHub Actions irá buildar o projeto e fazer o deploy na Azure automaticamente usando o workflow .github/workflows/main_churnanalytics.yml.

    
    
Siga as instruções acima para configurar e executar o projeto localmente ou para realizar o deploy na Azure.

Toda a documentação se encontra na pasta documentos ou aqui no README.md, caso tenha alguma dúvida.
