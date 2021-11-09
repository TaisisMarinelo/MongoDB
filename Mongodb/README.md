

<img src="D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\pan.png" style="zoom:15%;" />



![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\gama.png)

# \## Turma 1 - Banco MONGODB 

# <p align="center">Aula de utilização do Banco de dados MongoDB.</p>



###  Desenvolvedor:  

#### Aluna: Taisis Marinelo.



### Criação BD: use livraria

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\criacaodb.JPG)

### Criação da Collection: db.createCollectio("Livros")

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\createcollection.JPG)



### Banco de dados populado com arquivo json. 

```

    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "Anjos e demônios",
        "Ano publicação": "2000"
    }



    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "O Código da Vinci",
        "Ano publicação": "2003"
    }
    
    

    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "O Símbolo Perdido",
        "Ano publicação": "2009"
    }



    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "Inferno",
        "Ano publicação": "2013"
    }



    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "Origem",
        "Ano publicação": "2017"
    }
 


    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "Fortaleza Digital",
        "Ano publicação": "1998"
    }



    "Livro":{
        "Autor": "Dan Brown",
        "Nome do livro": "Ponto de Impacto",
        "Ano publicação": "2001"
    }
   


    "Livro":{
        "Autor": "Kizzy Ysatis",
        "Nome do livro": "Diário da Sibila Rubra, O Retorno das Bruxas",
        "Ano publicação": "2008"
    }



    "Livro":{
        "Autor": "Kizzy Ysatis",
        "Nome do livro": "O Clube dos Imortais",
        "Ano publicação": "2013"
    }



    "Livro":{
        "Autor": "Kizzy Ysatis",
        "Nome do livro": "O Mistério do Rio das Rosas Brancas",
        "Ano publicação": "2012"
    }



    "Livro":{
        "Autor": "Kizzy Ysatis",
        "Nome do livro": "Eterno Castigo",
        "Ano publicação": "2014"
    }



    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "O Vendedor de Sonhos: O Chamado",
        "Ano publicação": "2008"
    }



    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "O Semeador de Ideias",
        "Ano publicação": "2011"
    }



    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "O Vendedor de Sonhos e a Revolução dos Anônimos",
        "Ano publicação": "2009"
    }

       

    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "Prisioneiros da Mente, Os Cárceres Mentais",
        "Ano publicação": "2018"
    }
        


    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "A Ditadura da Beleza e a Revolução das Mulheres",
        "Ano publicação": "2005"
    }



    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "O Mestre dos Mestres. Jesus, o maior educador da história",
        "Ano publicação": "2011"
    }

        

    "Livro":{
        "Autor": "Augusto Cury",
        "Nome do livro": "Inteligência Socioemocional",
        "Ano publicação": "2019"
    }



    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "A Sombra do Vento - O Cemitério dos Livros Esquecidos #01",
        "Ano publicação": "2007"
    }

        

    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "O Jogo do Anjo - O Cemitério dos Livros Esquecidos #2",
        "Ano publicação": "2008"
    }
        


    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "O Prisioneiro do Céu - O Cemitério dos Livros Esquecidos #3",
        "Ano publicação": "2012"
    }



    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "O Labirinto dos Espíritos - O Cemitério dos Livros Esquecidos #4",
        "Ano publicação": "2017"
    }

        

    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "Marina",
        "Ano publicação": "2011"
    }
        
        

    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "O Príncipe da Névoa - Trilogia da Névoa #1",
        "Ano publicação": "2013"
    }

        

    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "O Palácio da Meia-noite - Trilogia da Névoa #2",
        "Ano publicação": "2013"
    }

        

    "Livro":{
        "Autor": "Carlos Ruiz Zafón",
        "Nome do livro": "As Luzes de Setembro - Trilogia da Névoa #3",
        "Ano publicação": "2013"
    }

    

    "Livro":{
        "Autor": "Mari Scotti",
        "Nome do livro": "Hibrida",
        "Ano publicação": "2013"
    }



    "Livro":{
        "Autor": "Mari Scotti",
        "Nome do livro": "Guardião",
        "Ano publicação": "2015"
    }

        

    "Livro":{
        "Autor": "Mari Scotti",
        "Nome do livro": "Rainha",
        "Ano publicação": "2017"
    }

```

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\BD.JPG)



