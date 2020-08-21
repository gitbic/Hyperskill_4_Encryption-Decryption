package encryptdecrypt;

abstract class AlgorithmMethod {

    abstract String encryptString(String inputString, int shift);

    abstract String decryptString(String inputString, int shift);

    void getCryptingString(Arguments arguments) {

        String cryptography = arguments.getCryptography();
        String inputString = arguments.getInputString();
        int shift = arguments.getShift();

        String str = "";
        switch (cryptography) {
            case "enc":
                str = encryptString(inputString, shift);
                break;
            case "dec":
                str = decryptString(inputString, shift);
                break;
            default:
                str = null;
        }
        arguments.setOutputString(str);
    }
}