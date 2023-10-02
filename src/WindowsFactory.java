// Concrete Factory
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public WindowsMenu createMenu() {
    	return new WindowsMenu();
    }
}
