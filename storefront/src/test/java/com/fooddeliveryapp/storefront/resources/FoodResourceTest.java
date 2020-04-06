package com.fooddeliveryapp.storefront.resources;

import com.fooddeliveryapp.storefront.models.Food;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FoodResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FoodResource foodResource;

//    @Before
//    public void setUp() throws Exception{
//        mockMvc = MockMvcBuilders.standaloneSetup(foodResource).build();
//    }

    @Test
    void getAllFoods() throws Exception{
        mockMvc.perform( MockMvcRequestBuilders
                .get("/foods/all"))
                .andDo(print()).
                andExpect(status().isOk());
    }

    @Test
    void getFoodById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/foods/1"))
                .andDo(print()).
                andExpect(status().isOk());
    }

    @Test
    void getAllFoodsOfRestaurant() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/foods/restaurant/asf"))
                .andDo(print()).
                andExpect(status().isOk());
    }

    @Test
    void addNew() {
    }

    @Test
    void deleteFood() {
    }

    @Test
    void getFoodsByIds() {
    }
}