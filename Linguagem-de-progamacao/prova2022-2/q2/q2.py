import requests, json

chave = "4230691cd8d183843ce69539512b39a5"

url = "http://api.openweathermap.org/data/2.5/forecast/daily?lat=44.34&lon=10.99&cnt=7&appid={}".format(chave)

resposta = requests.get(url)

dados = json.loads(resposta)

temperatura = dados[2]['temp']
if temperatura == 0 and temperatura <5:
    print("Vista-se em camadas...") 
elif temperatura == 5 and temperatura < 10:
    print("Mãos pés, cabeça e pescoço...") 
elif temperatura == 10 and temperatura < 15:
    print("O tempo começa a ficar bem frio...") 
elif temperatura == 15 and temperatura < 20:
    print("O treino começa com um pouco de frio...") 
elif temperatura == 20 and temperatura < 25:
    print("Lembre-se: opte por tecidos que permitam a troca de calor...") 
elif temperatura > 25:
    print("Quanto menos melhor") 