### Update de documentos, primeira imagem arquivos a serem atualizados, segunda terceira e questa atualização, quinta imagem arquivos já atualizados: 

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\BDupdate.JPG)

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\up1.JPG)

![up2](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\up2.JPG)

![up3](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\up3.JPG)

![upresult](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\upresult.JPG)



### Consulta Com projeção:

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\consultaprojecao.JPG)



```
/* 1 */
{
    "Livro" : {
        "Nome do livro" : "Anjos e demônios"
    }
}

/* 2 */
{
    "Livro" : {
        "Nome do livro" : "O Código da Vinci"
    }
}

/* 3 */
{
    "Livro" : {
        "Nome do livro" : "O Símbolo Perdido"
    }
}

/* 4 */
{
    "Livro" : {
        "Nome do livro" : "Inferno"
    }
}

/* 5 */
{
    "Livro" : {
        "Nome do livro" : "Origem"
    }
}

/* 6 */
{
    "Livro" : {
        "Nome do livro" : "Fortaleza Digital"
    }
}

/* 7 */
{
    "Livro" : {
        "Nome do livro" : "Ponto de Impacto"
    }
}

/* 8 */
{
    "Livro" : {
        "Nome do livro" : "Diário da Sibila Rubra, O Retorno das Bruxas"
    }
}

/* 9 */
{
    "Livro" : {
        "Nome do livro" : "O Clube dos Imortais"
    }
}

/* 10 */
{
    "Livro" : {
        "Nome do livro" : "O Mistério do Rio das Rosas Brancas"
    }
}

/* 11 */
{
    "Livro" : {
        "Nome do livro" : "Eterno Castigo"
    }
}

/* 12 */
{
    "Livro" : {
        "Nome do livro" : "O Vendedor de Sonhos: O Chamado"
    }
}

/* 13 */
{
    "Livro" : {
        "Nome do livro" : "O Semeador de Ideias"
    }
}

/* 14 */
{
    "Livro" : {
        "Nome do livro" : "O Vendedor de Sonhos e a Revolução dos Anônimos"
    }
}

/* 15 */
{
    "Livro" : {
        "Nome do livro" : "Prisioneiros da Mente, Os Cárceres Mentais"
    }
}

/* 16 */
{
    "Livro" : {
        "Nome do livro" : "A Ditadura da Beleza e a Revolução das Mulheres"
    }
}

/* 17 */
{
    "Livro" : {
        "Nome do livro" : "O Mestre dos Mestres. Jesus, o maior educador da história"
    }
}

/* 18 */
{
    "Livro" : {
        "Nome do livro" : "Inteligência Socioemocional"
    }
}

/* 19 */
{
    "Livro" : {
        "Nome do livro" : "A Sombra do Vento - O Cemitério dos Livros Esquecidos #01"
    }
}

/* 20 */
{
    "Livro" : {
        "Nome do livro" : "O Jogo do Anjo - O Cemitério dos Livros Esquecidos #2"
    }
}

/* 21 */
{
    "Livro" : {
        "Nome do livro" : "O Prisioneiro do Céu - O Cemitério dos Livros Esquecidos #3"
    }
}

/* 22 */
{
    "Livro" : {
        "Nome do livro" : "O Labirinto dos Espíritos - O Cemitério dos Livros Esquecidos #4"
    }
}

/* 23 */
{
    "Livro" : {
        "Nome do livro" : "Marina"
    }
}

/* 24 */
{
    "Livro" : {
        "Nome do livro" : "O Príncipe da Névoa - Trilogia da Névoa #1"
    }
}

/* 25 */
{
    "Livro" : {
        "Nome do livro" : "O Palácio da Meia-noite - Trilogia da Névoa #2"
    }
}

/* 26 */
{
    "Livro" : {
        "Nome do livro" : "As Luzes de Setembro - Trilogia da Névoa #3"
    }
}

/* 27 */
{
    "Livro" : {
        "Nome do livro" : "Hibrida - Série neblina e escuridão #1"
    }
}

/* 28 */
{
    "Livro" : {
        "Nome do livro" : "Guardião - Série neblina e escuridão #2"
    }
}

/* 29 */
{
    "Livro" : {
        "Nome do livro" : "Rainha - Série neblina e escuridão #3"
    }
}
```



