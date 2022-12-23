# Trilhas Java
 O projeto foi desenvolvido durante a disciplina de Laboratório I do curso de Análise e Desenvolvimento de Sistemas. Ao longo do semestre da disciplina foram desenvolvidas as seguintes competências:
 
:pencil2: Elaborar algoritmos que façam uso, em conjunto, de estruturas de controle do tipo sequenciais, de repetição e de seleção.

:construction: Construir modelos baseados em objetos, que utilizem de maneira adequada as construções do paradigma. Compreender o enunciado de um problema proposto e produzir um programa orientado a objeto que leve à solução do mesmo.

:brain: Compreender e manipular estruturas de dados básicas (vetores unidimensionais). Codificar algoritmos em linguagem de programação estruturada e orientada a objetos.

:computer:Produzir programas legíveis e corretos.

:question: Refletir sobre a utilização da tecnologia para todos os indivíduos, propondo soluções adequadas para promover acessibilidade à sociedade como um todo.

:speech_balloon: Propor e praticar atividades de cunho social na comunidade onde o curso está inserido.

As competências citadas acima foram adquridas realizando os desafios propostos ao longo de 6 módulos que são caracterizados a seguir.

# Módulo I - Conceitos básicos de programação
**Conteúdos abordados:**

:books: Compreender os conceitos básicos, necessários a alguém que está iniciando o aprendizado da programação de computadores.

:books: Compreender o funcionamento dos principais comandos básicos das linguagens de programação de alto nível.

:books: Escrever trechos de programas com os comandos de entrada, saída e atribuição.

**Desafio do módulo**

 É possível criar um sistema que solicite algumas informações do usuário,  simulando um sistema de cadastro de clientes?

Para isto, foi necessário:

:white_check_mark:Escolher uma empresa fictícia de algum ramo específico para desenvolver o sistema (mercado, farmácia, banco, hospital etc.).

:white_check_mark:Escolher no mínimo 10 informações que o usuário deve informar para realizar seu cadastro (de acordo com a empresa escolhida).

:white_check_mark:Por fim, o sistema deve mostrar um resumo do cadastro do usuário, mostrando de forma clara e organizada todos os dados informados acima.

# Módulo II - Modelagem e Orientação a Objetos

**Conteúdos abordados:**

:books: Compreender os conceitos de classes e objetos e saber desenvolver classes nas linguagens UML e Java.

:books: Compreender e identificar o relacionamento de associação entre classes.

:books: Modelar, em UML, os diagramas de classes e objetos de classes que se relacionam, via associação.

:books: Produzir um exemplo de associação.

:books: Compreender o enunciado de um problema proposto e produzir os diagramas e o programa orientado a objetos que leve à solução do problema em questão.

**Desafio do  módulo**

Para o desafio do foi utilizado o tema: Educação universitária para todos. Este tema diz respeito ao projeto da Startup Fun4Study  que tem como objetivo disponibilizar soluções criativas para possibilitar aos interessados em educação utilizarem a tecnologia para estudar a qualquer hora em qualquer lugar. O projeto diz respeito ao problema do acesso à educação universitária. Portanto, para responder ao desafio deste módulo, cada aluno deveria utilizar a sua criatividade e criar exemplos inéditos com base no tema "Educação universitária para todos", para demonstrar como os conteúdos estudados podem ser utilizados na prática.  Os exemplos que devem ser criados são:

:white_check_mark:Objeto: identifique um objeto e reflita sobre a sua estrutura: propriedades e comportamento.

:white_check_mark:Classe: com base no objeto selecionado defina a estrutura da classe para a criação deste objeto. 

# Módulo III - Estruturas de Seleção
**Conteúdos abordados:**

📚 Compreender a execução de um programa orientado a objetos em java.

📚 Compreender a aplicação prática de todos os conceitos.

📚 Compreender as estruturas de seleção.

**Desafio do módulo**

