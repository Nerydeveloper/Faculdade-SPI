programa
{
	/**
	 * você pode trabalhar com vetores, que são estruturas de dados 
	 * que permitem armazenar um conjunto de valores do mesmo tipo. 
	 * Aqui está um exemplo de como você pode declarar, preencher e 
	 * acessar elementos de um vetor em Portugol Studio
	 */
	 
	funcao inicio()
	{
		//EXEMPLO 
		//Declara um vetor chamado "vetor" com 3 elementos do tipo cadeia (string).
		cadeia vetor[3] 
		//Usa um loop "para" para iterar de 0 a 2, permitindo que o usuário insira três nomes.

		//No primeiro loop "para", solicita ao usuário que insira um nome para 
		//cada posição do vetor e armazena o nome nessa posição.
		para(inteiro i=0; i <=2; i++){
			escreva("Insira o ", i+1,"º" , " nome: ")
			leia(vetor[i])
		}
		

		//Em seguida, usa outro loop "para" para exibir os nomes 
		//que o usuário inseriu.
		para(inteiro i = 0; i<3 ; i++){ 
			escreva(vetor[i],"\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */