package L_6_Var_4;
import java.io.*;

public class Lab6_Var4 {
    private static String gw = "";

    public static boolean checkWord(String word) {
        char[] gl = gw.toCharArray();

        for (int i = 0; i < gl.length; i++) {
            if (gl[i] == word.charAt(0)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        InputStream in = null;
        Reader file = null;
        BufferedReader buf = null;

        OutputStream out = null;
        Writer wr = null;

        try {
            in = new FileInputStream("C:\\Users\\Ученик.DESKTOP-9UTQSM7\\IdeaProjects\\Labarat6\\in.txt");
            file = new InputStreamReader(in, "cp1251");
            buf = new BufferedReader(file);


            File f1 = new File("C:\\Users\\Ученик.DESKTOP-9UTQSM7\\IdeaProjects\\Labarat6\\out.txt");
            if (f1.exists()) {
                out = new FileOutputStream(f1);
                wr = new OutputStreamWriter(out, "Unicode");
                String line = "";
                String[] words;

                int num_line=1;

                String str= "line";
                str.length();

                while ((line = buf.readLine()) != null) {
                    wr.write(num_line);
                    words = line.split("");
                    int lenFirst= words[0].length();

                    int count=0;
                    for (int i = 1; i <words.length; i++)
                        if (checkWord(String.valueOf(words[i].charAt(0)))) {
                            System.out.println(words[i]);
                        }
                }
            }
        } catch (IOException e) {
            System.out.println("Error IO");
        } finally {
            buf.close();
            file.close();
            in.close();
            wr.flush();
            wr.close();
        }
    }
}
