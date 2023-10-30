programa
{
	inteiro vetor[8]
	inteiro num
	inteiro cont = 0
	funcao inicio()
	{
		para(inteiro i = 0; i < 8; i++){ 
		escreva("Digite um numero: ")
		leia(num)
		vetor[i] = num
		}
		para(inteiro i = 0 ; i < 8 ; i++){ 
			inteiro compara = vetor[i] % 2
			se(compara == 0){
				cont +=1
			}
		}
		escreva("Existe ",cont," números pares no vetor.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 62; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */