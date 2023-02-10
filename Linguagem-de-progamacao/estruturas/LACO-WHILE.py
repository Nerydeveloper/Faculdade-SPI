#O WHILE REQUER UMA CONDIÇÃO QUE SERÁ AVALIADA

#ENQUANTO ESSA CONDIÇÃO FOR VERDADEIRA O LAÇO SE REPETIRAR

#PRIMEIRO EXEMPLO

nome = input("Insira o nome: ")
print("Olá {}".format(nome))
while nome:
    nome = input("Insira o nome: ")
    print("Olá {}".format(nome))


#SEGUNDO EXEMPLO

while True:
    idade = int(input("Digite sua idade: "))
    if idade == 0:
        False
        break


#TERCEIRO EXEMPLO

numero = int(input("Digite um número: "))

while numero <= 10:
    print("O número {} é menor que 10".format(numero))
    break #--> O BREAK SERVE PRA SAIR DO LAÇO