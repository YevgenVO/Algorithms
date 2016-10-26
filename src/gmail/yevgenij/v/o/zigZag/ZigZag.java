package gmail.yevgenij.v.o.zigZag;

public class ZigZag {
    public String convert(String s, int numRows) {
        return toStringBuilder(toZigzag(s, numRows)).toString();     //"PAYPALISHIRING"
    }

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING", 4));
    }

    private String[] toZigzag(String s, int numRows) {
        String[] zigZag = new String[numRows];
        int temp = 0;
        System.out.println(s);
            for (int i = 0; temp < s.length();i++) {
                for (int j = 0; j < numRows; j++) {
                    if (i == 0) {
                        zigZag[j] = "" + s.charAt(temp++);
                    } else {
                        if ((i % (numRows - 1) == 0 || ((i + j) % (numRows - 1) == 0)) && temp < s.length()) {
                            zigZag[j] += s.charAt(temp);
                            temp++;
//                        } else {
//                            zigZag[j] += " ";
                        }
                    }

                }
            }
        return zigZag;
    }

    private StringBuilder toStringBuilder(String[] zigzag) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String i :zigzag) {
            stringBuilder.append(i);
//            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}

