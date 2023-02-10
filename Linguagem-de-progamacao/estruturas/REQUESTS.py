#O METODO REQUESTS SERVE PRA PEGAR DADOS DA API

#NORMALMENTE VOCÊ TERÁ QUE BAIXAR ESSE METODO
#PARA ISSO VA AO TERMINAL E DIGITE 'pip install requests'

#DEPOIS É SO IMPORTAR
import requests

url = "link da api"

resposta = requests.get(url)

print(resposta)

#DEVE retornar '200' como resposta de sucesso da sua requisição

print(resposta.text)