#EXEMPLOS


#EXEMPLO 01

num = 2
#Neste exemplo, a variável num é igual a 2. O programa verifica se num é maior que 10. 

if num > 10:
    print("Número maior que 10.")
else:
    print("Número menor que 10")

#Como 2 não é maior que 10, ele imprime "Número menor que 10". Isso ocorre porque o bloco
# de código após o else é executado quando a condição do if é falsa.



#EXEMPLO 2

media = 4

# Neste exemplo, a variável media é igual a 4. O programa verifica várias condições em cascata. 
# Primeiro, ele verifica se media está entre 7 (inclusive) e 10 (exclusive). Se essa condição
# não for atendida, ele verifica se media está entre 4 (inclusive) e 7 (exclusive). Finalmente, 
# se nenhuma das condições anteriores for atendida, ele executa o bloco de código dentro do else.

if media > 7 and media <= 10:
    print("Aluno aprovado.")
elif media < 7 and media >= 4:
    print("Aluno em recuperação")
else:
    print("Aluno reprovado!")

#Dado que media é igual a 4, ele atende à segunda condição (4 está entre 4 e 7), e o programa imprime "Aluno em recuperação".