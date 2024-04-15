# ChurnAPI
Repositório destinado a API que auxiliará no desenvolvimento e manutenção da nossa IA para previsão de Churn, feito para o projeto Challenge da FIAP em 2024 em conjunto com a empresa Plusoft. O intuito é criar uma IA para previsão de churn (ou evasão de clientes) e usar isso para ajudar no direcionamento da empresa quanto a relação com seus próprios clientes.

Nesse momento foi escolhida apenas uma entidade: Customer. Isso se deve ao fato de que estamos na fase inicial do projeto e ainda estamos aguardando mais informações da empresa Plusoft a qual teremos uma mentoria em conjunto prevista para o dia 24 de abril de 2024 e nela entenderemos melhor como a empresa recolhe e trabalha com as informações de seus clientes - e suas próprias informações - e trabalharemos em cima disso. Portanto, a escolha da entidade Customer (cliente) foi mais uma escolha simbólica para demonstrar o intuito da API que é auxiliar no processo de Deep Learning da nosssa IA de previsão de Churn.

Na próxima sprint, com base nas informações adicionais que recebermos, iremos expandir o modelo para incluir mais entidades e relacionamentos e alterar seus atributos e constraints como for necessário. Isso nos permitirá construir uma API mais completa e robusta que pode lidar com uma variedade maior de casos de uso e fornecer dados mais ricos para o modelo de aprendizado profundo.

Algumas explicações em relação aos atributos da entidade Customer:

* ID: Este é o identificador único para cada cliente. É necessário para distinguir cada cliente de forma única.
* Nome: O nome da empresa cliente. É importante também para identificar a empresa.
* Setor: O setor de atuação da empresa cliente. Este atributo pode ser útil para o modelo de aprendizado profundo, pois empresas de diferentes setores podem ter diferentes padrões de churn.
* Tamanho: O tamanho da empresa cliente (por exemplo, número de funcionários). Este é outro atributo que pode influenciar a previsão de churn, pois empresas de diferentes tamanhos podem ter diferentes necessidades e comportamentos.
* Localização: A localização geográfica da empresa cliente. A localização pode afetar a previsão de churn, pois empresas em diferentes locais podem enfrentar diferentes condições de mercado.
* Data_Contrato: A data de início do contrato com a empresa cliente. Este atributo pode ser útil para entender a duração do relacionamento com o cliente.
* Valor_Contrato: O valor financeiro do contrato com a empresa cliente. Este é um indicador importante do valor do cliente para a empresa.
* Interacoes: O número de interações com a empresa cliente. Este atributo pode ser um indicador do nível de engajamento do cliente com a Plusoft.
* Status_Churn: O status de churn da empresa cliente. Este é o atributo de destino para a previsão de churn.

...
