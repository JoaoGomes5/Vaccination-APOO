# Vacination-APOO

## Objectives
    - Aplicação em java que permita registar e consultar
    informação relativa às marcações para a vacinação contra a COVID-19.

## Good Pratices Ideas
    - Todo o codigo produzido / nome commits em inglês
    - Variaveis EXTREMAMENTE explicativas
    - Cammel Case 
    - Divisão de tarefas equitativa 
    - Não implementar o codigo sem ter uma base estuturada 

## Requisitos 
    - Usar ficheiros txt para guardar a informação 
    - Dividir informações com " | " 
    - Leitura e escrita de ficheiros nos ficheiros txt
    - J para funcionalidades atribuidas a João
    - G para funcionalidades atribuidas a Gustavo
    - X para funcionalidades finalizadas
    - Carregar as marcações criadas para arrays (maximo de 100 marcações)
    - Guardar o array de marcações no ficheiro Schedules.txt
    - Criar alguns objetos defalut para Utentes, Enfermeiros, Local de Vacinação e Vacinas 
    - Ficheiros com extensão txt:
        - Schedules.txt
        - Patients.txt
        - Nurses.txt
        - Vaccines.txt
        - VaccinationLocations.txt
        - HealthCenters.txt
        - Hospitals.txt
        - Pavilions.txt

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

#### Local de Vacinação
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
    - Pesquisar marcação por Utente - 
    - Alterar uma marcação (Local, data, hora ou Enfermeiro) - 
    - Pesquisar marcações de utentes com idade num intervalo indicado pelo utilizador; - 
    - Pesquisar marcações com uma marca e/ou lote de vacina indicado pelo utilizador;
    - Listar indivíduos – nome, contacto, categoria (enfermeiro / utente) que vão estar num determinado dia num determinado local de vacinação
    - Pesquisar marcações para um dia indicado pelo utilizador;
    - Pesquisar marcações para um local de vacinação indicado pelo utilizador;
    - Registar em ficheiro a informação das marcações (array → ficheiro);
    - Ler de um ficheiro a informação das marcações (ficheiro → array);
    - Possibilidade de gerir múltiplas zonas do país(ex: Porto, Aveiro, Matosinhos), utilizando um ficheiro para cada zona.
 
## Classes Structure 

### Enfermeiro - Nurse
    - Atributos
        - Nome - name - String  
        - Número de cédula profissional - cardNumber -Integer com o limite de 5 digitos
        - Número de telefone - phoneNumber - Integer com o limite de 9 digitos

    - Métodos
        - create() - Criar um enfermeiro
        - update() - Atualizar os dados do enfermeiro 
        - delete() - Eliminar um enfermeiro - OPCIONAL


### Utente - Patient
    - Atributos
        - Nome - name - String 
        - Sexo - gender - String 
        - Data de nascimento - dateOfBirth -String no formato DD-MM-AAAA
        - Numero de utente - patientNumber - Integer 
        - Numero de telemovel - phoneNumber - Integer com o limite de 9 digitos

    - Métodos
        - create() - Registar um utente
        - update() - Atualizar dados do Utente

        - convertDateOfBirthToAge() - Converter data de nascimento do utente para idade 
            - Parâmetros que a função recebe:
                - 

### Vacina - Vaccine
    - Atributos
        - Marca - brand - String com as opções disponiveis: 
            - Pfizer / BioNTech 
            - Moderna 
            - Oxford / AstraZeneca
        - Lote - lot - String

    - Métodos

### Local de vacinação - VaccinationLocation
    - Atributos
        - Nome - name - String
        - Morada - address - String
        - Telefone - phoneNumber -  Integer com o limite de 9 digitos

    - Métdos

### Centro de Saúde - Herda todos os atributos e metodos da classe "Local de Vacinação" - HealthCenter

### Hospital - Herda todos os atributos e metodos da classe "Local de Vacinação" incluindo - Hospital
    - Atributos
        - Nome do edificio - buildingName - String
        - Extensão telefónica - extension - Integer com o limite de 4 digitos

    - Métodos

### Pavilhão Municipal - Herda todos os atributos e metodos da classe "Local de Vacinação" incluindo - Pavilion
     - Atributos
        - Numero da secção - sectionName - Integer

    - Métodos
    

### Marcação - Schedule 
    - Atributos
        - Local de vacinação - "VaccinationLocation"
        - Data de marcação - date - String no formato DD-MM-AAAA 
        - Hora de marcação - time - String no formato HH-MM
        - Enfermeiro - "Nurse"
        - Utente - "Patient"
        - Vacina - "Vaccine"

    - Métodos
        - create() - Criar uma marcação 
        - update() - Atualizar os dados da marcação (Local, Data, Hora ou Enfermeiro)
        - searchByPatient() - Pesquisar marcação por Utente - Pelo numero especifico do Utente
            - Parâmetros: 
                - Numero de utente - patientNumber - Integer 
                    - Validações: 
                        - Só é possivel passar valores inteiros e o valor especifico do utente

        - searchByAge(String beginning, String ending) - Pesquisar marcações de Utentes por idade - Idade delimitada pelo utilizador
            - Parâmetros:
                - Inicio do intervalo - beginning - Integer
                    - Validações: 
                        - 
                - Fim do intervalo - ending - Integer
        
        - searchByBrand(String brand) - Pesquisar marcações por marca da vacina
            - Parâmetros:
                - Marca da vacina - brand - String com as opções disponiveis: 
                                                - Pfizer / BioNTech 
                                                - Moderna 
                                                - Oxford / AstraZeneca
                    - Validações: 
                        - Só é possivel inserir marcas que existem (Pfizer / BioNTech, Moderna, Oxford / AstraZeneca)
        
        - searchByLot(String lot) - Pesquisar marcações por lote da vacina
            - Parâmetros:
                - lot da vacina - lot - String 
                    - Validações: 
                        - Só é possivel inserir valores em tipo string
        
        - searchByBrandAndLot(String brand, string lot) - Pesquisar marcações por marca e lote da vacina
               
             - Parâmetros:
                - Marca da vacina - brand - String com as opções disponiveis: 
                                                - Pfizer / BioNTech 
                                                - Moderna 
                                                - Oxford / AstraZeneca
                    - Validações: 
                        - Só é possivel inserir marcas que existem (Pfizer / BioNTech, Moderna, Oxford / AstraZeneca)

                    - Lote da vacina - lot - String 
                        - Validações: 
                            - Só é possivel inserir valores em tipo string
        



    

