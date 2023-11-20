package dalieOCP.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

import static java.lang.System.out;

public class Execute {
    public static void main(String[] args) {
        send();
        asyncSend();
    }

    public static void send() {
          HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("http://www.google.de"))
                .GET().build();
        String result = null;
        try {
            result = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.format("%s", result);
    }

    public static void asyncSend(){
        HttpClient client = HttpClient.newBuilder().build();
        String formData = "timestamp=" + new Date().getTime() + "&Submit=Convert";
        HttpRequest request =
                HttpRequest
                        .newBuilder()
                        .uri(URI.create("http://www.unixtimestamp.com/index.php"))
                        .header("Content-Type", "application/x-www-form-urlencoded")
                        .POST(HttpRequest.BodyPublishers.ofString(formData))
                        .build();
        client
                .sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .whenComplete((r, t) -> System.out.println(r.body()));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
