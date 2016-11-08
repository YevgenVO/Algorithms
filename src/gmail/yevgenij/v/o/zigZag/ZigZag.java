package gmail.yevgenij.v.o.zigZag;

public class ZigZag {
    public String convert(String line, int numRows) {
        return toStringBuilder(toZigzag(line, numRows)).toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING", 4));
    }

    private String[] toZigzag(String line, int numRows) {
        String[] zigZag = new String[numRows];
        int temp = 0;
        System.out.println(line);
        for (int i = 0; temp < line.length(); i++) {
            for (int j = 0; j < numRows; j++) {
                if (i == 0) {
                    zigZag[j] = "" + line.charAt(temp++);
                } else {
                    if ((i % (numRows - 1) == 0 || ((i + j) % (numRows - 1) == 0)) && temp < line.length()) {
                        zigZag[j] += line.charAt(temp);
                        temp++;
                    } else {
                        zigZag[j] += " ";
                    }
                }

            }
        }
        return zigZag;
    }

    private StringBuilder toStringBuilder(String[] zigzag) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String i : zigzag) {
            stringBuilder.append(i);
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}

