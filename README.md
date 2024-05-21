# ChurnAPI
Repositório destinado a aplicação ChurnAPI da ChurnAnalytics a qual auxiliará no desenvolvimento e manutenção da nossa IA para previsão de Churn, feito para o projeto Challenge da **FIAP** em 2024 em conjunto com a empresa **Plusoft**. O intuito é criar uma IA para previsão de churn (evasão de clientes) e usar isso para ajudar no direcionamento da empresa quanto a relação com seus próprios clientes.

Para a entrega da segunda sprint foram realizados os ajustes apontados no feedback da prmeira, como a falta de validação no Model e falta de retornos Controller. Além disso o DER foi remodelado agora contendo quatro entidades que se relacionam entre si.

A entidade empresa serve para a Plusoft, por exemplo, e a transação pode representar as possíveis entidades que podem ser relacionadas ao Cliente, desde "transação" à "cliente do cliente", porém isso vai variar a cada caso. Para os Clientes simbólicos da Plusoft em específico, permancemos apenas com Transação por enquanto.

As previsões de Churn também são uma entidade própria, visto que cada cliente pode ter uma previsão diferente em momentos diferentes.

Membros:
* Carlos - Responsável pelo desenvolvimento back-end, em especial JAVA;
* Hemily - Responsável pelo desenvolvimento front-end e scrum master;
* Kaique - Responsável pelo banco de dados e também pelo back-end;
* Vinícius - Responsável pelo banco de dados e desenvolvimento da IA em Python;
* Matheus - Também responsável pelo banco de dados e pelo front-end.

Instruções p/ rodar aplicação:

Utilizando uma IDE que suporte Java, como o IntelliJ IDEA por exemplo, basta clonar o repositório na sua máquina e abrí-lo - em específico a pasta "churn" do repositório. Fazendo isso, basta rodar a aplicação a partir da sua classe MAIN e estará pronto para uso.

Toda a documentação se encontra na pasta documentos ou aqui no README.md, caso tenha alguma dúvida.

...
