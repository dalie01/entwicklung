package translate.url;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GHelper {

	public void getHtmlContent() throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpResponse response = httpclient.execute(new HttpGet("https://www.googleapis.com/language/translate/v2?key=AIzaSyAfcNVtaoE859gtW1nsAxYcWGznmFKHmfc&q=Have%20you%20been%20here&source=en&target=de&prettyprint=true"));
		HttpEntity entity = response.getEntity();
		String responseString = EntityUtils.toString(entity, "UTF-8");
		System.out.println(responseString);
	}
	
	
}
