programa
{

	
/*
	* BIBLIOTECA DO PORTUGOL
	* Tem varias funções que tu pode usar para manipular dados e facilitar 
	* teu trabalho na hora de codificar.
	* Demonstrarei alguns reculsos da biblioteca;
	* ( Texto, Util, Matematica )
	 */
	 
	 //Devemos importalas
	 
	inclua biblioteca Texto
	inclua biblioteca Util
	inclua biblioteca Matematica
	 
	funcao inicio()
	{
		cadeia cad = "adrian"
		escreva("Antes da função: ", cad,"\n")
	
		escreva("Apois a função: ",Texto.caixa_alta(cad),"\n")
		escreva("Numero de caracteres: ",Texto.numero_caracteres(cad),"\n")
		inteiro numSorteado = Util.sorteia(1, 10)
		
		escreva("Número: ",numSorteado,"\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 605; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */