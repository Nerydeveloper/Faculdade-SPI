programa
{
	
	inteiro matriz[3][3]
	
	funcao inicio()
	{
		para(inteiro l = 0 ; l < 3 ; l++){ 
			para(inteiro c =0; c<3; c++){ 
				escreva("Digite um valor para a linha ",l," e coluna ", c ,": ")
				leia(matriz[l][c])
				escreva("\n")
				
			}
		}
		para(inteiro l = 0 ; l < 3 ; l++){ 
			para(inteiro c =0; c<3; c++){ 
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