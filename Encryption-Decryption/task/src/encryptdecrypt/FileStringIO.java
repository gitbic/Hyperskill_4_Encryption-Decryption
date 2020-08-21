package encryptdecrypt;

class FileStringIO {

    private Arguments arguments;
    private String inputString;
    private String pathFileInput;
    private String pathFileOutput;

    FileStringIO(Arguments arguments) {
        this.arguments = arguments;
        this.inputString = arguments.getInputString();
        this.pathFileInput = arguments.getPathFileInput();
        this.pathFileOutput = arguments.getPathFileOutput();
    }

    void readString() {

        DataIO dataIO;

        if (!pathFileInput.isEmpty() && inputString.isEmpty()) {
            dataIO = new FileIO();
        } else {
            dataIO = new StringIO();
        }
        inputString = dataIO.read(inputString, pathFileInput);

        if (inputString.equals("-1")) {
            System.out.println("Error: inputString and pathFileInput is empty.");
            System.exit(0);
        }

        arguments.setInputString(inputString);
    }

    void writeString() {

        DataIO dataIO;

        if (!pathFileOutput.isEmpty()) {
            dataIO = new FileIO();
        } else {
            dataIO = new StringIO();
        }
        dataIO.write(arguments.getOutputString(), pathFileOutput);
    }
}