### Consulta com combinação de Seletores:

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\Consultaseletores.JPG)



```
/* 1 */
{
    "_id" : ObjectId("618ab79f9fea74c97314b237"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Anjos e demônios",
        "Ano publicação" : "2000"
    }
}

/* 2 */
{
    "_id" : ObjectId("618ab7af9fea74c97314b23b"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "O Código da Vinci",
        "Ano publicação" : "2003"
    }
}

/* 3 */
{
    "_id" : ObjectId("618ab7bf9fea74c97314b23e"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "O Símbolo Perdido",
        "Ano publicação" : "2009"
    }
}

/* 4 */
{
    "_id" : ObjectId("618ab7e09fea74c97314b24b"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Fortaleza Digital",
        "Ano publicação" : "1998"
    }
}

/* 5 */
{
    "_id" : ObjectId("618ab7ea9fea74c97314b24e"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Ponto de Impacto",
        "Ano publicação" : "2001"
    }
}
```



### Consulta paginada, ignorar :

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\paginacao.JPG)

```
/* 1 */
{
    "Livro" : {
        "Autor" : "Kizzy Ysatis"
    }
}

/* 2 */
{
    "Livro" : {
        "Autor" : "Kizzy Ysatis"
    }
}

/* 3 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 4 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 5 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 6 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 7 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 8 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 9 */
{
    "Livro" : {
        "Autor" : "Augusto Cury"
    }
}

/* 10 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 11 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 12 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 13 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 14 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 15 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 16 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 17 */
{
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón"
    }
}

/* 18 */
{
    "Livro" : {
        "Autor" : "Mari Scotti"
    }
}

/* 19 */
{
    "Livro" : {
        "Autor" : "Mari Scotti"
    }
}

/* 20 */
{
    "Livro" : {
        "Autor" : "Mari Scotti"
    }
}
```



### Consulta ordenada: 

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\Consultaordenada.JPG)



