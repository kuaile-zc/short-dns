package com.zc.project.dns.controller;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TestController.class)
class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void HelloTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isOk());
//                .andExpect(MockMvcResultMatchers.content().string("bookhome"));
//        String contentAsString = mvcResult.getResponse().getContentAsString();
//        System.out.println(contentAsString);
//        assertEquals(contentAsString, "");
    }

}