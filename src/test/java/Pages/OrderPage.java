package Pages;

public class OrderPage {
    public String OrderCoke_AI = "Coke";
    public String OrderPizza_AI = "Pizza";
    public String OrderBurger_AI = "Burger";
    public String BackButton_XPATH = "//XCUIElementTypeButton[contains(@name, 'BACK')]";
    public String ClearTableButton_AI = "clearButton";
    public String TableVerification_AI = ", Very Long Restaurant Name";
    public String AddToTable_XPATH = "//XCUIElementTypeButton[@name=\"ADD TO TABLE\"]";
    public String YesButton_AI = "okButton";
    public String GridViewButton_AI = "productsGrid";
    public String ListViewButton_AI = "productsList";
    public String ProductPlusButton_AI = "icon product plus big";
    public String ProductMinusButton_AI = "icon product minus big";
    public String billList_XPATH = "//XCUIElementTypeTable[@name=\"Bill line items\"]/XCUIElementTypeCell/XCUIElementTypeStaticText";
    public String MenuListGridView_XPATH = "//XCUIElementTypeOther[@name=\"productCollectionView\"]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText";
    public String MenuListListView_XPATH = "//XCUIElementTypeOther[@name=\"productsListCollectionView\"]/XCUIElementTypeTable/XCUIElementTypeCell[@name=\"itemListCell\"]/XCUIElementTypeStaticText";
    public String CategoriesCollectionGridView_XPATH = "//XCUIElementTypeOther[@name=\"categoriesCollectionView\"]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText";
    public String CategoriesCollectionListView_XPATH = "//XCUIElementTypeOther[@name=\"productsListCollectionView\"]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText";
    public String ProductsListPopup_XPATH = "//XCUIElementTypeApplication[@name=\"Superb POS TEST\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText";
    public String FooterViewText_XPATH = "//XCUIElementTypeOther[@name=\"footerView\"]/XCUIElementTypeStaticText";
}
