package com.devtry.girl;

import com.devtry.girl.Entity.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BabyController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/baby", method = RequestMethod.GET)
    public String say() {
        return girlProperties.getContent();
    }
}
