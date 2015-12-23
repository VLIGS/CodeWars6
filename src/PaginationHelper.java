import java.util.List;


public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    private List<I> myList;
    private int myItemsNumber;
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        myList = collection;
        myItemsNumber = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return myList.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double)itemCount()/(double)myItemsNumber);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if((pageIndex+1>pageCount())|| pageIndex<0){
            return -1;
        }
        else if (pageIndex+1==pageCount()) {
            return itemCount()%myItemsNumber;
        }
        else {
            return myItemsNumber;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return 0;
    }
}