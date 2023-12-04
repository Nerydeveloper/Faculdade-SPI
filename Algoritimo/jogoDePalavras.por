programa
{
	inclua biblioteca Util
	inclua biblioteca Texto-->txt
	/** ELABORAR UM JOGO DE PERGUNTAS E RESPOSTAS
	 *  ( MUTIPLA ESCOLHA ), UTILIZANDO VETORES PARA ARMAZENAR AS PERGUNTAS
	 *  AS OPÇÕES DE RESPOSTA( 4 ALTERNATIVAS ) E A RESPOSTA CORRETA.
	 *  IMPLEMENTE FUNÇÕES PARA APRESENTAR AS PERGUNTAS E CALCULAR A PONTUAÇÃO
	 *  DA INTERAÇÃO DOS JOGADORES.
	*/

	/** Função mostrarPergunta retorna um valor inteiro e se vc Adicionar o caracter 'S' 
	 *  ele ira escrever a pergunta sorteada mais o seu retorno
	 */
	funcao inteiro mostrarPergunta(caracter op){
		cadeia vetorPerguntas[4] = {"PERGUNTA - 01","PERGUNTA - 02","PERGUNTA - 03","PERGUNTA - 04"} // vetor contendo as perguntas
						
		inteiro indicePergunta = Util.sorteia(0, 3) // adicione aqui o numero referente ao tamanho da lista menos 1
		// Condicional que irar verificar se o parametro informado na função é igual a S
		se(op == 'S'){
			escreva(vetorPerguntas[indicePergunta],"\n") // se for igual a S escreverá a pergunta sorteada
		}

		retorne indicePergunta // Retorna o valor do tipo inteiro referente ao indice da pergunta sorteada
	}
	
	// função para calcular os pontos
	funcao inteiro calcPontuacao(inteiro c){ 
		retorne c++ // toda vez que ela for chamada somará + 1
	}

	funcao inicio()
		
	{
		// Definindo as variaveis que serão usadas no codigo abaixo
		cadeia respCorreta = "" // atribuindo um valor qualquer apenas para poder inicializala
		cadeia resposta
		inteiro pontuacaoTotal = 0 // atribuindo um valor qualquer apenas para poder inicializala


		
		escreva("Deseja participar do jogo de perguntas e respostas? ")
		leia(resposta)
	
		enquanto(resposta == "SIM" ou resposta == "sim" ou resposta == "Sim" ou resposta == "s" ou resposta == "S"){
		
			
			inteiro numeroP = mostrarPergunta('S')
			escolha(numeroP){

			caso 0: escreva("ALTERNATIVA A\n","ALTERNATIVA B\n","ALTERNATIVA C\n","ALTERNATIVA D\n","ALTERNATIVA E\n")
			pare
			caso 1: escreva("ALTERNATIVA A\n","ALTERNATIVA B\n","ALTERNATIVA C\n","ALTERNATIVA D\n","ALTERNATIVA E\n")
			pare
			caso 2: escreva("ALTERNATIVA A\n","ALTERNATIVA B\n","ALTERNATIVA C\n","ALTERNATIVA D\n","ALTERNATIVA E\n")
			pare
			caso 3: escreva("ALTERNATIVA A\n","ALTERNATIVA B\n","ALTERNATIVA C\n","ALTERNATIVA D\n","ALTERNATIVA E\n")
			pare
			caso contrario: escreva("contrario")
			pare
		}

	
		
			cadeia resp
			escreva("Qual a alternativa correta? (A , B , C , D OU E)")
			leia(resp)
			inteiro numero = numeroP

			// Definindo a resposta resta para cada pergunta
			escolha(numero){

			caso 0: respCorreta = "A" // se for a pergunta de indice 0, resposta correta igual a A
			pare
			caso 1: respCorreta = "B" // se for a pergunta de indice 1, resposta correta igual a B
			pare
			caso 2: respCorreta = "C" // se for a pergunta de indice 2, resposta correta igual a C
			pare
			caso 3: respCorreta = "D" // se for a pergunta de indice 3, resposta correta igual a D
			pare

			caso contrario: escreva("contrario")
			pare
		}
		
		cadeia respos = Texto.caixa_alta(resp)
			// Se a resposta tiver correta
			se(respos == respCorreta){ 
				pontuacaoTotal = calcPontuacao(pontuacaoTotal) //incrementa pontos a variavel pontuacaoTotal
				escreva("Parabéns você acertou!!","\n") //informa o usuario que acertou
			}senao{
				escreva("Não foi dessa vez...","\n") //informa ao usuario que errou
			}

			escreva("Deseja jogar novamente? ")
			leia(resposta)
			
			se(resposta == "NÃO" ou resposta == "não" ou resposta == "Não" ou resposta == "n" ou resposta == "N"){
				escreva("Sua pontuação final: ",pontuacaoTotal)
				pare
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3163; 
 * @DOBRAMENTO-CODIGO = [14];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */