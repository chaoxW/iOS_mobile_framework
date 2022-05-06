package Mobile_Test;

import io.appium.java_client.MobileElement;
import Pages.TablePage;
import Pages.OrderPage;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.List;

public class TableClass extends Utils{

    Utils utils = new Utils();

    TablePage tablePage = new TablePage();

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

    public String[] arrMenu;
    public String[] arrBill;

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
        utils.wait(100);
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

    public String[] getTableBillList() {
        try {
            utils.wait(5);
            List<MobileElement> billList;
            billList = (List) utils.getElementsByXpath(billList_xpath);
            arrBill = new String[billList.size()];
            System.out.println("There are " + billList.size() + " items on the bill");
            int itemIndex = 0;
            for (MobileElement bill : billList) {
                String itemName = bill.getText();
                System.out.println("There is " + itemName + " on the bill");
                arrBill[itemIndex] = itemName;
                itemIndex++;
            }
            System.out.println("Table bill list contains " + Arrays.toString(arrBill));
            return arrBill;
        } catch (Exception exp) {
            System.out.println("\nGet table bill list ERROR " + exp.getCause());
            System.out.println("\nGet table bill list ERROR " + exp.getMessage());
        }
        return null;
    }


    public void checkTableStatus(){
        utils.wait(3);
        try {
            utils.wait(5);
            List<MobileElement> billList;
            billList = (List) utils.getElementsByXpath(billList_xpath);
            if (billList.size() == 0) {
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
            List<MobileElement> billList;
            billList = (List) utils.getElementsByXpath(billList_xpath);
            if (billList.size() == 0){
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

    public String[] getMenuListGridView() {
        try {
            utils.wait(5);
            List<MobileElement> menuList;
            menuList = (List) utils.getElementsByXpath(menuListGridView_xpath);
            arrMenu = new String[menuList.size()];
            System.out.println("There are " + menuList.size() + " items from the menu");
            int itemIndex = 0;
            for (MobileElement menu : menuList) {
                String itemName = menu.getText();
                System.out.println("There is " + itemName);
                arrMenu[itemIndex] = itemName;
                itemIndex++;
            }
            System.out.println("Menu contains " + Arrays.toString(arrMenu));
            return arrMenu;
        } catch (Exception e) {
            System.out.println("\nMenu list ERROR " + e.getCause());
            System.out.println("\nMenu list ERROR " + e.getMessage());
        }
        return null;
    }

    public String[] getMenuListListView() {
        try {
            utils.wait(5);
            List<MobileElement> menuList;
            menuList = (List) utils.getElementsByXpath(menuListListView_xpath);
            arrMenu = new String[menuList.size()];
            System.out.println("There are " + menuList.size() + " items from the menu");
            int itemIndex = 0;
            for (MobileElement menu : menuList) {
                String itemName = menu.getText();
                System.out.println("There is " + itemName);
                arrMenu[itemIndex] = itemName;
                itemIndex++;
            }
            System.out.println("Menu contains " + Arrays.toString(arrMenu));
            return arrMenu;
        } catch (Exception e) {
            System.out.println("\nMenu list ERROR " + e.getCause());
            System.out.println("\nMenu list ERROR " + e.getMessage());
        }
        return null;
    }

    public void getTableGridViewMenuList(int tableNumber) {
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        setProductsGridView();
        getMenuListGridView();
        clickBackButton();
    }

    public void getTableListViewMenuList(int tableNumber) {
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        setProductsListView();
        getMenuListListView();
        clickBackButton();
    }

    public void orderFood(int foodIndex) {
        try {
            MobileElement food;
            food = utils.getElementByAccessibilityId(arrMenu[foodIndex]);
            food.click();
            System.out.println("order " + arrMenu[foodIndex]);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
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

    }