```
/* 1 */
{
    "_id" : ObjectId("618ab79f9fea74c97314b237"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Anjos e demônios",
        "Ano publicação" : "2000"
    }
}

/* 2 */
{
    "_id" : ObjectId("618ab7af9fea74c97314b23b"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "O Código da Vinci",
        "Ano publicação" : "2003"
    }
}

/* 3 */
{
    "_id" : ObjectId("618ab7bf9fea74c97314b23e"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "O Símbolo Perdido",
        "Ano publicação" : "2009"
    }
}

/* 4 */
{
    "_id" : ObjectId("618ab7ca9fea74c97314b241"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Inferno",
        "Ano publicação" : "2013"
    }
}

/* 5 */
{
    "_id" : ObjectId("618ab7d59fea74c97314b248"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Origem",
        "Ano publicação" : "2017"
    }
}

/* 6 */
{
    "_id" : ObjectId("618ab7e09fea74c97314b24b"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Fortaleza Digital",
        "Ano publicação" : "1998"
    }
}

/* 7 */
{
    "_id" : ObjectId("618ab7ea9fea74c97314b24e"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Ponto de Impacto",
        "Ano publicação" : "2001"
    }
}

/* 8 */
{
    "_id" : ObjectId("618ab7fa9fea74c97314b251"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "Diário da Sibila Rubra, O Retorno das Bruxas",
        "Ano publicação" : "2008"
    }
}

/* 9 */
{
    "_id" : ObjectId("618ab8059fea74c97314b254"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "O Clube dos Imortais",
        "Ano publicação" : "2013"
    }
}

/* 10 */
{
    "_id" : ObjectId("618ab8129fea74c97314b25c"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "O Mistério do Rio das Rosas Brancas",
        "Ano publicação" : "2012"
    }
}

/* 11 */
{
    "_id" : ObjectId("618ab8199fea74c97314b25f"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "Eterno Castigo",
        "Ano publicação" : "2014"
    }
}

/* 12 */
{
    "_id" : ObjectId("618ab8239fea74c97314b262"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Vendedor de Sonhos: O Chamado",
        "Ano publicação" : "2008"
    }
}

/* 13 */
{
    "_id" : ObjectId("618ab82d9fea74c97314b265"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Semeador de Ideias",
        "Ano publicação" : "2011"
    }
}

/* 14 */
{
    "_id" : ObjectId("618ab8369fea74c97314b268"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Vendedor de Sonhos e a Revolução dos Anônimos",
        "Ano publicação" : "2009"
    }
}

/* 15 */
{
    "_id" : ObjectId("618ab8459fea74c97314b26d"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "Prisioneiros da Mente, Os Cárceres Mentais",
        "Ano publicação" : "2018"
    }
}

/* 16 */
{
    "_id" : ObjectId("618ab84c9fea74c97314b272"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "A Ditadura da Beleza e a Revolução das Mulheres",
        "Ano publicação" : "2005"
    }
}

/* 17 */
{
    "_id" : ObjectId("618ab8579fea74c97314b275"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Mestre dos Mestres. Jesus, o maior educador da história",
        "Ano publicação" : "2011"
    }
}

/* 18 */
{
    "_id" : ObjectId("618ab85f9fea74c97314b278"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "Inteligência Socioemocional",
        "Ano publicação" : "2019"
    }
}

/* 19 */
{
    "_id" : ObjectId("618ab8689fea74c97314b27b"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "A Sombra do Vento - O Cemitério dos Livros Esquecidos #01",
        "Ano publicação" : "2007"
    }
}

/* 20 */
{
    "_id" : ObjectId("618ab8709fea74c97314b27e"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Jogo do Anjo - O Cemitério dos Livros Esquecidos #2",
        "Ano publicação" : "2008"
    }
}

/* 21 */
{
    "_id" : ObjectId("618ab8799fea74c97314b285"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Prisioneiro do Céu - O Cemitério dos Livros Esquecidos #3",
        "Ano publicação" : "2012"
    }
}

/* 22 */
{
    "_id" : ObjectId("618ab8819fea74c97314b28a"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Labirinto dos Espíritos - O Cemitério dos Livros Esquecidos #4",
        "Ano publicação" : "2017"
    }
}

/* 23 */
{
    "_id" : ObjectId("618ab88b9fea74c97314b290"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "Marina",
        "Ano publicação" : "2011"
    }
}

/* 24 */
{
    "_id" : ObjectId("618ab8949fea74c97314b293"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Príncipe da Névoa - Trilogia da Névoa #1",
        "Ano publicação" : "2013"
    }
}

/* 25 */
{
    "_id" : ObjectId("618ab89c9fea74c97314b296"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Palácio da Meia-noite - Trilogia da Névoa #2",
        "Ano publicação" : "2013"
    }
}

/* 26 */
{
    "_id" : ObjectId("618ab8a59fea74c97314b299"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "As Luzes de Setembro - Trilogia da Névoa #3",
        "Ano publicação" : "2013"
    }
}

/* 27 */
{
    "_id" : ObjectId("618ab8ae9fea74c97314b29c"),
    "Livro" : {
        "Autor" : "Mari Scotti",
        "Nome do livro" : "Hibrida - Série neblina e escuridão #1",
        "Ano publicação" : "2013"
    }
}

/* 28 */
{
    "_id" : ObjectId("618ab8b69fea74c97314b29f"),
    "Livro" : {
        "Autor" : "Mari Scotti",
        "Nome do livro" : "Guardião - Série neblina e escuridão #2",
        "Ano publicação" : "2015"
    }
}

/* 29 */
{
    "_id" : ObjectId("618ab8bf9fea74c97314b2a4"),
    "Livro" : {
        "Autor" : "Mari Scotti",
        "Nome do livro" : "Rainha - Série neblina e escuridão #3",
        "Ano publicação" : "2017"
    }
}
```



### Consulta ordenada, limitar :

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\ordemlimit.JPG)



