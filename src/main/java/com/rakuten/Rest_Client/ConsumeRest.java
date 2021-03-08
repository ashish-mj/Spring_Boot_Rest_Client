package com.rakuten.Rest_Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumeRest {
	@Autowired
	RestTemplate template;

@RequestMapping("/sampleproducts")
public Product sampleProduct() {
	HttpHeaders headers = new HttpHeaders();
	//headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity <String> entity = new HttpEntity<String>(headers);
	Product p1=template.exchange("http://localhost:8080/product/sample",HttpMethod.GET, entity,Product.class).getBody();
//	p1.setRatings(4.5f);
	return p1;
}
}
