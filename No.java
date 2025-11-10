public class No {
    int numero;
    No proximo;

    public No(int numero) {
        this.numero = numero;
        this.proximo = null;
    }

    public static void main(String[] args) {
        No primeiroNo = new No(5);
        No segundoNo = new No(10);
        No terceiroNo = new No(15);

        primeiroNo.proximo = segundoNo;
        segundoNo.proximo = terceiroNo;

        System.out.println("O número do primeiro nó é: " + primeiroNo.numero);
        System.out.println(" O número do segundo nó é: " + primeiroNo.proximo.numero);
        System.out.println("O número do terceiro nó é:" + terceiroNo.numero);
    }
}
