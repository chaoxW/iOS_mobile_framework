package Mobile_Test;

import Pages.HomePage;
import io.appium.java_client.MobileElement;
import Pages.TablePage;
import Pages.OrderPage;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.List;

public class TableClass extends Utils{

    Utils utils = new Utils();

    TablePage tablePage = new TablePage();

    HomePage homePage = new HomePage();
    String homepageLabel_ai = homePage.HomepageLabel_AI;

    OrderPage orderPage = new OrderPage();
    String tableVerification_ai = orderPage.TableVerification_AI;
    String backButton_xpath = orderPage.BackButton_XPATH;
    String coke_ai = orderPage.OrderCoke_AI;
    String pizza_ai = orderPage.OrderPizza_AI;
    String burger_ai = orderPage.OrderBurger_AI;
    String clearTableButton_ai = orderPage.ClearTableButton_AI;
    String addToTable_xpath = orderPage.AddToTable_XPATH;
    String yesButton_ai = orderPage.YesButton_AI;
    String billList_xpath = orderPage.billList_XPATH;
    String menuListGridView_xpath = orderPage.MenuListGridView_XPATH;
    String menuListListView_xpath = orderPage.MenuListListView_XPATH;
    String gridViewButton_ai = orderPage.GridViewButton_AI;
    String listViewButton_ai = orderPage.ListViewButton_AI;
    String categoriesCollectionView_xpath = orderPage.CategoriesCollectionGridView_XPATH;
    String categoriesCollectionListView_xpath = orderPage.CategoriesCollectionListView_XPATH;
    String productPlusButton_ai = orderPage.ProductPlusButton_AI;
    String productMinusButton_ai = orderPage.ProductMinusButton_AI;
    String productsListPopup_xpath = orderPage.ProductsListPopup_XPATH;
    String footerViewText_xpath = orderPage.FooterViewText_XPATH;

    String[] CategoriesCollectionGridViewList;
    String[] CategoriesCollectionListViewList;
    String[] MenuListGridViewList;
    String[] MenuListListViewList;
    String[] TableBillList;
    String[] FoodListPopup;
    String FooterViewText;

    @BeforeTest
    public void setup() {
        utils.iPadSetup();
//        utils.iPadBrowserstackSetup();
    }

    public void checkTable(int num) {
        try {
            MobileElement tableNumberValidation;
            tableNumberValidation = utils.getElementByAccessibilityId(num+tableVerification_ai);
            if (tableNumberValidation.isDisplayed()) {
                System.out.println("table correctly selected " + num + tableVerification_ai);
            }
        } catch (Exception exp) {
            System.out.println("\ncheck table ERROR " + exp.getCause());
            System.out.println("\ncheck table ERROR " + exp.getMessage());
        }
    }

    public void selectTable(int tableNumber) {
        utils.wait(1000);
        try {
            MobileElement table;
            table = utils.getElementByAccessibilityId(Integer.toString(tableNumber));
            table.click();
            System.out.println("select table " + tableNumber);
        } catch (Exception exp) {
            System.out.println("\nselect table" + tableNumber + " ERROR " + exp.getCause());
            System.out.println("\nselect table" + tableNumber + " ERROR " + exp.getMessage());
        }
    }

    public void selectCategories(String category) {
        utils.wait(100);
        try {
            MobileElement table;
            table = utils.getElementByAccessibilityId(category);
            table.click();
            System.out.println("select category " + category);
        } catch (Exception exp) {
            System.out.println("\nselect category" + category + " ERROR " + exp.getCause());
            System.out.println("\nselect category" + category + " ERROR " + exp.getMessage());
        }
    }

    public void clickBackButton() {
        utils.wait(3);
        try {
            MobileElement backButton;
            backButton = utils.getElementByXpath(backButton_xpath);
            backButton.click();
            System.out.println("click back button");
        } catch (Exception exp) {
            System.out.println("\nclick back button ERROR " + exp.getCause());
            System.out.println("\nclick back button ERROR " + exp.getMessage());
        }
    }

    public void clickClearTableButton() {
        try {
            MobileElement clearTableButton;
            clearTableButton = utils.getElementByAccessibilityId(clearTableButton_ai);
            clearTableButton.click();
            System.out.println("click clear table button");
        } catch (Exception exp) {
            System.out.println("\nclick clear table button ERROR " + exp.getCause());
            System.out.println("\nclick clear table button ERROR " + exp.getMessage());
        }
    }

