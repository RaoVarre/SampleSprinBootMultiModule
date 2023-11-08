package com.multimodule.organization.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multimodule.organization.common.TestCommon;



@RestController
@RequestMapping("/multiTest")
public class TestController {
	
	@Autowired
	public TestCommon tc;
	
	@GetMapping("/multiTestMessage")
	public ResponseEntity<String> testMessage(){
		return ResponseEntity.ok(tc.display());
	}

}
