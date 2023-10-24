programa
{
	//Tipos de Variaveis
	cadeia Cadeia = "É uma palavra ou frase"
	caracter Caracter = 'a'
	inteiro Inteiro = 10 // número inteiro
	real Real = 10.0 // número com ponto flutuante

	/*Lembrando que vc pode instanciar uma variavel e deixar 
	pra colocar um valor nela futuramente.
	Como tambem tu pode instanciar ela e já atribuir um valor
	*/
	
	funcao inicio()
	{
		//Exemplos
		cadeia palavra
		escreva("Digite uma palavra: ")
		leia(palavra)
		escreva("Você digitou: ", palavra, "\n")
		
		caracter letra
		escreva("Digite uma letra: ")
		leia(letra)
		escreva("Você digitou: ", letra, "\n")

		inteiro numeroInteiro
		escreva("Digite um número: ")
		leia(numeroInteiro)
		escreva("Você digitou o número: ", numeroInteiro, "\n")
		
		real numeroReal
		escreva("Digite um número: ")
		leia(numeroReal)
		escreva("Você digitou o número: ", numeroReal, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 870; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */