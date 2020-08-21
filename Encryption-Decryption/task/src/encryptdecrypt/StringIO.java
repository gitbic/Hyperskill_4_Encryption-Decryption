package encryptdecrypt;

class StringIO implements DataIO {

    @Override
    public void write(String str, String path) {
        System.out.println(str);
    }

    @Override
    public String read(String str, String path) {
        return str;
    }
}
