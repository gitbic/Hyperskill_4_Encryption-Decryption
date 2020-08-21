package encryptdecrypt;

interface DataIO {
    abstract void write(String outputString, String pathFileOutput);

    abstract String read(String inputString, String pathFileInput);
}