    public void clickAddToTableButton() {
        utils.wait(2);
        try {
            MobileElement addToTableButton;
            addToTableButton = utils.getElementByXpath(addToTable_xpath);
            addToTableButton.click();
            System.out.println("click add to table button");
        } catch (Exception exp) {
            System.out.println("\nclick add to table button ERROR " + exp.getCause());
            System.out.println("\nclick add to table button ERROR " + exp.getMessage());
        }
    }

    public void clickYesButton() {
        try {
            MobileElement yesButton;
            yesButton = utils.getElementByAccessibilityId(yesButton_ai);
            yesButton.click();
            System.out.println("click Yes button");
        } catch (Exception exp) {
            System.out.println("\nclick Yes button ERROR " + exp.getCause());
            System.out.println("\nclick Yes button ERROR " + exp.getMessage());
        }
    }

    public void clickProductPlusButton() {
        try {
            MobileElement plusButton;
            plusButton = utils.getElementByAccessibilityId(productPlusButton_ai);
            plusButton.click();
            System.out.println("click product plus button");
        } catch (Exception exp) {
            System.out.println("\nclick product plus button ERROR " + exp.getCause());
            System.out.println("\nclick product plus button ERROR " + exp.getMessage());
        }
    }

    public void clickProductMinusButton() {
        try {
            MobileElement minusButton;
            minusButton = utils.getElementByAccessibilityId(productMinusButton_ai);
            minusButton.click();
            System.out.println("click product minus button");
        } catch (Exception exp) {
            System.out.println("\nclick product minus button ERROR " + exp.getCause());
            System.out.println("\nclick product minus button ERROR " + exp.getMessage());
        }
    }

    public void checkTableStatus(){
        utils.wait(3);
        try {
            getFooterViewText();
            if (FooterViewText.contains("0,00")){
                System.out.println("The table bill is empty");
            }else {
                getTableBillList();
            }
        }catch (Exception exp) {
            System.out.println("\ncheck table status ERROR " + exp.getCause());
            System.out.println("\ncheck table status ERROR " + exp.getMessage());
        }
    }

    public void addCokeToTable() {
        utils.wait(1);
        try {
            MobileElement coke;
            coke = utils.getElementByAccessibilityId(coke_ai);
            coke.click();
            System.out.println("order coke");
        } catch (Exception exp) {
            System.out.println("\norder coke ERROR " + exp.getCause());
            System.out.println("\norder coke ERROR " + exp.getMessage());
        }
    }

