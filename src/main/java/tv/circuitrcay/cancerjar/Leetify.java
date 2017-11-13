package tv.circuitrcay.cancerjar;

public class Leetify {
    public static String leetify(String s) {
        char temp[] = s.toLowerCase().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            switch (temp[i]) {
                case 'a':
                    temp[i] = '4';
                    break;
                case 'b':
                    temp[i] = '8';
                    break;
                case 'c':
                    temp[i] = '(';
                    break;

                case 'e':
                    temp[i] = '3';
                    break;
                case 'g':
                    temp[i] = 'g';
                    break;
                case 'i':
                    temp[i] = '1';
                    break;
                case 'o':
                    temp[i] = '0';
                    break;
                case 's':
                    temp[i] = '$';
                    break;
                case 't':
                    temp[i] = '7';
                    break;
                case 'z':
                    temp[i] = '2';
                    break;
            }
        }
        return new String(temp);
    }
}
