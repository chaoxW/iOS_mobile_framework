package Mobile_Test;


import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TableTest extends TableClass{

    @Test(priority=1)
    public void ClearTableTest() throws Exception {
        clearSelectTable(1);
    }

    @Test(priority=2)
    public void ProductListViewTest() throws Exception {
        getTableListViewMenuList(1);
    }

    @Test(priority=3)
    public void ProductGridViewTest() throws Exception {
        getTableGridViewMenuList(1);
    }

    @Test(priority=4)
    public void GridViewOrderAndBackTest() throws Exception {
        getTableGridViewMenuList(1);
        selectTable(1);
        checkTable(1);
        orderFood(0);
        clickBackButton();
        clickYesButton();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
    }

    @Test(priority=5)
    public void ListViewOrderAndBackTest() throws Exception {
        getTableListViewMenuList(1);
        selectTable(1);
        checkTable(1);
        orderFood(1);
        clickBackButton();
        clickYesButton();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
    }

    @Test(priority=4)
    public void GridViewOrderTest() throws Exception {
        clearSelectTable(1);
        getTableGridViewMenuList(1);
        selectTable(1);
        orderFood(0);
        orderFood(1);
        orderFood(2);
        clickAddToTableButton();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
    }

    @Test(priority=5)
    public void ListViewOrderTest() throws Exception {
        clearSelectTable(1);
        getTableListViewMenuList(1);
        selectTable(1);
        orderFood(0);
        orderFood(1);
        orderFood(2);
        clickAddToTableButton();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
    }

}