    public void addFoodToTable(String foodName) {
        utils.wait(1);
        try {
            MobileElement coke;
            coke = utils.getElementByAccessibilityId(foodName);
            coke.click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void addPizzaToTable() {
        try {
            MobileElement pizza;
            pizza = utils.getElementByAccessibilityId(pizza_ai);
            pizza.click();
            System.out.println("order pizza");
        } catch (Exception exp) {
            System.out.println("\nclick pizza ERROR " + exp.getCause());
            System.out.println("\nclick coke ERROR " + exp.getMessage());
        }
    }

    public void addBurgerToTable() {
        try {
            MobileElement burger;
            burger = utils.getElementByAccessibilityId(burger_ai);
            burger.click();
            System.out.println("order burger");
        } catch (Exception exp) {
            System.out.println("\norder burger ERROR " + exp.getCause());
            System.out.println("\norder burger ERROR " + exp.getMessage());
        }
    }

    public void clearTable() {
        try {
            getFooterViewText();
            if (FooterViewText.contains("0,00")){
                System.out.println("The table bill is empty");
                clickBackButton();
            }else {
                getTableBillList();
                clickClearTableButton();
                clickYesButton();
                clickAddToTableButton();
                System.out.println("Clear table done now table bill is empty");
            }
        } catch (Exception exp) {
            System.out.println("\nclear table ERROR " + exp.getCause());
            System.out.println("\nclear table ERROR " + exp.getMessage());
        }
    }

    public void clearSelectTable(int tableNumber) {
        selectTable(tableNumber);
        checkTable(tableNumber);
        clearTable();
    }

    public void getProductsListFromPopup() {
        FoodListPopup = utils.getProductsList(productsListPopup_xpath, "Food list from popup");
    }

    public void getCategoriesCollectionGridView() {
        CategoriesCollectionGridViewList = utils.getProductsList(categoriesCollectionView_xpath, "Categories");
    }

    public void getCategoriesCollectionListView() {
        CategoriesCollectionListViewList = utils.getProductsList(categoriesCollectionListView_xpath, "Categories");
    }

    public void getMenuListGridView() {
        MenuListGridViewList = utils.getProductsList(menuListGridView_xpath, "products from the menu");
    }

    public void getMenuListListView() {
        MenuListListViewList = utils.getProductsList(menuListListView_xpath, "products from the menu");
    }

    public void getTableBillList() {
        TableBillList = utils.getProductsList(billList_xpath, "products on the bill");
    }

    public void getFooterViewText() {
        FooterViewText = Arrays.toString(utils.getProductsList(footerViewText_xpath, "price items"));
    }

    public void getTableGridViewMenuList(int tableNumber) {
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        selectCategoryFromGridView(1);
        getMenuListGridView();
        selectCategoryFromGridView(2);
        getMenuListGridView();
        clickBackButton();
    }

    public void getTableListViewMenuList(int tableNumber) {
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        setProductsListView();
        getCategoriesCollectionListView();
        selectCategoryFromListView(0);
        getMenuListListView();
        clickBackButton();
        selectCategoryFromListView(1);
        getMenuListListView();
        clickBackButton();
        selectCategoryFromListView(2);
        getMenuListListView();
        clickBackButton();
        clickBackButton();
    }

    public void orderFoodFromGridView(int foodIndex) {
        try {
            MobileElement food;
            String foodName;
            foodName = MenuListGridViewList[foodIndex];
            food = utils.getElementByAccessibilityId(foodName);
            food.click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void orderFoodFromListView(int foodIndex) {
        try {
            MobileElement food;
            String foodName;
            foodName = MenuListListViewList[foodIndex];
            food = utils.getElementByAccessibilityId(foodName);
            food.click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void orderFoodFromPopup(int foodIndex) {
        try {
            MobileElement food;
            String foodName;
            foodName = FoodListPopup[foodIndex];
            food = utils.getElementByAccessibilityId(foodName);
            food.click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void selectCategoryFromListView(int categoryIndex) {
        try {
            MobileElement category;
            String categoryName;
            categoryName = CategoriesCollectionListViewList[categoryIndex];
            category = utils.getElementByAccessibilityId(categoryName);
            category.click();
            System.out.println("select category " + categoryName);
        } catch (Exception exp) {
            System.out.println("\nselect category ERROR " + exp.getCause());
            System.out.println("\nselect category ERROR " + exp.getMessage());
        }
    }

    public void selectCategoryFromGridView(int categoryIndex) {
        try {
            MobileElement category;
            String categoryName;
            categoryName = CategoriesCollectionGridViewList[categoryIndex];
            category = utils.getElementByAccessibilityId(categoryName);
            category.click();
            System.out.println("select category " + categoryName);
        } catch (Exception exp) {
            System.out.println("\nselect category ERROR " + exp.getCause());
            System.out.println("\nselect category ERROR " + exp.getMessage());
        }
    }

    public void setProductsGridView() {
        try {
            MobileElement gridViewButton;
            gridViewButton = utils.getElementByAccessibilityId(gridViewButton_ai);
            gridViewButton.click();
            System.out.println("Set products grid view");
        } catch (Exception exp) {
            System.out.println("\nSet products grid view ERROR " + exp.getCause());
            System.out.println("\nSet products grid view ERROR " + exp.getMessage());
        }
    }

    public void setProductsListView() {
        try {
            MobileElement gridViewButton;
            gridViewButton = utils.getElementByAccessibilityId(listViewButton_ai);
            gridViewButton.click();
            System.out.println("Set products list view");
        } catch (Exception exp) {
            System.out.println("\nSet products list view ERROR " + exp.getCause());
            System.out.println("\nSet products list view ERROR " + exp.getMessage());
        }
    }

    public void HomepageValidation() throws Exception {
        utils.wait(10);
        try {
            MobileElement homePageLocation;
            homePageLocation = utils.getElementByAccessibilityId(homepageLabel_ai);
            Boolean homePage = homePageLocation.isDisplayed();
            if (homePage == true) {
                System.out.println("Get homepage successfully");
            } else {
                System.out.println("Homepage validation fail");
            }
        } catch (Exception exp) {
            System.out.println("\nLogin homepage validation fail ERROR " + exp.getCause());
            System.out.println("\nLogin homepage validation fail ERROR " + exp.getMessage());
        }

    }

    }
