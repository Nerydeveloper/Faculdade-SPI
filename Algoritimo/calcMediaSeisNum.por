programa
{
	
	inteiro vetor[6]
	inteiro num
	real soma = 0.0
	real media
	funcao inicio()
	{
	para(inteiro i = 0; i < 6; i++){ 
		escreva("Digite um numero: ")
		leia(num)
		vetor[i] = num
		soma = soma + num
		
	}
	
		media = soma / 6
		escreva("A media é: ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 63; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */