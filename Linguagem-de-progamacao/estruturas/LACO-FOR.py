#O FOR REQUER UM ELEMENTO QUE ESTAR CONTIDO NO CONJUNTO


#PRIMEIRO EXEMPLO
for i in range(10):
    print(i)


#SEGUNDO EXEPLO
lista = [1,2,3,4]

for i in lista:
    if i == 1:
        print(i)


#TERCEIRO EXEPLO
dic = {'nome':['adrian','agostinha']}

#AQUI O VALOR DO I SERÁ A CHAVE 'NOME'
for i in dic:
    print(i)

#AQUI O VALOR DO I SERÁ OS VALORES DA CHAVE MENCIONADA
for i in dic['nome']:
    print(i)

#AQUI MANDAMOS ELE PERCORRER OS VALORES DA CHAVE NOME, E DEPOIS FAZER UMA SELEÇÃO.
for i in dic['nome']:
    if i == 'adrian':
        print(i)

#AQUI PEGAMOS O INDICE DE UM ELEMENTO DENTRO DE UMA LISTA PASSANDO COMO PARAMETRO O VALOR QUE DESEJAMOS BUSCAR
for i in dic['nome']: 
    indice  = dic['nome'].index('agostinha')
    print(indice)