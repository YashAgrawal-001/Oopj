class WrapperExample {
    public static void main(String[] args) {
        int i = 10;
        Integer intObj = Integer.valueOf(i);
        System.out.println("Integer wrapper: " + intObj);

        double d = 5.6;
        Double doubleObj = Double.valueOf(d);
        System.out.println("Double wrapper: " + doubleObj);

        char c = 'A';
        Character charObj = Character.valueOf(c);
        System.out.println("Character wrapper: " + charObj);

        boolean b = true;
        Boolean boolObj = Boolean.valueOf(b);
        System.out.println("Boolean wrapper: " + boolObj);

        byte bt = 1;
        Byte byteObj = Byte.valueOf(bt);
        System.out.println("Byte wrapper: " + byteObj);

        short s = 20;
        Short shortObj = Short.valueOf(s);
        System.out.println("Short wrapper: " + shortObj);

        long l = 12345L;
        Long longObj = Long.valueOf(l);
        System.out.println("Long wrapper: " + longObj);

        float f = 3.14f;
        Float floatObj = Float.valueOf(f);
        System.out.println("Float wrapper: " + floatObj);
    }
}
