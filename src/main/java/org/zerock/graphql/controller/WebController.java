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
	 
	            String url = "http://ec2-3-35-208-154.ap-northeast-2.compute.amazonaws.com:8082";
	      
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
		String jsonInString1 = "";
		String resultString = "";
		
		 try {
	            RestTemplate restTemplate = new RestTemplate();
	 
	            HttpHeaders header = new HttpHeaders();
	            HttpEntity<?> entity = new HttpEntity<>(header);
	 
	            String url = "http://ec2-3-35-208-154.ap-northeast-2.compute.amazonaws.com:8082";
	      
	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
	            jsonInString = restTemplate.getForObject(url + "/kinds/k5", String.class);
	           
	            jsonInString1 = restTemplate.getForObject(url + "/restaurants/k5", String.class);
	            
	            resultString = jsonInString.concat(jsonInString1);
	 
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
	 
	        return resultString;
	}
	@GetMapping("/kinds/k3/restaurants") 
	public String kindlistk3() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		String jsonInString = "";
		String jsonInString1 = "";
		String resultString = "";
		
		 try {
	            RestTemplate restTemplate = new RestTemplate();
	 
	            HttpHeaders header = new HttpHeaders();
	            HttpEntity<?> entity = new HttpEntity<>(header);
	 
	            String url = "http://ec2-3-35-208-154.ap-northeast-2.compute.amazonaws.com:8082";
	      
	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
	            jsonInString = restTemplate.getForObject(url + "/kinds/k3", String.class);
		           
	            jsonInString1 = restTemplate.getForObject(url + "/restaurants/k3", String.class);
	            
	            resultString = jsonInString.concat(jsonInString1);
	 
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
	 
	        return resultString;
	}
	@GetMapping("/kinds/k6/restaurants") 
	public String kindlistk6() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		String jsonInString = "";
		String jsonInString1 = "";
		String resultString = "";
		
		 try {
	            RestTemplate restTemplate = new RestTemplate();
	 
	            HttpHeaders header = new HttpHeaders();
	            HttpEntity<?> entity = new HttpEntity<>(header);
	 
	            String url = "http://ec2-3-35-208-154.ap-northeast-2.compute.amazonaws.com:8082";
	      
	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
	            jsonInString = restTemplate.getForObject(url + "/kinds/k6", String.class);
	            
	            jsonInString1 = restTemplate.getForObject(url + "/restaurants/k6", String.class);
	            
	            resultString = jsonInString.concat(jsonInString1);
	 
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
	 
	        return resultString;
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
	@GetMapping("/kindlistk51")
	public String callAPI6() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		 
        String jsonInString = "";
        
        try {
           
            RestTemplate restTemplate = new RestTemplate();
 
            HttpHeaders header = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(header);
 
            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
            
            final String body = "{\r\n" + 
            		"  kind(kind_code: \"k5\"){\r\n" + 
            		"    kind_code\r\n" + 
            		"    restaurants{\r\n" + 
            		"      company_code\r\n" + 
            		"      member_id\r\n" + 
            		"      restaurant_name\r\n" + 
            		"      restaurant_address\r\n" + 
            		"      restaurant_phone\r\n" + 
            		"      restaurant_img\r\n" + 
            		"      board_comment_code\r\n" + 
            		"      star_avg_score\r\n" + 
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
	
	@GetMapping("/kindlistk5")
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
            		"    kind_code\r\n" + 
            		"    restaurants{\r\n" + 
            		"      restaurant_name\r\n" + 
            		"      restaurant_address\r\n" + 
            		"      restaurant_phone\r\n" + 
            		"      member_id\r\n" + 
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
	
	@GetMapping("/kindlistk6")
	public String callAPI3() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		 
        String jsonInString = "";
        
        try {
           
            RestTemplate restTemplate = new RestTemplate();
 
            HttpHeaders header = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(header);
 
            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
            
            final String body = "{\r\n" + 
            		"  kind(kind_code: \"k6\"){\r\n" + 
            		"    kind_code\r\n" + 
            		"    restaurants{\r\n" + 
            		"      restaurant_name\r\n" + 
            		"      restaurant_address\r\n" + 
            		"      restaurant_phone\r\n" + 
            		"      member_id\r\n" + 
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
	
	@GetMapping("/kindlistk3")
	public String callAPI4() {
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		 
        String jsonInString = "";
        
        try {
           
            RestTemplate restTemplate = new RestTemplate();
 
            HttpHeaders header = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(header);
 
            String url = "http://ec2-3-34-50-187.ap-northeast-2.compute.amazonaws.com:4000";
            
            final String body = "{\r\n" + 
            		"  kind(kind_code: \"k3\"){\r\n" + 
            		"    kind_code\r\n" + 
            		"    restaurants{\r\n" + 
            		"      restaurant_name\r\n" + 
            		"      restaurant_address\r\n" + 
            		"      restaurant_phone\r\n" + 
            		"      member_id\r\n" + 
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
