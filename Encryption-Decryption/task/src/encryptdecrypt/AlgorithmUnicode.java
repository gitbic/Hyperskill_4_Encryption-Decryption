package encryptdecrypt;

class AlgorithmUnicode extends AlgorithmMethod {

    @Override
    String encryptString(String inputString, int shift) {
        StringBuilder sb = new StringBuilder();
        for (char ch : inputString.toCharArray()) {
            sb.append((char) (ch + shift));
        }
        return sb.toString();
    }

    @Override
    String decryptString(String inputString, int shift) {
        StringBuilder sb = new StringBuilder();
        for (char ch : inputString.toCharArray()) {
            sb.append((char) (ch - shift));
        }
        return sb.toString();
    }
}
