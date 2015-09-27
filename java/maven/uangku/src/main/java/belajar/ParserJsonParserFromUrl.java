import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class ParserJsonParserFromUrl{
	public static Data getData(String url) throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("accept","application/json");
		HttpResponse response = httpClient.execute(httpGet);
		String data  = readData(response);
		Gson gson = new Gson();
		return gson.fromJson(data,Data.class);
	}

	public static List<Data> getDataList(String url) throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("accept","application/json");
		HttpResponse response = httpClient.execute(httpGet);
		String data  = readData(response);
		Gson gson = new Gson();
		Type type = new TypeToken<List<Data>>(){}.getType();
		return gson.fromJson(data,type);
	}
	
	public static String readData(HttpResponse httpResponse) throws Exception{
		BufferedReader buffredReader=null;
		try{
			bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			StringBuffer buffer = new StringBuffer();
			char[] dataLength = new char[1024];
			int read;
			while((read=bufferReader.read(dataLength))!=-1){
				buffer.append(dataLength,0,read);
			}
			return buffer.toString();
		}catch (Exception e){
			throws e;
		}finally{
			if(bufferedReader!=null)
				bufferedReader.close();
		}
	}
}
