package org.randall.teagan;

import configuration.CollectionConfiguration;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *@author: Teagan Randall
 *@studNo: 215 095 111
 */

public class ListAppTest{

    private CollectionService collectionService;

    @BeforeMethod
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CollectionConfiguration.class);
        collectionService = (CollectionService) ctx.getBean("springlist");
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() throws Exception{
        Collection a = new ArrayList<String>();
        Object b = "DummyObject";
        collectionService.add(a,b);

        boolean result = a.contains(b);

        Assert.assertEquals("Object B has been added to Collection A.", result, true);
    }

    @Test
    public void testRemove() throws Exception{
        Collection a = new ArrayList<String>();
        Object b = "DummyObject";
        a.add(b);

        collectionService.remove(a,b);
        boolean result = a.contains(b);

        Assert.assertEquals("Object B has been removed from Collection A.", result, false);
    }
}