Neste módulo, o desafio era desenvolver parte de um software para a startup: Fun4Study. Esta startup vem trabalhando com soluções criativas para possibilitar aos interessados em educação utilizarem a tecnologia para estudar a qualquer hora em qualquer lugar.

A primeira atividade  desenvolvimento está especificada nas instruções abaixo:

:white_check_mark:Crie a classe: Cidade com os seguintes atributos:

-Código = tipo de dados número inteiro
-Descrição = tipo de dados texto
-UF = tipo de dados texto;
-Quantidade de estudantes = tipo de dados número inteiro.

:white_check_mark:Crie os seguintes métodos na classe Cidade:

-Construtor que receba como parâmetro os valores dos atributos:
-Código, Descrição e UF
-Métodos de acesso (GET) para os atributos:
-Código, Descrição e UF
-Métodos de configuração (SET) para os atributos:
-Descrição e UF
-Método adicionaNovoEstudante que deverá somar +1 estudante no atributo que representa a quantidade de estudantes, toda vez que o método for executado.
-Método exibeDados para apresentar os dados da classe.

:white_check_mark:Crie a classe: Estudante com os seguintes atributos:

-Código = tipo de dados inteiro
-Nome = tipo de dados texto
-Data de nascimento = tipo de dados texto
-Email = tipo de dados texto
-Senha = tipo de dados texto
-Cidade = tipo de dados Cidade

:white_check_mark:Crie os seguintes métodos na classe Estudante:

-Construtor que receba como parâmetro os valores dos atributos:
-Código
-Nome
-Data de nascimento
-Email
-Senha
-Cidade
(o método construtor deve fazer uso também do método adicionaNovoEstudante da classe Cidade, para que, a cada novo estudante cadastrado para um determinado curso (associação simples entre classes), seja calculada e armazenada a quantidade de estudantes para a cidade selecionada)
-Métodos de acesso (GET) para todos os atributos
-Métodos de configuração (SET) para todos os atributos
-Método exibeDados para apresentar todos os dados da classe

:white_check_mark:Crie uma classe de Teste chamada: TesteFun4Study

A classe de teste deve criar 2 cidades e 2 estudantes para cada cidade criada. Utilize a classe Teclado para solicitar os dados do teclado.
Para cada estudante criado, atualize a senha. Utilize a classe Teclado para solicitar os dados do teclado. Para atualizar a senha, o usuário deve digitar (nesta ordem):
-senha anterior (cadastrada na criação do objeto)
-nova senha
-repetir a nova senha
A senha deve ser atualizada apenas se o usuário digitar corretamente a senha anterior e digitar duas vezes a nova senha. Informe com uma mensagem o sucesso ou não da alteração da senha.
Depois da criação das cidades e seus estudantes, o sistema deverá exibir os dados destes objetos na tela.

# Módulo IV - Estruturas de Repetição
**Conteúdos  abordados:**

📚 Aplicação e aperfeiçoamento da compreensão das estruturas de seleção.

📚 Compreender e usar as estruturas de repetição.

📚 Aplicação das estruturas de repetição e seleção, em um mesmo algoritmo.

**Desafio do módulo**

*1º parte*

✅ Apresentar um cenário com  uso de estruturas de seleção em Java.  Atenção: O aluno pode exemplificar o uso de estruturas de seleção com base na sua classe apresentada no módulo II.

*2ª parte* 

Você foi novamente contratado para desenvolver melhorias no Projeto Fun4Study. O principal objetivo destas melhorias diz respeito principalmente ao uso de estruturas de seleção e repetição para refatorar o código elaborado na classse TesteFun4Study. 

Para desenvolver as melhorias do sistema, siga as instruções abaixo:
 
Crie um novo projeto com base no desenvolvido para a atividade do Módulo III.

✅ Altere a classe de Teste chamada TesteFun4Study

Com base em um comando de repetição, a classe de teste deve permitir criar várias cidades:

