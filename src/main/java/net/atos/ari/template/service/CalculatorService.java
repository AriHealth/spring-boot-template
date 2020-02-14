/*
 * Copyright (C) 2019  Atos Spain SA. All rights reserved.
 * 
 * This file is part of the Spring Boot template project.
 * 
 * This is free software: you can redistribute it and/or modify it under the 
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
 * Calculator Spring boot service
 */
package net.atos.ari.template.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CalculatorService implements Service {

    public static final Logger log = LoggerFactory.getLogger(CalculatorService.class);

    // Constants
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public int plus(int sum1, int sum2) {
        return sum1 + sum2;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}