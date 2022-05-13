package Mobile_Test;


import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TableTest extends TableClass{

    @Test(priority=1)
    public void ClearTableTest() throws Exception {
        utils.testStartLog("ClearTableTest");
        clearSelectTable(1);
        HomepageValidation();
        utils.testEndLog("ClearTableTest");
    }

    @Test(priority=2)
    public void ProductsListViewTest() throws Exception {
        utils.testStartLog("ProductsListViewTest");
        getTableListViewMenuList(1);
        HomepageValidation();
        utils.testEndLog("ProductsListViewTest");
    }

    @Test(priority=3)
    public void ProductsGridViewTest() throws Exception {
        utils.testStartLog("ProductsGridViewTest");
        getTableGridViewMenuList(1);
        HomepageValidation();
        utils.testEndLog("ProductsGridViewTest");
    }

    @Test(priority=4)
    public void GridViewOrderAndBackTest() throws Exception {
        utils.testStartLog("GridViewOrderAndBackTest");
        clearSelectTable(1);
        selectTable(1);
        checkTable(1);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        orderFoodFromGridView(0);
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("GridViewOrderAndBackTest");
    }

    @Test(priority=5)
    public void ListViewOrderAndBackTest() throws Exception {
        utils.testStartLog("ListViewOrderAndBackTest");
        clearSelectTable(1);
        selectTable(1);
        checkTable(1);
        setProductsListView();
        getCategoriesCollectionListView();
        selectCategoryFromListView(0);
        getMenuListListView();
        orderFoodFromListView(1);
        clickBackButton();
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("ListViewOrderAndBackTest");
    }

    @Test(priority=6)
    public void GridViewOrderTest() throws Exception {
        utils.testStartLog("GridViewOrderTest");
        clearSelectTable(1);
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        orderFoodFromGridView(0);

        selectCategoryFromGridView(1);
        getMenuListGridView();
        orderFoodFromGridView(0);
        getProductsListFromPopup();
        orderFoodFromPopup(0);


        clickAddToTableButton();
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("GridViewOrderTest");
    }

    @Test(priority=7)
    public void ListViewOrderTest() throws Exception {
        utils.testStartLog("ListViewOrderTest");
        clearSelectTable(1);
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        setProductsListView();
        getCategoriesCollectionListView();
        selectCategoryFromListView(0);
        getMenuListListView();
        orderFoodFromListView(1);
        clickAddToTableButton();
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("ListViewOrderTest");
    }

}
