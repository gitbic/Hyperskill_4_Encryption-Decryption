package encryptdecrypt;

public class Main {
    static void main(String[] args) {

        Arguments arguments = new Arguments();
        arguments.setArguments(args);

        FileStringIO fileStringIO = new FileStringIO(arguments);
        fileStringIO.readString();

        FactoryCryptography factoryCryptography = new FactoryCryptography();
        AlgorithmMethod algorithmMethod = factoryCryptography.getInstance(arguments.getAlgorithm());
        algorithmMethod.getCryptingString(arguments);

        fileStringIO.writeString();
    }
}
