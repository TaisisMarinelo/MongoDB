<img src="D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\138007193-47cac947-928e-4909-a299-0ae99b35eed9.png" style="zoom:15%;" />





<img src="D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\138007156-3ae6e393-a770-4bf7-85cb-9f9d390fb118.png" style="zoom:25%;" />

# \## Turma 1 - API **Consultório Gama Pan anatomy** <p align="center">Api utilizando Mongodb para agendamento de consultas.</p>



###  Desenvolvedores:  

#### Alunos: Taisis Marinelo, Filipe Souza, Paulo Roberto, Jader Raul.



Tópicos

================= 

<!--ts-->   

* [Sobre](#Sobre)   
* * [Como usar](#como-usar)     
*  * [Pre Requisitos](#pre-requisitos)      
  * * [Tests](#testes)  
  * * [Tecnologias](\###Tecnologias) 

<!--te-->

[Sobre](#Sobre) 

API desenvolvida em treinamento, mediante a proposta dos professores.

A mesma deve agendar consultas médicas, listar a equipe médica, fazendo a utilização do banco Mongodb. 

Trata-se de uma API back  end, que ao inserir a primeira informação no banco de dados criará o banco test.  



[Pré Requisitos](#pre-requisitos)  

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas: 

[Eclipse], [Postman],[Mongo db].  

Além disto é bom ter um editor para trabalhar com o Banco Mongodb [Robo 3T].



[Como usar](#como-usar)

🎲 Rodando o Back End (servidor)

 ```Clone este repositório $ git clone  ```

 ```# Importe o projeto para o Eclipse ```

```# Abra o projeto ClinicaMongo/src/main/java/com/example.ClinicaMongo```

 ``` # Execute o ClinicaMongoApplication.java após a execução aguarde até a mensagem (Started ClinicaMongoAplication)  ``` 

 ```#  Execute o Posteman passando o endereço local na porta <[http://localhost:8080](http://localhost:8080/)> ```



[Tests](#testes)  

Inserindo Médicos no Banco:

Utilizando o Postman:

**Insert**

 Com o endereço http://localhost:8080/medicos e a requisição POST irem popular o banco com os médicos  a cadastrar.

![](D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\Insert.JPG)                                    



Com o endereço http://localhost:8080/consulta e a requisição POST irem popular o banco com as consultas.

![](D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\Insert2.JPG)



**Update**

Com o endereço http://localhost:8080/consulta e a requisição PUT podemos atualizar o banco com as consultas.

![](D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\update.JPG)



**READ**

Com o endereço http://localhost:8080/consulta/id e http://localhost:8080/medico/id  e a requisição GET iremos buscar no banco as consultas, e os médicos passando o id, também  e possível realizar a busca sem o id e obter todos os resultados do banco.

![](D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\buscac.JPG)



![](D:\Dev\workspace-taisis\ClinicaMongo\src\assets\readme\buscam.JPG)





[\###  🛠 Tecnologias](\###Tecnologias) 

As seguintes ferramentas foram usadas na construção do projeto: 

- Spring boot Start data Mongodb
- Spring boot Start Web
- Spring boot Maven plugin
- Spring boot devtools
- Java 11

#### 



### Dias 03/11/2021 e 04/11/2021



## Treinamento Java e AWS Cloud!

### #GoGama #OPanEhTech

