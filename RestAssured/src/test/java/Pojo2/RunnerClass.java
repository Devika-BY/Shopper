package Pojo2;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RunnerClass {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		 Response res = req.request(Method.GET,"/api/users?page=2");
		 ListUser Lu=res.as(ListUser.class);
		 System.out.println(Lu.getPage());
		 Support su=Lu.getSupport();
		 System.out.println(su.getUrl());
		 List<Data> da= Lu.getData();
		 for(Data d1:da)
		 {
			 System.out.println(d1.getFirst_name());
		 }
		 
	}

}
