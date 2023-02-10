#1) (6,0) Crie uma aplicação para cadastrar livros que o usuário leu em um arquivo JSON. A aplicação deverá oferecer as seguintes opções através de um menu:
import util as util,json
lista = []

opc = int(input("Digite o numero da opção: "))

#CADASTRO
if opc == 1:
    while True:
        livro = input("Digite o nome do livro: ")
        lista.append(livro)
        if livro == '':
            del lista[-1]
            with open("dados.json","w") as file:
                listaJson = json.dumps(lista)
                file.write(listaJson)
            break

#EDITAR
elif opc ==2:
    
    dados = util.abrirArquivo()
    for i in dados:
        lista.append(i)
    livro = input("Digite o nome do livro que deseja editar: ")
    indice = lista.index(livro)
    novoLivro = input("Digite o nome do livro: ")
    lista[indice] = novoLivro
    with open("dados.json","w") as file:
        listaJson = json.dumps(lista)
        file.write(listaJson)






#EXCLUIR
elif opc ==3:
    dados = util.abrirArquivo()
    for i in dados:
        lista.append(i)
    livro = input("Digite o nome do livro que deseja excluir: ")
    indice = lista.index(livro)
    del lista[indice]
    with open("dados.json","w") as file:
        listaJson = json.dumps(lista)
        file.write(listaJson)

#LOCALIZAR
elif opc ==4:
    dados = util.abrirArquivo()
    livro = input("Digite o nome do livro que deseja localizar: ")
    if livro in dados:
        print(livro)
    else:
        print("Livro não encontrado.")

#GERAR RELATORIO
elif opc ==5:
    util.html(lista)
    
else:
    print("opção invalida!")