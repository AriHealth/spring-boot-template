/*
 * Copyright (C) 2019  Atos Spain SA. All rights reserved.
 * 
 * This file is part of the Calculator API.
 * 
 * AuthController.java is free software: you can redistribute it and/or modify it under the 
 * terms of the Apache License, Version 2.0 (the License);
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * The software is provided "AS IS", without any warranty of any kind, express or implied,
 * including but not limited to the warranties of merchantability, fitness for a particular
 * purpose and noninfringement, in no event shall the authors or copyright holders be 
 * liable for any claim, damages or other liability, whether in action of contract, tort or
 * otherwise, arising from, out of or in connection with the software or the use or other
 * dealings in the software.
 * 
 * See README file for the full disclaimer information and LICENSE file for full license 
 * information in the project root.
 * 
 * Spring boot controller for Calculator
 */

package net.atos.ari.template.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import net.atos.ari.template.service.Service;

@RestController
@EnableAutoConfiguration
public class CalculatorController {

	private static final Logger log = LoggerFactory.getLogger(CalculatorController.class);

	@Autowired
    Service calcService;

	@ApiOperation(value = "Add two numbers")
	@GetMapping("/plus")
	public int plus(@RequestParam int sum1, @RequestParam int sum2 ) {
		log.info("Plus operation with {}", sum1, sum2);
		return calcService.plus(sum1, sum2);
	}
}