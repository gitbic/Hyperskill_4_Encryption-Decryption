package encryptdecrypt;

class Arguments {
    private String cryptography;
    private String inputString;
    private String pathFileInput;
    private String pathFileOutput;
    private String algorithm;
    private String outputString;
    private int shift;


    Arguments() {
        this.cryptography = "enc";
        this.algorithm = "shift";
        this.shift = 0;
        this.inputString = "";
    }

    void setArguments(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    cryptography = args[i + 1];
                    break;
                case "-key":
                    shift = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    inputString = args[i + 1];
                    break;
                case "-in":
                    pathFileInput = args[i + 1];
                    break;
                case "-out":
                    pathFileOutput = args[i + 1];
                    break;
                case "-alg":
                    algorithm = args[i + 1];
                    break;
            }
        }
    }

    int getShift() {
        return shift;
    }

    String getCryptography() {
        return cryptography;
    }

    String getAlgorithm() {
        return algorithm;
    }

    String getInputString() {
        return inputString;
    }

    String getPathFileInput() {
        return pathFileInput;
    }

    String getPathFileOutput() {
        return pathFileOutput;
    }

    String getOutputString() {
        return outputString;
    }

    void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    void setInputString(String inputString) {
        this.inputString = inputString;
    }
}
