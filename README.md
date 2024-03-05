# Compilador ANTLR

# Introdução
O compilador é um programa que transforma um código fonte em uma linguagem de programação para um programa executável. Ele é composto por vários componentes, como o analisador léxico, analisador sintático, gerador de código e otimizador de código. O objetivo do compilador é garantir que o programa esteja correto e possa ser executado de forma eficiente.

# Como compilar e executar o compilador
Para compilar o compilador, siga os seguintes passos:

1. Clone o repositório do Github `https://github.com/Leonardo-Borges-AF/compiler.git`
2. Abra um terminal e navegue até o diretório raiz do projeto.
3. Digite o comando `ant jar` para gerar o arquivo JAR do compilador.
Para executar o compilador, digite o comando `java -jar antlr4-4.9.2-complete.jar -Dlanguage=CSharp -visitor -package Grammar -o Grammar Lang.g4` no terminal. Onde nome_do_arquivo_de_entrada é o nome do arquivo que contém o código fonte da linguagem definida pela gramática do compilador.

# Exemplos

comentário de código
```
/* 
regra para comentarios em bloco
*/

// regra para comentarios em linha
```
atribuicao de variaveis
```
int x = 1;
write x;
double y = 1.5;
write y;
string z = "tentativa";
write z;
boolean b = true;
write b;
```
entrada de dados
```
read x2 int;
write x2;
read y2 double;
write y2;
read z2 string;;
write z2;
read b2 boolean;
write b2;
```

calculos matemáticos
```
int x3 = 2 + 2;
write x3;
int y3 = 2.5 - 2.1;
write y3;
int z3 = 2 * 2;
write z3;
int a3 = 7 / 2;
write a3;
int b3 = 2 + 2 + 2;
write b3;
int c3 = ( 2 + 2.5 ) * 2;
write c3;
```
atribuir valor a uma variavel existente
```
int x4 = 2;
x4 += 1;
write f"teste_int contém valor ${x4}";
x4 -= 1;
write f"teste_int contém valor ${x4}";
x4 *= 3;
write f"teste_int contém valor ${x4}";
```
IF e IF ELSE
```
int teste_int = 11;
if(teste_int > 10) {
    write "IF teste_int é maior que 10";
}else{
    write "IF teste_int NÃO é maior que 10";
}
```
laço de repetição FOR
```
int teste_int = 2;
for(teste_int;teste_int < 20;teste_int += 1) {
    write f"FOR ${teste_int}";
};
```
laço de repetição WHILE
```
int teste_int = 2;
while (teste_int < 10) {
    write f"WHILE teste_int: ${teste_int}";
    teste_int += 2;
};
```
condição ternaria
```
int teste_int = 11;
teste_int > 10 ? " é maior que 10" : "Tmenor que 10";
```
array
```
array <string> teste1 = ["1","2","3"];
write teste1;
write teste1[0];
array <int> teste2 = [1,2,3];
write teste2;
write teste2[1];
array <double> teste3 = [1.4,2.2,3.3];
write teste3;
write teste3[2];
```

# Conclusão
```
O desenvolvimento de um compilador utilizando a ferramenta ANTLR e a linguagem Java provou ser uma
experiência valiosa. O estudo demonstrou a viabilidade da ANTLR como ferramenta para a construção
de compiladores e forneceu um modelo que pode ser adaptado para a criação de compiladores para 
outras linguagens de programação. As contribuições deste estudo podem ser úteis para a
comunidade de pesquisa em compiladores e para o desenvolvimento de ferramentas de software para
linguagens de programação.
```
:smiley: 🏆 :smiley: 