-Deve ser permitido criar várias cidades, portanto faça uso de um comando de repetição que permita que enquanto o usuário não selecionar a opção “0”, por meio do teclado, o sistema deverá continuar executando e permitir a criação de uma nova cidade;

-Deve-se apresentar os dados de cada cidade após a sua criação.

✅ Para cada cidade criada deve ser permitido a criação de vários estudantes.

-Deve ser permitido criar vários estudantes por cidade, portanto faça uso de um comando de repetição que permita que enquanto o usuário não selecionar a opção “0”, por meio do teclado, o sistema deverá continuar executando e permitir a criação de um novo estudante para a cidade da vez;

-Após a criação de cada estudante, deve-se apresentar os dados do estudante criado na tela;

-Após apresentar os dados do estudante na tela, deve-se perguntar se o usuário deseja alterar algum dado do estudante criado. Em caso positivo, deve-se perguntar qual é o atributo que se deseja alterar e permitir a alteração. Após a alteração deve-se apresentar os dados do estudante atualizados;

-Para atualizar a senha o usuário deve digitar (nesta ordem):

senha anterior (cadastrada na criação do objeto)
nova senha
repetir a nova senha

-A senha deve ser atualizada apenas se o usuário digitar corretamente a senha anterior e digitar duas vezes a nova senha. Caso algum erro ocorra, o sistema deve solicitar novamente que o usuário digite a senha anterior, a nova senha e a repetição da nova senha. O sistema só deve sair desta etapa quando a senha for corretamente alterada.

-Cada cidade criada deve ter no mínimo 4 estudantes, portanto deve-se verificar se este mínimo de estudantes já foram criados antes de encerrar a criação dos estudantes de cada cidade;

-Quando for selecionado “0”, por meio do teclado, o sistema deve encerrar a criação dos estudantes, somente se a condição acima dos estudantes mínimos estiver atendida, e passar para a criação da próxima cidade ou encerrar caso o usuário deseje.

# Módulo V - Herança e Polimorfismo
**Conteúdos abordados**

📚 Compreender e aplicar herança
📚 Compreender e aplicar polimorfismo

**Desafio do módulo**

✅ Apresentar o código das duas classes com seus principais atributos e características que indicam a herança e polimorfismo. 

# Módulo VI - Arrays

**Conteúdos abordados**
📚 Compreender e usar arrays simples
📚 Compreender e usar arrays de objetos
📚 Aplicar arrays simples e arrays de objetos

**Desafio do módulo**

Neste projeto, coloque as classes abaixo:

Arquivo | Classe Universidade

Arquivo | Classe Publica

Arquivo | Classe Privada

Analise as classes acima e desenvolva o que está sendo solicitado nas Questões 1 e 2 abaixo. Você precisará, também, colocar a classe Teclado no seu projeto.

 

Questão 1.

Crie uma classe chamada MEC. Nesta classe, crie os métodos abaixo:

1) imprimeUniversidades, que recebe um array de Universidade e imprime as informações de todas as Universidades, indicando na impressão o tipo da Universidade (Publica ou Privada).


2) maisCara, que recebe um array de Universidade e imprime as informações da Universidade Privada mais cara do array.


3) universidadesDoSul, que recebe um array de Universidade e imprime as informações das Universidades Públicas do Sul do Brasil (ou seja, RS, SC e PR).


Questão 2.

Crie uma classe chamada Principal. Nela, coloque o método main. No main, faça o que se pede:

Crie um array de Universidade com o número de posições indicadas pelo usuário via teclado.

Em cada posição deste array, crie Universidades Públicas ou Privadas, de acordo com a vontade do usuário (ou seja, pergunte ao usuário via teclado que tipo de Universidade ele deseja inserir em cada posição).

Utilizando um objeto do tipo MEC, imprima as informações de todas as Universidades do array.

Utilizando um objeto do tipo MEC, imprima as informações da Universidade Privada mais cara do array.

Utilizando um objeto do tipo MEC, imprima as informações de todas as Universidades Públicas da região Sul do Brasil.
 




