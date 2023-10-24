programa
{
	//Condicionais
	/*
	 * As condicionais servem para direcionar o fluxo do codigo para um
	 * determinado caminho a depender de uma resposta do cliente.
	 * as condicionais que temos em Portugol são:
	 * -- se senao
	 * -- se senao se senao
	 * 
	 * ESTRUTURA DO SE SENAO
	 * 
	 * se(CONDICAO){

		}senao{

		}

	 * ESTRUTURA DO SE NAO SE SENAO
	 * se(CONDICAO){

		}senao se(CONDICAO){

		}senao{

		}
	 */
	funcao inicio()
	{
		//EXEMPLOS
		
		//Exemplo 01
		inteiro numero = 2
		se(numero<10){
			escreva("O número é MENOR que 10\n")
		}senao se(numero == 10){
			escreva("O número é IGUAL a 10\n")
		}senao{
			escreva("O número é MAIOR que 10\n")
		}

		//Exemplo 02

		cadeia seuNome = "Seu nome"
		cadeia comparar
		escreva("Digite seu nome: ")
		leia(comparar)

		se(seuNome == comparar){
			escreva("Verdadeiro\n")
		}senao{
			escreva("Falso\n")
		}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */