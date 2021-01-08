# Vacination-APOO

## Objectives
    - Aplicação em java que permita registar e consultar
    informação relativa às marcações para a vacinação contra a COVID-19.

### Marcações
    - Dados associados a marcação:
        - Local de vacinação:  
            - Centro de saúde
            - Hospital
            - Pavilhão municipal
        - Data de marcação
        - Hora de marcação
        - Enfermeiro
        - Utente
        - Vacina

#### Local de marcação
    - Dados associados ao local de marcação
        - Nome
        - Morada
        - Telefone
        - Se for um Hospital deve incluir:
            - Nome do edificio
            - Extenção telefónica
        - Se for um pavilhão municipal deve incluir:
            - Numero da secção

#### Enfermeiro
    - Dados associados ao enfermeiro:
        - Nome
        - Número de cédula profissional
        - Número de telefone

#### Utente 
    - Nome 
    - Sexo
    - Data de nascimento
    - Numero de utente
    - Numero de telemovel

#### Vacina
    - Marca: 
        - Pfizer / BioNTech
        - Moderna
        - Oxford / AstraZeneca
    - Lote

## Functions
    - Menu para selecionar as diversas opções
    - Ler informação de uma marcação e acrescentá-la a um array em memória (considere que não precisa de armazenar mais de 100 marcações)
    - Retirar do array a marcação de um utente indicado pelo utilizador
    - Pesquisar marcação por Utente
    - Alterar uma marcação (Local, data, hora ou Enfermeiro)
    - Pesquisar marcações de utentes com idade num intervalo indicado pelo utilizador;
    - Pesquisar marcações com uma marca e/ou lote de vacina indicado pelo utilizador;
    - Listar indivíduos – nome, contacto, categoria (enfermeiro / utente) que vão estar num determinado dia num determinado local de vacinação
    - Pesquisar marcações para um dia indicado pelo utilizador;
    - Pesquisar marcações para um local de vacinação indicado pelo utilizador;
    - Registar em ficheiro a informação das marcações (array → ficheiro);
    - Ler de um ficheiro a informação das marcações (ficheiro → array);
    - Possibilidade de gerir múltiplas zonas do país(ex: Porto, Aveiro, Matosinhos), utilizando um ficheiro para cada zona.


    

