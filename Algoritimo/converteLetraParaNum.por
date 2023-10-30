programa
{

	caracter vetor[10]
	caracter letra
	funcao inicio()
	{
		para(inteiro i = 0 ; i < 10 ; i++){ 
			escreva("Digite a ", i+1,"º letra: ")
			leia(letra)
			vetor[i] = letra
			
		}
		para( inteiro i = 0 ; i < 10 ; i++){ 
			escolha(vetor[i]){
			caso 'a': vetor[i] = '1'
			pare
			caso 'e': vetor[i] = '2'
			pare
			caso 'i': vetor[i] = '3'
			pare
			caso 'o': vetor[i] = '4'
			pare
			caso 'u': vetor[i] = '5'
			pare
		
		}
			
		}
		para(inteiro j = 0 ; j < 10 ; j++){
				escreva(vetor[j])
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */