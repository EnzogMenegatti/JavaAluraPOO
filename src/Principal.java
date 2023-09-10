public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Senhor dos Anéis";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinuto = 130;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(6);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.pegaMedia());
    }
}
