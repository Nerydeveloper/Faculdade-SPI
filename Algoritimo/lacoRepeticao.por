programa
{
	
/*
	* Laços de repetição
	* --para
	* --enquanto
	* --faca enquanto
	 */
	funcao inicio()
	{
		//EXEMPLOS
		//EX.:
		para(inteiro i=0; i < 10; i++){
			escreva("Vale ",i)
		}
		
		//EX.:
		inteiro variavel = 0
		enquanto(variavel<10){
			escreva("Variavel vale ",variavel,"\n")
			se(variavel == 9){
				escreva("Vou parar...\n")
			}
			variavel++

		}

		//EX.:
		faca{
			escreva("Olá mundo! -- ")
			variavel++
		}enquanto(variavel<15)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */