package encryptdecrypt;

interface DataIO {
    void write(String outputString, String pathFileOutput);

    String read(String inputString, String pathFileInput);
}
