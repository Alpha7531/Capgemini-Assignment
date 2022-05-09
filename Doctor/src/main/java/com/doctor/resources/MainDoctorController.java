package com.doctor.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/doctor")
public class MainDoctorController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/viewdrugs")
	public List<Object> viewAllDrugs() {
		String url = "http://drug-inventory-service/drug/view";
		Object[] drug = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(drug);
	}

	@GetMapping("/viewdrugs/{name}")
	public Object getDrugByName(@PathVariable String name) {
		String url = "http://drug-inventory-service/drug/find/" + name;
		return restTemplate.getForObject(url, Object.class);
	}

}
