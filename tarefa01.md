# REST API's <h1>

As REST API's (Representational State Transfer Application Programming Interfaces) é uma interface que dois sistemas de computador usam para trocar informações de forma rápida e segura pela internet. Se comunicam via solicitações de HTTP para executar funções padrão do banco de dados como criar, ler, atualizar e excluir registros em um recurso. Elas têm sido amplamente adotadas na construção de sistemas web, permitindo a comunicação eficiente entre diferentes aplicações e serviços.

## API <h2>

Sigla utilizada para Application Programming Interface (Interface de Programação de Aplicações) que é basicamente um conjunto de padrões e rotinas estabelecidos por uma aplicação, para que outras aplicações possam utilizar as funcionalidades desta aplicação.

- Responsável por estabelecer comunicação entre diferentes serviços.
- Meio de campo entre as tecnologias.
- Intermediador para troca de informações.

## REST <h2>

Sigla utilizada pa Representational State Transfer (Transferência de Estado Representativo), é uma arquitetura de software que impõe condições sobre como uma API deve funcionare define um conjunto de restrições a serem seguidas na criação de serviços web. O principal objetivo do REST é permitir a comunicação entre sistemas de maneira simples, escalável e padronizada. 

- Será feita a transferência de dados de uma maneira simbólica, figurativa, representativa, de maneira didática.
- A transferência de dados, geralmente, usando o protocolo HTTP.
- O REST delimita algumas obrigações nessas transferências de dados.
  

### CARACTERISTICAS <h3>

- _Uniform Interface (Interface Uniforme)_: Manter uma uniformidade, uma constância, um padrão na construção da interface. A API precisa ser coerente para quem vai consumi-lá. Precisa fazer sentido para o cliente e não ser confusa. Logo, é necessário o uso correto dos verbos HTTP; endpoints coerentes; usar somente uma linguagem de comunicação; sempre enviar respostas aos clientes.
  
- _Client-server (Cliente-Servidor)_: As REST APIs seguem o modelo cliente-servidor, onde o cliente faz solicitações e o servidor fornece respostas. Isso permite uma separação do cliente e do armazenamento de dados (servidor), dessa forma, poderemos ter uma portabilidade do nosso sistema, usando o React para WEB e React Native para o smartphone, por exemplo.

- _Stateless (Sem Estado)_: Cada requisição que o cliente faz para o servidor deve conter todas as informações necessárias para o servidor entender e processar a solicitação. Isso significa que o servidor não mantém estado entre as solicitações, o que torna as REST APIs altamente escaláveis.  

- _Cacheable (Cache)_: As respostas para uma requisição, deverão ser explicitas ao dizer se aquela resquição, pode ou não ser cacheada pelo cliente.

- _Layered System (Sistema em Camada)_: O cliente acessa a um endpoint, sem precisar saber da complexidade, de quais passos estão sendo necessários para o servidor responder a requisição, ou quais outras camadas o servidor estará lidando, para que a requisição seja respondida.

- _Code On Demand (Código sob demanda (opcional))_: Dá possibilidade a aplicação pegar códigos, como o javascript, por exemplo, e executar no cliente.


## RESTFUL <h2>

RESTful, está em conformidade com os critérios estabelecidos pela Transferência de Estado Representacional, é a aplicação dos padrões REST.

