package com.testapi;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Testapi {
	public int createJiraIssues(String url,String header,String body) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(url);
		request.addHeader("authorization", header);
		request.addHeader("cache-control", "no-cache");
		request.addHeader("content-type", "application/json");	

		StringEntity entity = new StringEntity(body);
		request.setEntity(entity);
		HttpResponse response = client.execute(request);

		System.out.println(response.getStatusLine().getStatusCode());
		return response.getStatusLine().getStatusCode();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World " +args[0]);
	}
}
