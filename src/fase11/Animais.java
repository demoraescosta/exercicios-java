public class Animais {
    static class Animal {
        String nome;
        int idade;

        Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        void emitirSom() {
            System.out.println("?????????");
        }

        void exibirInfo() {
            System.out.println("nome: " + nome + ", idade: " + idade);
        }
    }

    static class Cachorro extends Animal {
        Cachorro(String nome, int idade) {
            super(nome, idade);
        }

        @Override
        void emitirSom() {
            System.out.println("auau");
        }
    }

    static class Gato extends Animal {
        Gato(String nome, int idade) {
            super(nome, idade);
        }

        @Override
        void emitirSom() {
            System.out.println("miau");
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("miau", 528474293);
        Gato gato = new Gato("josué", 3);

        System.out.println("cachorro:");
        cachorro.exibirInfo();
        cachorro.emitirSom();

        System.out.println("\ngato:");
        gato.exibirInfo();
        gato.emitirSom();
    }
}
