package encryptdecrypt;

class FactoryCryptography {

    AlgorithmMethod getInstance(String algorithm) {
        switch (algorithm) {
            case "shift":
                return new AlgorithmAlphabet();
            case "unicode":
                return new AlgorithmUnicode();
            default:
                return null;
        }
    }
}