```
/* 1 */
{
    "_id" : ObjectId("618ab84c9fea74c97314b272"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "A Ditadura da Beleza e a Revolução das Mulheres",
        "Ano publicação" : "2005"
    }
}

/* 2 */
{
    "_id" : ObjectId("618ab8239fea74c97314b262"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Vendedor de Sonhos: O Chamado",
        "Ano publicação" : "2008"
    }
}

/* 3 */
{
    "_id" : ObjectId("618ab85f9fea74c97314b278"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "Inteligência Socioemocional",
        "Ano publicação" : "2019"
    }
}

/* 4 */
{
    "_id" : ObjectId("618ab8579fea74c97314b275"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Mestre dos Mestres. Jesus, o maior educador da história",
        "Ano publicação" : "2011"
    }
}

/* 5 */
{
    "_id" : ObjectId("618ab8369fea74c97314b268"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Vendedor de Sonhos e a Revolução dos Anônimos",
        "Ano publicação" : "2009"
    }
}

/* 6 */
{
    "_id" : ObjectId("618ab8459fea74c97314b26d"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "Prisioneiros da Mente, Os Cárceres Mentais",
        "Ano publicação" : "2018"
    }
}

/* 7 */
{
    "_id" : ObjectId("618ab82d9fea74c97314b265"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Semeador de Ideias",
        "Ano publicação" : "2011"
    }
}

/* 8 */
{
    "_id" : ObjectId("618ab8799fea74c97314b285"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Prisioneiro do Céu - O Cemitério dos Livros Esquecidos #3",
        "Ano publicação" : "2012"
    }
}

/* 9 */
{
    "_id" : ObjectId("618ab8709fea74c97314b27e"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Jogo do Anjo - O Cemitério dos Livros Esquecidos #2",
        "Ano publicação" : "2008"
    }
}

/* 10 */
{
    "_id" : ObjectId("618ab8689fea74c97314b27b"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "A Sombra do Vento - O Cemitério dos Livros Esquecidos #01",
        "Ano publicação" : "2007"
    }
}
```



### Consulta ordenada e classificar :

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\ordenadaclassificada.JPG)

