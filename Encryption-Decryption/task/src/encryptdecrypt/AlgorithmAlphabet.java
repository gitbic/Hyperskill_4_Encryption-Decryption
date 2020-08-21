package encryptdecrypt;

class AlgorithmAlphabet extends AlgorithmMethod {

    @Override
    String encryptString(String inputString, int shift) {
        StringBuilder sb = new StringBuilder();
        int chCount = 26;
        for (char ch : inputString.toCharArray()) {
            if (ch == ' ' || ch == '!') {
                sb.append(ch);
            } else {
                int startPos = ch < 'a' ? 'A' : 'a';
                sb.append((char) ((ch - startPos + shift) % chCount + startPos));
            }
        }
        return sb.toString();
    }

    @Override
    String decryptString(String inputString, int shift) {
        StringBuilder sb = new StringBuilder();
        int chCount = 26;
        for (char ch : inputString.toCharArray()) {
            if (ch == ' ' || ch == '!') {
                sb.append(ch);
            } else {
                int startPos = ch < 'a' ? 'A' : 'a';
                sb.append((char) (startPos + (chCount + ch - (shift + startPos)) % chCount));
            }
        }
        return sb.toString();
    }
}
