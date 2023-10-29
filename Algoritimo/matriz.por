programa
{
	
	inteiro matriz[3][3] //Declara uma matriz de inteiros 3x3 chamada "matriz."
	
	funcao inicio()
	{
/**
* O primeiro loop para aninhado é usado para preencher a matriz com valores. Ele utiliza duas variáveis de loop, 
* l para as linhas e c para as colunas, e um loop duplo para iterar sobre todas as posições na matriz.
*/
		para(inteiro l = 0 ; l < 3 ; l++){ 
			para(inteiro c =0; c<3; c++){ 
				escreva("Digite um valor para a linha ",l," e coluna ", c ,": ")
				leia(matriz[l][c])
				escreva("\n")
				
			}
		}


		para(inteiro l = 0 ; l < 3 ; l++){ 
			para(inteiro c =0; c<3; c++){ 
/**
* A condição se (l + c == 3 - 1) verifica se a soma das variáveis de linha l e coluna c é igual a 3 - 1, 
* o que é uma maneira de verificar se estamos na diagonal principal (a diagonal principal é onde a linha é igual à coluna).
*/
				se(l+c == 3-1){ 
					escreva(matriz[l][c],",")
				}
				
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
