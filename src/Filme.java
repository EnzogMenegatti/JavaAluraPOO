    public class Filme {
        String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double somaAvaliacao;
        int totalAvaliacao;
        int duracaoEmMinuto;

        void exibeFichaTecnica(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            System.out.println("Duração: " + duracaoEmMinuto + " Minutos.");
        }

        void avalia(double nota){
            somaAvaliacao += nota;
            totalAvaliacao++;
        }

        double pegaMedia(){
            return somaAvaliacao / totalAvaliacao;
        }
    }
