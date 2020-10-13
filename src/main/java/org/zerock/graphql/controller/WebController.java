package org.zerock.graphql.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class WebController {
	
	/*@RequestMapping(value = {"/kindList"})
	public String listProductHandler(Model model) {    
		/*final int maxResult = 5;
	    final int maxNavigationPage = 10;
	    List<Kind> result = webService.kindList();

	    model.addAttribute("paginationProducts", result);
		return "productList";
	}*/
	@GetMapping("/restaurant/1k5A/menus") 
	public String menulist() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		String jsonInString = "";
		
		 try {
	            RestTemplate restTemplate = new RestTemplate();
	 
	            HttpHeaders header = new HttpHeaders();
	            HttpEntity<?> entity = new HttpEntity<>(header);
	 
	            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
	      
	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
	            jsonInString = restTemplate.getForObject(url + "/restaurant/1k5A/menus", String.class);
	 
	        } catch (HttpClientErrorException | HttpServerErrorException e) {
	            result.put("statusCode", e.getRawStatusCode());
	            result.put("body"  , e.getStatusText());
	            System.out.println("dfdfdfdf");
	            System.out.println(e.toString());
	 
	        } catch (Exception e) {
	            result.put("statusCode", "999");
	            result.put("body"  , "excpetion오류");
	            System.out.println(e.toString());
	        }
	 
	        return jsonInString;
	}
	
	@GetMapping("/kinds/k5/restaurants") 
	public String kindlist() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		String jsonInString = "";
		
		 try {
	            RestTemplate restTemplate = new RestTemplate();
	 
	            HttpHeaders header = new HttpHeaders();
	            HttpEntity<?> entity = new HttpEntity<>(header);
	 
	            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
	      
	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
	            jsonInString = restTemplate.getForObject(url + "/kinds/k5/restaurants", String.class);
	 
	        } catch (HttpClientErrorException | HttpServerErrorException e) {
	            result.put("statusCode", e.getRawStatusCode());
	            result.put("body"  , e.getStatusText());
	            System.out.println("dfdfdfdf");
	            System.out.println(e.toString());
	 
	        } catch (Exception e) {
	            result.put("statusCode", "999");
	            result.put("body"  , "excpetion오류");
	            System.out.println(e.toString());
	        }
	 
	        return jsonInString;
	}
	
	@GetMapping("/menulist")
	public String callAPI2() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		 
        String jsonInString = "";
        
        try {
           
            RestTemplate restTemplate = new RestTemplate();
 
            HttpHeaders header = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(header);
 
            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
            
            final String body = "{\r\n" + 
            		"  restaurant(company_code:\"1k5A\"){\r\n" + 
            		"    restaurant_name\r\n" + 
            		"    restaurant_address\r\n" + 
            		"    restaurant_phone\r\n" + 
            		"    foods{\r\n" + 
            		"      food_name\r\n" + 
            		"      food_price\r\n" + 
            		"    }\r\n" + 
            		"  }\r\n" + 
            		"}";
      
            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
            jsonInString = restTemplate.getForObject(url + "/graphql?query={body}", String.class,body);
 
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            result.put("statusCode", e.getRawStatusCode());
            result.put("body"  , e.getStatusText());
            System.out.println("dfdfdfdf");
            System.out.println(e.toString());
 
        } catch (Exception e) {
            result.put("statusCode", "999");
            result.put("body"  , "excpetion오류");
            System.out.println(e.toString());
        }
 
        return jsonInString;
	}
	
	@GetMapping("/kindlist")
	public String callAPI() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		 
        String jsonInString = "";
        
        try {
           
            RestTemplate restTemplate = new RestTemplate();
 
            HttpHeaders header = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(header);
 
            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
            
            final String body = "{\r\n" + 
            		"  kind(kind_code: \"k5\"){\r\n" + 
            		"    restaurants{\r\n" + 
            		"      company_code\r\n" + 
            		"    	member_id\r\n" + 
            		"    	restaurant_address\r\n" + 
            		"   	 	restaurant_name\r\n" + 
            		"    	restaurant_phone\r\n" + 
            		"    }\r\n" + 
            		"  }\r\n" + 
            		"}";
      
            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
            jsonInString = restTemplate.getForObject(url + "/graphql?query={body}", String.class,body);
 
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            result.put("statusCode", e.getRawStatusCode());
            result.put("body"  , e.getStatusText());
            System.out.println("dfdfdfdf");
            System.out.println(e.toString());
 
        } catch (Exception e) {
            result.put("statusCode", "999");
            result.put("body"  , "excpetion오류");
            System.out.println(e.toString());
        }
 
        return jsonInString;
	}
}
