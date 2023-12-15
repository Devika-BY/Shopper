package Pojo1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RunnerClass {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		 Response res = req.request(Method.GET,"/api/users/2");
		singleUsre s1 = res.as(singleUsre.class);
	Data d = s1.getData();
	Support sup = s1.getSu();
	System.out.println(d.getFirst_name());
	System.out.println(sup.getUrl());
	}

}
