## Estrutura de dados - Tipos e conceitos

### TIPOS
*   MATRIZES e ARRAYS
*   FILAS
*   LISTAS
*   PILHAS
*   ARVORES
*   GRAFOS
*   TABELAS DE HASH


### Algumas estruturas possuem duas formas de implementação
    
* Estatica e Dinamica

A implementação estatica não permite alterações após a implementação, enquanto a implementação dinamica permite.
Ou seja, enquanto no estatico se você determina uma capacidade 10 de elementos, só será permitido a inserção de 10 elementos dentro da estrutura.
Já no dinamico, você pode ou não inicia-lá com um tamanho pré-determinado e também pode aumentar ou reduzir a capacidade de elementos da estrutura a depender da sua nescessidade.

Algumas estruturas permitem o acesso aos elementos atravez de referencias. São chamadas de encadeamento ( No ). 
OBS.: Podemos usar esse conceito para as estruturas ( Lista, Fila e Pilhas ) porém não faz sentido usar para Fila e Pilha para adicionar ou remover pois Fila e Pilha possuem conceitos expecificos de FIFO( first in fisrt out ) LIFO ( last in first out ).

### Existe o encadeamento simples e duplo.

No encadeamento simples o " No " possue o elemento e a referencia para o próximo " No ". Já no encadeamento duplo,o " No " possue por sua vez, o elemento, a referencia do " No " anterior e a referencia para o próximo No.


### Listas: 
Uma lista é uma estrutura de dados que organiza elementos de forma linear, onde cada elemento é ligado ao próximo por meio de referências ou ponteiros. A ordem dos elementos em uma lista é importante e geralmente mantida na ordem em que foram inseridos. Listas podem ser implementadas de várias maneiras, como listas encadeadas, listas duplamente encadeadas, e arrays (ou listas estáticas).



### Filas: 
Estruturas que seguem o princípio "FIFO" (First In, First Out), onde o primeiro elemento inserido é o primeiro a ser removido. É comum em situações de processamento em ordem.

### Pilhas: 
Estruturas que seguem o princípio "LIFO" (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. É comum em situações de processamento em ordem inversa.




### Arrays: 
Estruturas que armazenam elementos em posições indexadas. As matrizes têm tamanho fixo, enquanto os arrays podem ter tamanho dinâmico.

OBS.: As estruturas ARVORES, GRAFOS e TABELAS DE HASH não tem explicações pois até o presente momento não possuo conhecimentos nescessorios o bastante para explicalas.