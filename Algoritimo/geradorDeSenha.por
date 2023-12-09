programa
{
	inclua biblioteca Util --> u

	/**
	Criar uma função no portugol Studio que retorne uma cadeia de caracteres. 
	Ao final, o usuário deve informar quantas senhas vai precisar e o computador 
	vai gerar essa quantidade pedida
	*/

	funcao cadeia gerarSenha(inteiro qntCaracteres){ 
		caracter c[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'} 
		cadeia senha = ""
		para(inteiro i=0 ; i < qntCaracteres; i++){ 
			
			senha += c[u.sorteia(0, 35)]
		}
		
		retorne senha
	}
	funcao inicio()
	{
		inteiro qntSenha
		inteiro qntCaracteres
		escreva("Quer quantas senhas moral ? ")
		leia(qntSenha)
		escreva("De quantos caracteres ? ")
		leia(qntCaracteres)

		para(inteiro i = 0; i < qntSenha; i++){
			escreva(gerarSenha(qntCaracteres),"\n")
		
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */