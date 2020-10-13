/*package org.zerock.graphql.service;

import java.util.List;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.zerock.graphql.entity.Kind;

import com.google.gson.Gson;

@Service
public class WebService {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	protected Logger logger = Logger.getLogger(WebService.class
			.getName());
	
	public WebService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	public List<Kind> kindList(){
		String catalog = null;
		
		//"{\"query\" : \"{products { code name price } }\"}"
		final String body = "{kinds { kind_code kind_name } }";
		
		catalog = restTemplate.getForObject(serviceUrl + "/graphql?query={body}", String.class,body);		

		JSONObject jObject = new JSONObject(catalog);
		JSONObject dataObject = jObject.getJSONObject("data");
		JSONArray jArray = dataObject.getJSONArray("kinds");
		
		Gson gson = new Gson();
		List<Kind> results = gson.fromJson(jArray.toString(), List.class);
		
		return results;
	}
}*/
