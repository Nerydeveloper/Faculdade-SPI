programa
{
	caracter elementos[3][3]
	funcao inicio()
	{
		para(inteiro linha = 0 ; linha < 3 ; linha++){ 
			para(inteiro coluna = 0 ; coluna < 3 ; coluna++){ 
				escreva("Digite um caracter: ")
				leia(elementos[linha][coluna])
				escreva("\n")
				
			}
		}
		para(inteiro linha = 0 ; linha < 3 ; linha++){ 
			para(inteiro coluna = 0 ; coluna < 3 ; coluna++){ 
				se (linha + coluna == 3 - 1) {
                    escreva(elementos[linha][coluna], " ")
                    }
               }
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */