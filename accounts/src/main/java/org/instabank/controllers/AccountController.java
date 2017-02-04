package org.instabank.controllers;

import org.instabank.model.Account;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aadhya on 2/4/2017.
 */

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @RequestMapping(value = "/{accountnumber}", method = RequestMethod.GET)
    public Account getBook(@PathVariable String accountnumber) {
        return new Account("Jai", "Ganesh", accountnumber);
    }
}
