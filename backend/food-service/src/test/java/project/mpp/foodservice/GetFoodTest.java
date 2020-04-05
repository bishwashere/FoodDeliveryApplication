


public class GetFoodTest extends AbstractTest{
    @Test
    public void getProductsList() throws Exception {
            String uri = "/all";
            MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
            .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

            int status = mvcResult.getResponse().getStatus();
            assertEquals(200, status);
            String content = mvcResult.getResponse().getContentAsString();
            Product[] productlist = super.mapFromJson(content, Product[].class);
            assertTrue(productlist.length > 0);
            }

}