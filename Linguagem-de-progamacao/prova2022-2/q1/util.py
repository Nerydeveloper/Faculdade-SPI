import json

def menu():
    print("1 - Cadastrar livro\n2 - Editar livro\n3 - Excluir livro\n4 - Localizar livro\n5 - Gerar Relatório HTML")

def html(lista):
    with open("main.html","w") as file:
        file.write("<!DOCTYPE html>")
        file.write('<html lang="pt-br">')
        file.write("<head>")
        file.write("<title>Document</title>")
        file.write("</head>")
        file.write("<body>")

        file.write(f"{lista}")

        file.write("</body>")
        file.write("</html>")
        

def abrirArquivo():
    #No meu vscode ele esta salvando o arquivo dados.json em um diretorio antes por isso utilizei o ./
    with open("./dados.json","r") as file:
        dadosJ = file.readline()
        dados = json.loads(dadosJ)
        return dados
       
    


    

