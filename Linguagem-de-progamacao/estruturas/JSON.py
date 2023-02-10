#O JSON SERVE PARA PERSISTENCIA DE DADOS

import json

dic = {'nome': 'nery',
        'jogo':1234567}

#CONVERTENDO DICIONARIO EM JSON
dicJson = json.dumps(dic)

print("Este é no formato json: ", dicJson)
print(type(dicJson))

#MANIPULANDO DADOS NO FORMATO JSON
#OS DADOS JSON VEM NO FORMATO DE STRINGS, ENTÃO CASO VOCÊ QUEIRA TRABALHAR COM ELES TERÁ 
# QUE CONVERTELOS PARA DICIONARIOS EM PYTHON


#CONVERTENDO JSON EM DICIONARIO

dic = json.loads(dicJson)

print("Este é o formato dicionario python: ", dic)

print(dic['nome'])