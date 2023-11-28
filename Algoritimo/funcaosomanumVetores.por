programa
{
funcao inteiro somaNum(inteiro vet[], inteiro tam)
	{
		inteiro soma=0
		
		para(inteiro i=0; i<tam; i++)
		{
			soma+=vet[i]
		}
		retorne soma
	}

	
	funcao inicio()
	{
		const inteiro tam=5
		inteiro vet[tam]

		para(inteiro i=0; i<tam; i++)
		{
			escreva("digite o número ", i+1, ": ")
			leia(vet[i])

			inteiro soma=somaNum(vet, tam)

			escreva("a soma dos números é: ", soma, "\n")
		}
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */