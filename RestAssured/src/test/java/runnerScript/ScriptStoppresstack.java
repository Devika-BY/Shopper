package runnerScript;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ScriptStoppresstack {
	public static void main(String[] args) {
		RestAssured.baseURI="https://www.shoppersstack.com/shopping";
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("city","Bengalore");
	    obj.put("country","India");
		obj.put("email", "devika@gmail.com");
		 obj.put("firstName", "Devika");
		  obj.put("gender", "FEMALE");
		  obj.put("lastName", "B Y");
		  obj.put("password", "Devika@123");
		 obj.put("phone", "8546961940");
		 obj.put("state", "Karnataka");
		obj.put("zoneId", "Alpha");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,"/api/users");
		System.out.println(res.prettyPrint());
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		System.out.println(res.getContentType());


}
}
