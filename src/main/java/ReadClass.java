
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ReadClass {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public  double nextDouble() {
        double a = 0;
        try {
            a = Double.parseDouble(reader.readLine());
        }catch (IOException e){

        }
        return a;
    }

    public String nextString(){
     String str = null;

        try {
            str = reader.readLine();
        }catch (IOException e){

        }
        return str;
    }

}
