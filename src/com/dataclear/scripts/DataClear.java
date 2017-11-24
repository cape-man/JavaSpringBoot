package com.dataclear.scripts;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.UnknownHostException;

import org.bson.Document;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;

public class DataClear 
{
	@Test
	public void clearData()
	{
	System.out.println("********************DataClear********************");
	Reporter.log("********************DataClear********************");
	
	MongoClient mongoclient=new MongoClient(new MongoClientURI("mongodb://mongouser:mongouser%40ISG@cape-build-server.southeastasia.cloudapp.azure.com:6380/cape"));
	MongoDatabase db = mongoclient.getDatabase("cape");
	
	MongoCollection<Document> table = db.getCollection("canvas");
	BasicDBObject searchQuery1 = new BasicDBObject();
	searchQuery1.put("canvasName", "Automation Canvas");
	DeleteResult r = table.deleteOne(searchQuery1);
	System.out.println(r);
	
	table = db.getCollection("user");
	BasicDBObject searchQuery2 = new BasicDBObject();
	searchQuery2.put("name", "Automation User");
	r = table.deleteOne(searchQuery2);
	System.out.println(r);
	
	table = db.getCollection("user");
	BasicDBObject searchQuery3 = new BasicDBObject();
	searchQuery3.put("name", "Canvas User");
	r = table.deleteOne(searchQuery3);
	System.out.println(r);
	
	table = db.getCollection("project");
	BasicDBObject searchQuery4 = new BasicDBObject();
	searchQuery4.put("projectName", "Automation Project");
	r = table.deleteOne(searchQuery4);
	System.out.println(r);
	
	table = db.getCollection("user");
	BasicDBObject searchQuery5 = new BasicDBObject();
	searchQuery5.put("name", "Automation Admin");
	r = table.deleteOne(searchQuery5);
	System.out.println(r);
	
	table = db.getCollection("tenant");
	BasicDBObject searchQuery6 = new BasicDBObject();
	searchQuery6.put("orgName", "Automation Tenant");
	r = table.deleteOne(searchQuery6);
	System.out.println(r);
	
	table = db.getCollection("user");
	BasicDBObject searchQuery7 = new BasicDBObject();
	searchQuery7.put("name", "Automation Root");
	r = table.deleteOne(searchQuery7);
	System.out.println(r);
	
	mongoclient.close();
	
	System.out.println("********************DataClear********************");
	Reporter.log("********************DataClear********************");
	}
}