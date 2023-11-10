programa
{
	inteiro elementos[3][2]
	inteiro mutiplo
	
	
	funcao inicio()
	{
		para(inteiro linha = 0 ; linha < 3 ; linha++){ 
			para(inteiro coluna = 0 ; coluna < 2 ; coluna++){ 
				escreva("Digite um numero: ")
				leia(elementos[linha][coluna])
			}
		}
		para(inteiro linha = 0 ; linha < 3 ; linha++){ 
			para(inteiro coluna = 0 ; coluna < 2 ; coluna++){ 
				
				se(elementos[linha][coluna]%3 ==0 ){ 
					elementos[linha][coluna] = 1
				}
				
			}
		}
		para(inteiro linha = 0 ; linha < 3 ; linha++){ 
			para(inteiro coluna = 0 ; coluna < 2 ; coluna++){ 
				escreva(elementos[linha][coluna]," - ")
			}
			
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */