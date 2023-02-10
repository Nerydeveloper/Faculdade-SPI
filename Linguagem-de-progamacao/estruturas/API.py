#API NADA MAIS É QUE UM BANCO DE DADOS ONDE PODEMOS FAZER REQUISIÇÕES PARA PEGAR DADOS DELA

#NORMALMENTE PODEMOS FAZER UMA SOLICITAÇÃO A API ATRAVEZ DE LINKS

url = ("adicione aqui o link da api")




#ALGUMAS APIS PRECISAM DE AUTORIZAÇÃO

chave = "adicione aqui sua chave de ascesso."

url = "https://apiloterias.com.br/app/resultado?&token={}".format(chave)



#ALGUMAS APIS PODEM RECEBER PARAMETROS DE BUSCA

chave = "adicione aqui sua chave de ascesso."
concurso = 1232
nomeLoteria = "megasena"

url = "https://apiloterias.com.br/app/resultado?",
"loteria={}&token={}&concurso={}".format(nomeLoteria,chave,concurso)
