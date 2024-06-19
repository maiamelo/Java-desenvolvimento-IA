public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "B";

        switch (sigla) {
            case "A":
                System.out.println("voce escolheu a letra A");
                break;
            case "B":
                System.out.println("voce escolheu a letra b");
                break;

            case "C":
                System.out.println("voce escolheu a letra c");
                break;

            default:
                System.out.println("voce nao escolheu a letra");
                break;

        }
    }
}