```
/* 1 */
{
    "_id" : ObjectId("618ab7e09fea74c97314b24b"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Fortaleza Digital",
        "Ano publicação" : "1998"
    }
}

/* 2 */
{
    "_id" : ObjectId("618ab79f9fea74c97314b237"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Anjos e demônios",
        "Ano publicação" : "2000"
    }
}

/* 3 */
{
    "_id" : ObjectId("618ab7ea9fea74c97314b24e"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Ponto de Impacto",
        "Ano publicação" : "2001"
    }
}

/* 4 */
{
    "_id" : ObjectId("618ab7af9fea74c97314b23b"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "O Código da Vinci",
        "Ano publicação" : "2003"
    }
}

/* 5 */
{
    "_id" : ObjectId("618ab84c9fea74c97314b272"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "A Ditadura da Beleza e a Revolução das Mulheres",
        "Ano publicação" : "2005"
    }
}

/* 6 */
{
    "_id" : ObjectId("618ab8689fea74c97314b27b"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "A Sombra do Vento - O Cemitério dos Livros Esquecidos #01",
        "Ano publicação" : "2007"
    }
}

/* 7 */
{
    "_id" : ObjectId("618ab8239fea74c97314b262"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Vendedor de Sonhos: O Chamado",
        "Ano publicação" : "2008"
    }
}

/* 8 */
{
    "_id" : ObjectId("618ab8709fea74c97314b27e"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Jogo do Anjo - O Cemitério dos Livros Esquecidos #2",
        "Ano publicação" : "2008"
    }
}

/* 9 */
{
    "_id" : ObjectId("618ab7fa9fea74c97314b251"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "Diário da Sibila Rubra, O Retorno das Bruxas",
        "Ano publicação" : "2008"
    }
}

/* 10 */
{
    "_id" : ObjectId("618ab8369fea74c97314b268"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Vendedor de Sonhos e a Revolução dos Anônimos",
        "Ano publicação" : "2009"
    }
}

/* 11 */
{
    "_id" : ObjectId("618ab7bf9fea74c97314b23e"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "O Símbolo Perdido",
        "Ano publicação" : "2009"
    }
}

/* 12 */
{
    "_id" : ObjectId("618ab82d9fea74c97314b265"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Semeador de Ideias",
        "Ano publicação" : "2011"
    }
}

/* 13 */
{
    "_id" : ObjectId("618ab8579fea74c97314b275"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "O Mestre dos Mestres. Jesus, o maior educador da história",
        "Ano publicação" : "2011"
    }
}

/* 14 */
{
    "_id" : ObjectId("618ab88b9fea74c97314b290"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "Marina",
        "Ano publicação" : "2011"
    }
}

/* 15 */
{
    "_id" : ObjectId("618ab8799fea74c97314b285"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Prisioneiro do Céu - O Cemitério dos Livros Esquecidos #3",
        "Ano publicação" : "2012"
    }
}

/* 16 */
{
    "_id" : ObjectId("618ab8129fea74c97314b25c"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "O Mistério do Rio das Rosas Brancas",
        "Ano publicação" : "2012"
    }
}

/* 17 */
{
    "_id" : ObjectId("618ab8949fea74c97314b293"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Príncipe da Névoa - Trilogia da Névoa #1",
        "Ano publicação" : "2013"
    }
}

/* 18 */
{
    "_id" : ObjectId("618ab89c9fea74c97314b296"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Palácio da Meia-noite - Trilogia da Névoa #2",
        "Ano publicação" : "2013"
    }
}

/* 19 */
{
    "_id" : ObjectId("618ab8059fea74c97314b254"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "O Clube dos Imortais",
        "Ano publicação" : "2013"
    }
}

/* 20 */
{
    "_id" : ObjectId("618ab7ca9fea74c97314b241"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Inferno",
        "Ano publicação" : "2013"
    }
}

/* 21 */
{
    "_id" : ObjectId("618ab8ae9fea74c97314b29c"),
    "Livro" : {
        "Autor" : "Mari Scotti",
        "Nome do livro" : "Hibrida - Série neblina e escuridão #1",
        "Ano publicação" : "2013"
    }
}

/* 22 */
{
    "_id" : ObjectId("618ab8a59fea74c97314b299"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "As Luzes de Setembro - Trilogia da Névoa #3",
        "Ano publicação" : "2013"
    }
}

/* 23 */
{
    "_id" : ObjectId("618ab8199fea74c97314b25f"),
    "Livro" : {
        "Autor" : "Kizzy Ysatis",
        "Nome do livro" : "Eterno Castigo",
        "Ano publicação" : "2014"
    }
}

/* 24 */
{
    "_id" : ObjectId("618ab8b69fea74c97314b29f"),
    "Livro" : {
        "Autor" : "Mari Scotti",
        "Nome do livro" : "Guardião - Série neblina e escuridão #2",
        "Ano publicação" : "2015"
    }
}

/* 25 */
{
    "_id" : ObjectId("618ab8bf9fea74c97314b2a4"),
    "Livro" : {
        "Autor" : "Mari Scotti",
        "Nome do livro" : "Rainha - Série neblina e escuridão #3",
        "Ano publicação" : "2017"
    }
}

/* 26 */
{
    "_id" : ObjectId("618ab7d59fea74c97314b248"),
    "Livro" : {
        "Autor" : "Dan Brown",
        "Nome do livro" : "Origem",
        "Ano publicação" : "2017"
    }
}

/* 27 */
{
    "_id" : ObjectId("618ab8819fea74c97314b28a"),
    "Livro" : {
        "Autor" : "Carlos Ruiz Zafón",
        "Nome do livro" : "O Labirinto dos Espíritos - O Cemitério dos Livros Esquecidos #4",
        "Ano publicação" : "2017"
    }
}

/* 28 */
{
    "_id" : ObjectId("618ab8459fea74c97314b26d"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "Prisioneiros da Mente, Os Cárceres Mentais",
        "Ano publicação" : "2018"
    }
}

/* 29 */
{
    "_id" : ObjectId("618ab85f9fea74c97314b278"),
    "Livro" : {
        "Autor" : "Augusto Cury",
        "Nome do livro" : "Inteligência Socioemocional",
        "Ano publicação" : "2019"
    }
}
```



### Exclusão de documentos:

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\docexcluir.JPG)

![](D:\Google Drive Taisis\Estudo\PAN ACADEMY -Turma 1\Mongobd\Mongodb\Imagens\exclusucesso.jpg)



### Dias 03/11/2021 e 04/11/2021



## Treinamento Java e AWS Cloud!

### #GoGama #OPanEhTech

