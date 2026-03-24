# Descrição do projeto
O projeto é uma nagevação simples entre 4 tipos de telas, sendo elas a de Login, Menu, Perfil e Pedidos.
Ao entrar na tela de perfil, será mostrado seu nome, sendo o padrão como "Usuário Genérico", porém, no MenuScreen já foi inserido artificialmente o nome que será levado pela rota.
O mesmo acontece com a tela de Pedidos, porém com 2 argumentos ao invés de 1.



# Objetivo da prova
O objetivo da prova é forçar o aluno a buscar suas próprias respostas, como também de enteder sozinho o que o código está fazendo e o porque de estar fazendo de tal modo.

# Explicação de cada evolução implementada
Cada evolução será explicada usando como base de "tópicos" os commits do github do professor.

### 1. Passagem de parâmetros obrigatórios na tela de Perfil:
    Aqui foi onde o primeiro contato com os parâmetros aconteceu, onde se foi inserido um complemento à rota "/perfil", agora com "/perfil/{nome}", 'nome' 
    está entre colchetes pois é uma variável que será lida pelo código toda vez que o usuário acessar a página perfil com um atributo de nome dentro da url.
    Também foi adicionado um valor mockado em MenuScreen para que fique mais fácil de visualizar o resultado proposto pelo checkpoint. 
    Vale ressaltar que o parâmetro nome é obrigatório neste caso.
### 2. Passagem de parâmetros opcionais na tela de Pedidos:
    O processo feito nesta parte foi praticamente igual ao passo anterior, com uma leve diferença: "pedidos?cliente={cliente}" ao invés de "perfil/{nome}". 
    Isso mostra que, ao contrário de nome, que é obrigatório, cliente é opcional, sendo demonstrado por '?' antes de si.
### 3. Inserindo valor ao parâmetro opcional na tela de Pedidos:
    Assim como o título descreve, neste passo é adicionado um valor mockado ao parâmetro 'cliente' em MenuScreen para que seja mostrado na tela de pedidos
### 4. Passagem de múltiplos parâmetros
    Agora é criado mais um parâmetro para a rota de perfil, sendo ela 'idade', deixando a rota deste modo: "perfil/{nome}/{idade}". 
    E por ter mais de um argumento, chamamos a variável arguments dentro de composable(), adicionando este trecho de código:
           arguments = listOf(
                            navArgument("nome") { type = NavType.StringType },
                            navArgument("idade") { type = NavType.IntType }
                             )
    Após isso, basta mockarmos mais um valor dentro da rota em MenuScreen, adicionar o novo parâmetro à PerfilScreen e 
    colocar o texto para ser mostrado na tela com interpolação de dados ( ${} )





Com isso agora ao acessar a página peril será mostrado o seguinte texto: "Perfil de - Fabio Nardella que tem 20 anos". Já ao entrar na página de pedido voltará o texto: "Pedidos de Cliente XPTO"
