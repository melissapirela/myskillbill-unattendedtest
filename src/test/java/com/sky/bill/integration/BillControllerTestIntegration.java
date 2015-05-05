package com.sky.bill.integration;

import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/app-config.xml", "file:src/main/webapp/WEB-INF/spring/webapp-config.xml"})
public class BillControllerTestIntegration {

	@Autowired
    private WebApplicationContext webApplicationContext;
 
    private MockMvc mockMvc;
 
    @Before
    public void setUp() {
    	MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.webApplicationContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void findAll() throws Exception {
        mockMvc.perform(get("/bill/bill.json")).andExpect(status().isOk());
    }
}
