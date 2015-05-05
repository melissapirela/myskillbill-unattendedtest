package com.sky.bill.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;

import com.sky.bill.beans.Bill;
import com.sky.bill.service.BillService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/app-config.xml"})
public class BillControllerTest {

	private MockMvc mockMvc;
	
	@InjectMocks
    BillController billControllerMock;
	
	@Mock
	private BillService billServiceMock;
	
    @Before
    public void setUp() {
    	MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(billControllerMock).build();
    }
    
	@Test
	public void testGetBill() throws Exception {
		when(billServiceMock.getBill()).thenReturn(new Bill());
		mockMvc.perform(get("/bill/bill.json")).andExpect(status().isOk());
	}

}
