package marsaint.arshiva;

public class Node extends ListItem {

    public Node(Object objectValues, String textValues, int numberValues) {
        super(objectValues, textValues, numberValues);
    }

    @Override
    ListItem next() {
        return this.rightListItem;
    }

    @Override
    ListItem setNext(ListItem newItem) {
        this.rightListItem = newItem;
        return newItem;
    }

    @Override
    ListItem previous() {
        return this.leftListItem;
    }

    @Override
    ListItem setPrevious(ListItem newItem) {
        this.leftListItem = newItem;
        return newItem;
    }

    @Override
    int compareItem(ListItem item) {
        if (item != null) {
            // compare object values only
            int result = ((String)super.getObjectValues()).compareTo((String)item.getObjectValues());

            //if -n, super go left, item go right
            //if +n, super go right, item go left

        }
    }
}
