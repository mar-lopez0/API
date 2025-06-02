import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Consulta {
    public Consulta(String[] args) {
        
    try {
        URL url = new URL("https://semaforo-706f7-default-rtdb.firebaseio.com/.json"+ruta);
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();


        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        System.out.println(content.toString());

    } catch (Exception e) {
        System.out.println("Error" + e);

        }       
    }
}
