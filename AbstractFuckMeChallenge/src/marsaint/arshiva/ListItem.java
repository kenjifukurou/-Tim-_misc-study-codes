package marsaint.arshiva;

public abstract class ListItem {

    protected ListItem leftListItem = null;
    protected ListItem rightListItem = null;

    protected Object objectValues;

    protected String textValues;
    protected int numberValues;

    public ListItem(Object objectValues, String textValues, int numberValues) {
        this.objectValues = objectValues;
        this.textValues = textValues;
        this.numberValues = numberValues;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareItem(ListItem item);


    public Object getObjectValues() {
        return objectValues;
    }

    public String getTextValues() {
        return textValues;
    }

    public int getNumberValues() {
        return numberValues;
    }

    public void setObjectValues(Object objectValues) {
        this.objectValues = objectValues;
    }

    public void setTextValues(String textValues) {
        this.textValues = textValues;
    }

    public void setNumberValues(int numberValues) {
        this.numberValues = numberValues;
    }
}
