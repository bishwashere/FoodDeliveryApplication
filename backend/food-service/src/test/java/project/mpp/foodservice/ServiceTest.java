package project.mpp.foodservice;

import project.mpp.foodservice.domain.Food;
import project.mpp.foodservice.service.FoodService;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ServiceTest {

    @Mock
    private MyDao myDao;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void testfindById(){
        MockitoAnnotations.initMocks(this);
        FoodService myService = new FoodService(myDao);
        myService.findById(1L);
        Mockito.verify(myDao).findById(1L);
    }

    @Test
    public void test() {
        ServiceTest myService = new ServiceTest(myDao);
        Mockito.when(myDao.findById(1L)).thenReturn(createTestEntity());
        Food actual = myService.findById(1L);
        Assert.assertEquals("My first name", actual.getFirstName());
        Assert.assertEquals("My surname", actual.getSurname());
        Mockito.verify(myDao).findById(1L);
    }

    private Food createTestEntity() {
        Food myEntity = new Food();
        myEntity.setName("My test name");
        return myEntity;
    }
}