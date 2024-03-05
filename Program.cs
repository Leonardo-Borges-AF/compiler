using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Grammar; // Importa a gramática definida
using Interpreter.Lang; // Importa as classes do interpretador da linguagem

internal class Program
{
    private static void Main(string[] args)
    {
        //LEXER
        //### input
        var inputStream = new AntlrFileStream("input.lang"); // Cria um fluxo de entrada baseado no arquivo "input.lang"
        //var inputStream = new AntlrFileStream(args[0]); // Poderia ler o nome do arquivo a ser processado a partir dos argumentos de linha de comando
        //### lexer
        var lexer = new LangLexer(inputStream); // Instancia o lexer "LangLexer" com o fluxo de entrada fornecido

        //PARSER
        //### tokens
        var tokenStream = new BufferedTokenStream(lexer); // Cria um fluxo de tokens baseado no lexer
        //### parser
        var parser = new LangParser(tokenStream); // Instancia o parser "LangParser" com o fluxo de tokens fornecido

        //### error listener
        var errorListener = new LangErrorListener(); // Cria um ouvinte de erros personalizado
        parser.RemoveErrorListeners(); // Remove os ouvintes de erro padrão
        parser.AddErrorListener(errorListener); // Adiciona o ouvinte de erro personalizado ao parser
        //### error handling
        //parser.ErrorHandler = new BailErrorStrategy(); // Estratégia de tratamento de erros - poderia ser outra estratégia
        parser.ErrorHandler = new DefaultErrorStrategy(); // Define uma estratégia de tratamento de erros padrão

        //### semantic listener
        var semanticListener = new SemanticLangListener(); // Cria um ouvinte de análise semântica personalizado
        parser.RemoveParseListeners(); // Remove os ouvintes de análise sintática padrão
        parser.AddParseListener(semanticListener); // Adiciona o ouvinte de análise semântica personalizado ao parser

        //### parse
        IParseTree? tree = null;
        try
        {
            tree = parser.prog(); // Inicia a análise da entrada usando a regra de produção "prog" definida na gramática. Isso gera uma árvore de análise sintática
            if (errorListener.HasErrors){
                Console.WriteLine("Errors!"); // Exibe uma mensagem se houver erros léxicos ou sintáticos
                errorListener.ErrorMessages.ForEach(e => Console.WriteLine(e)); // Exibe cada mensagem de erro
                tree = null; // Define a árvore como nula para indicar que houve erros
            }
            if (semanticListener.HasErrors){
                Console.WriteLine("Semantic Errors!"); // Exibe uma mensagem se houver erros semânticos
                semanticListener.ErrorMessages.ForEach(e => Console.WriteLine(e)); // Exibe cada mensagem de erro semântico
                tree = null; // Define a árvore como nula para indicar que houve erros
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e); // Exibe qualquer exceção que ocorra durante o processo de análise
        }

       // Console.WriteLine("##### FUNCTIONS");
       // semanticListener.Functions.Keys.ToList().ForEach(f => Console.WriteLine(f));

        //### execute
        if (tree != null)
        {
            var interpreter = new LangInterpreter(semanticListener.Functions); // Cria um interpretador com as funções definidas durante a análise semântica
            interpreter.Visit(tree); // Executa o interpretador visitando a árvore de análise sintática
        }
    }
}
